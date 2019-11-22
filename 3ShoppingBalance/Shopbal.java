import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet(urlPatterns = {"/Shopbal"})
public class Shopbal extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String uid=request.getParameter("uid");
        double amount=Integer.parseInt(request.getParameter("amt"));
                try{
            Connection con;
            PreparedStatement st;
            ResultSet rs;
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prac?user=root&password=Hydrogen&useSSL=false");
            st=con.prepareStatement("select * from shopping where userid=?;");
            st.setString(1, uid);
            rs=st.executeQuery();
            if(rs.next()){
            if(rs.getString("usertype")=="regular")
                amount=0.92*amount;
            if(rs.getString("usertype")=="member")
                amount=0.87*amount;
            else
                amount=0.95*amount;
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Shopbal</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>your net balance is: " + amount + " Rs</h1>");
            out.println("</body>");
            out.println("</html>");
        }
                catch(Exception e)
                {
                    out.println(e);
                }
    }


}
