/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sujan;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sujan
 */
@WebServlet("/login")
public class LoginCheck extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String uname = request.getParameter("username");
        String pass = request.getParameter("password");
        
        if(uname.equals("sujan") && pass.equals("sujan"))
        {
            HttpSession session = request.getSession();
            session.setAttribute("username", uname);
            response.sendRedirect("welcome.jsp");
        }
        else 
        {
        response.sendRedirect("login.jsp");
         }
        
    }

  
}
