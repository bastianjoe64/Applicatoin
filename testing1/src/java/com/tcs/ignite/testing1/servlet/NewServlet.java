/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.ignite.testing1.servlet;

import com.tcs.ignite.testing1.manager.registermanager;
import com.tcs.ignite.testing1.pojo.Login;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 1300089
 */
public class NewServlet extends HttpServlet {

  

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       PrintWriter out=response.getWriter();
       Login s1=new Login();
       String action=request.getParameter("action");
       if(action.trim().equals("register")){
          String email=request.getParameter("email");
          String password=request.getParameter("password");
          s1.setEmail(email);
          s1.setPassword(password);
          int a=new registermanager().register(s1);
          out.println(a);
       }
       
    }

  
}
