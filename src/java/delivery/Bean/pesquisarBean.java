/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery.Bean;

/**
 *
 * @author Juninho
 */

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
@ManagedBean
public class pesquisarBean {
       
    private String keyword;
 
    public String getKeyword() {
        return keyword;
    }
 
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
     
    public void search() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"No results found with ", "'" + keyword + "'"));
    }
    
}
