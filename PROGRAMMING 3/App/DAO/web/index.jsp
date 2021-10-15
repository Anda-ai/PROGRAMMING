<%-- 
    Document   : index
    Created on : 14 Oct 2021, 20:07:40
    Author     : anda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign in Page</title>
    </head>
    <body>
        <form action="/AppLogin">
            <div>
                <label>Username: </label>
                </br>
                <input type = "text" name="username" placeholder="password">
            </div> 
            </br>
            <div>
                <label>Password: </label></br>
                <input type = "text" name="password">
            </div> 
            </br>
            <input type="submit" value="login">
        </form>
        <page-link>
            <a href="signup.jsp">Sign up</a>
        </page-link>
        </br>
        <page-link>
            <a href="update.jsp">Update</a>
        </page-link>
        </br>
    </body>
</html>
