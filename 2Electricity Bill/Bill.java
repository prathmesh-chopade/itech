import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Bill"})
public class Bill extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String Name=request.getParameter("nm");
            int units=Integer.parseInt(request.getParameter("un"));
            int amount=0;
            if(units>400)
                amount=(units-400)*10+100*9+100*7+100*5+100*3;
            if(units>300)
                amount=(units-300)*9+100*7+100*5+100*3;
            if(units>200)
                amount=(units-200)*7+100*5+100*3;
            if(units>100)
                amount=(units-100)*5+100*3;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Bill</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hi "+Name+"</h1>");
            out.println("<h1>Your electricity bill amount is "+amount+" Rs</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


}
