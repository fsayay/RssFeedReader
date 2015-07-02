/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.so.rssfeedreader.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author fabian
 */
@Named(value = "userMB")
@RequestScoped
@ManagedBean
public class userMB {
    private String name;
    private String user;
    private String pass;
    private String urlImage;
    private final HttpServletRequest httpServletRequest;
    private final FacesContext facesContext;
    private FacesMessage facesMessage;

    /**
     * Creates a new instance of userMB
     */
    public userMB() {
        facesContext=FacesContext.getCurrentInstance();
        httpServletRequest=(HttpServletRequest)facesContext.getExternalContext().getRequest();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }    
    
    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
    
    public String login(){
        if(user.equals("fsayay") && pass.equals("fabian")){
            httpServletRequest.getSession().setAttribute("sessionUser", user);
            return "reader";
        }else{
            facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR, "User or Password incorrect",null);
            facesContext.addMessage(null,facesMessage);
            return "index";
        }
    }
}
