<%-- 
    Document   : signup
    Created on : 14 Oct 2021, 20:08:04
    Author     : anda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up Page</title>
    </head>
    <body>
        <form action="/AppSignup"> 
            <div>
                <label>Name: </label></br>
                <input type="text" name="name">
            </div> 
            </br>
            <div>
                <label>Surname: </label></br>
                <input type="text" name="surname">
            </div> 
            </br>
            <div>
                <label>Gender: </label></br>
                <input type="text" name="gender">
            </div> 
            </br>
            <div>
                <label>Email: </label></br>
                <input type="text" name="email">
            </div> 
            </br>
            <div>
                <label>Phone number: </label></br>
                <input type="text" name="number">
            </div> 
            </br>
            <input type="submit" value="Sign up">
        </form>
        </br>
    </body>
</html>
