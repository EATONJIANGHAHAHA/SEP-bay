<%-- 
    Document   : login
    Created on : 27-Aug-2017, 13:16:42
    Author     : lzy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login </h1>
        <form action="welcome" method="post" >
            <input type="text" name="username" />
            <input type="password" name="password" />
            <input type="submit" value="submit" />
        </form>
    </body>
</html>
