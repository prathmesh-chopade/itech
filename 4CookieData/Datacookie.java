/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns = {"/Datacookie"})
public class Datacookie extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{
            /* TODO output your page here. You may use following sample code. */
            PrintWriter out = response.getWriter();
            String fnm=request.getParameter("fn");
            String lnm=request.getParameter("ln");
            String cnm=request.getParameter("cn");
            Cookie c1=new Cookie("First Name",fnm);
            Cookie c2=new Cookie("Last Name",lnm);
            Cookie c3=new Cookie("City Name",cnm);
            response.addCookie(c1);
            response.addCookie(c2);
            response.addCookie(c3);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Datacookie</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<a href='Getcookie'>Retrive Cookie data</a>");
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception e){}
    }


}
