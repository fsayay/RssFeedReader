/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.so.rssfeedreader.bean;

import javax.inject.Named;
//import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author fabian
 */
@Named(value = "rssFeedReaderMB")
@RequestScoped
public class RssFeedReaderMB {

    /**
     * Creates a new instance of RssFeedReaderMB
     */
    public RssFeedReaderMB() {
    }
    
}
