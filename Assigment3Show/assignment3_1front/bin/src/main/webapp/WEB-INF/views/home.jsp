<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
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
    <title>Home</title>
</head>
<body>

<div class="topnav">
    <a class="active" href="/pharmacy-1/home">Home</a>
    <a href="/pharmacy-1/addClient">Add Client</a>
    <a href="/pharmacy-1/addHoliday">Add Holiday</a>
    <a href="/pharmacy-1/clients">View Clients</a>
    <a href="/pharmacy-1/holidays">View Holidays</a>
    <a href="/pharmacy-1/missedPayments">View Missed Payments</a>
    <a href="/pharmacy-1/login">Log out</a>
</div>
<h1>
    Pharmacy management
</h1>
</body>
</html>
