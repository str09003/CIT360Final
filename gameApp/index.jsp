<%-- 
    Document   : index
    Created on : Apr 5, 2017, 7:25:16 PM
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
        <h1>Leave Us Your Suggestion!</h1>
        <h3>Your Information</h3>
        <form name="thankyou" action="display.jsp" method="POST">
            <table border="0">
                </thead>
                <tbody>
                    <tr>
                        <td>First Name: </td>
                        <td><input type="text" name="first" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Last Name: </td>
                        <td><input type="text" name="last" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Email: </td>
                        <td><input type="text" name="email" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Rating: </td>
                        <td><select name="rating">
                                <option>5 Star</option>
                                <option>4 Star</option>
                                <option>3 Star</option>
                                <option>2 Star</option>
                                <option>1 Star</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Comments: </td>
                        <td><textarea name="comments" rows="7" cols="15">
                            </textarea></td>
                    </tr>
                </tbody>
            </table>         
                <input type="reset" value="Discard" />
                <input type="submit" value="Submit" />   
        </form>
        
    </body>
</html>
