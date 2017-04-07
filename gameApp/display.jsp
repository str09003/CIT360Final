<%-- 
    Document   : display
    Created on : Apr 5, 2017, 8:35:52 PM
    Author     : Trestles
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trestle's Game Suggestions</title>
    </head>
    <body>
        <jsp:useBean id="bean1" scope="request" class="beans.PlayerBean"/>
        <h1>Thank you!</h1>
        <h3>Your information has been submitted!</h3>       
            <table border="1">
              <tbody>
            <tr>
                <th>First Name: </th>
                <th><jsp:getProperty name="bean1" property="first"/></th>
            </tr>
            <tr>
                <th>Last Name: </th>
                <th><jsp:getProperty name="bean1" property="last"/></th>
            </tr>
            <tr>
                <th>Email Address: </th>
                <th><jsp:getProperty name="bean1" property="email"/></th>
            </tr>
            <tr>
                <th>Rating: </th>
                <th><jsp:getProperty name="bean1" property="rating"/></th>
            </tr>
            <tr>
                <th>Comments</th>
                <th><jsp:getProperty name="bean1" property="comments"/></th>
            </tr>
            </table>

  
            
    </body>
</html>
