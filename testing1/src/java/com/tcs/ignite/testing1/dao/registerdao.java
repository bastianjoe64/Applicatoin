/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.ignite.testing1.dao;

import com.tcs.ignite.testing1.pojo.Login;
import org.hibernate.Session;

/**
 *
 * @author 1300089
 */
public class registerdao {
    Session session=null;
    public registerdao(Session session){
        this.session=session;
    }
    public int register(Login s1){
        int a=0;
        try{
           a = (Integer) session.save(s1);
           session.beginTransaction().commit();
        
        }catch(Exception e){
        
        }
        return a;
    }
    
    
}
