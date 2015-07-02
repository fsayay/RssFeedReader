package com.so.rssfeedreader.bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author fabian
 */
@Named(value = "sessionMB")
@RequestScoped
public class sessionMB {

    private String user;
    private String urlImage;
    private final HttpServletRequest httpServletRequest;
    private final FacesContext facesContext;
    private FacesMessage facesMessage;
    
    public sessionMB() {
        facesContext=FacesContext.getCurrentInstance();
        httpServletRequest=(HttpServletRequest)facesContext.getExternalContext().getRequest();
        if(httpServletRequest.getSession().getAttribute("sessionUser")!=null){
            user = httpServletRequest.getSession().getAttribute("sessionUser").toString();
            if(user=="fsayay"){
                this.urlImage = "images/fabian.jpg";
            }
        }
    }
    
    public String logout(){
        httpServletRequest.getSession().removeAttribute("sessionUser");
        return "index";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
    
    
}
