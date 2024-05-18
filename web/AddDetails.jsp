<%-- 
    Document   : AddDetails
    Created on : 30-Mar-2024, 10:23:07 pm
    Author     : sharm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/AddDetails.css">
    </head>
    <body>
       <div class="maindiv">
       
            <div class="container">
                <div><h1>Add Details</h1></div>
                <form action="AddDetails" method="post">
                    <input type="text" name="sid" placeholder="Enter Student ID." required>
                    <input type="text" name="fname" placeholder="Enter First Name" required>
                    <input type="text" name="lname" placeholder="Enter Last Name">
                    <input type="text" name="email" placeholder="Enter Mail ID" required>
                    <input type="text" name="phone" placeholder="Enter Contact No." required>
                   
                    <button>Submit</button>
                </form>
            </div>
       </div>
    </body>
</html>
