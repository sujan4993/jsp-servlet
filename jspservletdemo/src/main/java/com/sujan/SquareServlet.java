package com.sujan;

import java.io.IOException;
import java.io.PrintWriter;
import static javafx.scene.input.KeyCode.K;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/square")
public class SquareServlet extends HttpServlet{
    
    public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException
    {
        int k = Integer.parseInt(req.getParameter("ans"));
        
        
      // uSing Dispatcher Servlet  
       // k = (Integer)req.getAttribute("ans");
        k = k*k;
        PrintWriter out = res.getWriter();
        out.println("Hello From  Square. Result is " +k);
    }
            
 
}