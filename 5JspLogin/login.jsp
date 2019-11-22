<%-- 
    Document   : login
    Created on : Nov 21, 2019, 2:45:14 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Login</title>
    </head>
    <body>
        <%
            try{
            String unm=request.getParameter("un");
            String pwd=request.getParameter("pw");
            Connection con;
            Statement st;
            ResultSet rs;
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prac?user=root&password=Hydrogen");
            st=con.createStatement();
            rs=st.executeQuery("select * from login where usernm='"+unm+"'and password='"+pwd+"';");
            if(rs.next())
            {%><h1>Welcome <%=unm%></h1><%}
            else
            {%><h1>Failed</h1><%}
            }
            catch(Exception e){out.println(e);}
            %>
    </body>
</html> 
