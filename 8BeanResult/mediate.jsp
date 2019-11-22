<%-- 
    Document   : mediate
    Created on : Nov 21, 2019, 3:51:03 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="id" class="mybeans.Bean"></jsp:useBean>
        <%
        String name=request.getParameter("nm");
        int marks=Integer.parseInt(request.getParameter("mk"));
        %>
        <jsp:setProperty property="marks" name="id" value="<%=marks%>"></jsp:setProperty>
        <h1>Student marks: <%=marks%></h1>
        Result : <jsp:getProperty property="result" name="id"></jsp:getProperty>
    </body>
</html>
