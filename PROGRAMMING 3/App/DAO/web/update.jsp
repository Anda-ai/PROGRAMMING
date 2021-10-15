<%-- 
    Document   : update
    Created on : 14 Oct 2021, 20:08:29
    Author     : anda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Login Page</title>
    </head>
    <body>
        <form action="/updateAppLogin"> 
            <div>
                <label>Email: </label></br>
                <input type="text" name="email">
            </div> 
            </br>
            <div>
                <label>Username: </label></br>
                <input type="text" name="username">
            </div> 
            </br>
            <div>
                <label>Password: </label></br> 
                <input type="text" name="password">
            </div> 
            </br>
            <input type="submit" value="Update">
        </form>
    </body>
</html>
