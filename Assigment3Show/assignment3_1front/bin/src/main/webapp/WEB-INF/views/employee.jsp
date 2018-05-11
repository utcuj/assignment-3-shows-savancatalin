<%--
  Created by IntelliJ IDEA.
  User: Pocol
  Date: 4/12/2018
  Time: 9:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .topnav {
            background-color: #333;
            overflow: hidden;
        }

        /* Style the links inside the navigation bar */
        .topnav a {
            float: left;
            color: #f2f2f2;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
            font-size: 17px;
        }

        /* Change the color of links on hover */
        .topnav a:hover {
            background-color: #ddd;
            color: black;
        }

        /* Add a color to the active/current link */
        .topnav a.active {
            background-color: #4CAF50;
            color: white;
        }

        h1 {
            text-align: center;
        }
    </style>
    <title>Admin</title>
</head>
<body>
<div class="topnav">
    <a class="active" href="/pharmacy-1/employee">Home</a>
    <a href="/pharmacy-1/employeeViewMedications">View Medications</a>
    <a href="/pharmacy-1/login">Log out</a>
</div>
<h1>
    Pharmacy management
</h1>
</body>
</html>
