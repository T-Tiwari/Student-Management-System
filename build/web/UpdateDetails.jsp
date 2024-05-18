<%-- 
    Document   : UpdateDetails
    Created on : 31-Mar-2024, 2:31:29 pm
    Author     : sharm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/UpdateDetails.css">
    </head>
    <body>
         <div class="maindiv">
       
            <div class="container">
                <div><h1>Update Details</h1></div>
                <form action="UpdateDetails" method="post">
                    <input type="text" name="sid" placeholder="Enter Student ID.">
                    <input type="text" name="fname" placeholder="Enter First Name">
                    <input type="text" name="lname" placeholder="Enter Last Name">
                    <input type="text" name="email" placeholder="Enter Mail ID">
                    <input type="text" name="phone" placeholder="Enter Contact No.">
                   
                    <button>Update</button>
                </form>
            </div>
       </div>
    </body>
</html>
