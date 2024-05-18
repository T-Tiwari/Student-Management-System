<%-- 
    Document   : ReadDetails
    Created on : 31-Mar-2024, 4:18:09 pm
    Author     : sharm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/ReadDetails.css">
    </head>
    <body>
        <div class="maindiv">
       
            <div class="container">
                <div><h1>Get Details</h1></div>
                <form action="ReadDetails" method="post">
                    <input type="text" name="sid" placeholder="Enter Student ID.">
                    
                    <button>Get</button>
                </form>
            </div>
       </div>
    </body>
</html>
