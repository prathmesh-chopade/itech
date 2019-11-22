<%-- 
    Document   : Accdetails
    Created on : Nov 21, 2019, 3:23:40 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP details page</title>
    </head>
    <body>
        <%
        try{
        String accno=request.getParameter("ano");
        Connection con;
        Statement st;
        ResultSet rs;
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prac?user=root&password=Hydrogen");
        st=con.createStatement();
        rs=st.executeQuery("Select * from accdetail where accno='"+accno+"';");
        while(rs.next())
        {
            String name=rs.getString("accnm");
        String type=rs.getString("acctype");
            %>
            <h1>Name:<%=name%> </h1>
            <h1>Type:<%=type%></h1>
        <%
        }
        }
        catch(Exception e){out.println(e);}
        %>
    </body>
</html>
