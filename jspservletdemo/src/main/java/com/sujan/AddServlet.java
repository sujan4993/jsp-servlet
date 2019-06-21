/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sujan;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sujan
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException
    {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        
        int k = i+j;
      
        res.sendRedirect("square?ans="+k);
        
//        PrintWriter out = res.getWriter();
//        out.println("Result is " +k);
        
        //Request Dispatcher
//           req.setAttribute("ans", k);
//        
//        RequestDispatcher rd = req.getRequestDispatcher("square");
//        rd.forward(req,res);
// 
    }
    
   
}
