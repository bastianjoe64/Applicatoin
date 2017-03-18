/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.ignite.testing1.manager;

import com.tcs.ignite.testing1.dao.registerdao;
import com.tcs.ignite.testing1.pojo.Login;
import com.tcs.ignite.testing1.util.NewHibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author 1300089
 */
public class registermanager {
    Session session=null;
    public registermanager(){
     this.session=NewHibernateUtil.getSessionFactory().openSession();
   
    }
      public int register(Login s1){
         int i=0;
         try{
             i=new registerdao(session).register(s1);
         }
         catch(Exception e){
         }
         finally{
             session.close();
         }
         return i;
     }
    
}
