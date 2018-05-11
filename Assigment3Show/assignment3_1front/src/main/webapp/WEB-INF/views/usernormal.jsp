
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
    <title>User</title>
</head>
<body>
<div class="topnav">
    <a class="active" href="/shows-1/usernormal">Home</a>
    <a href="/shows-1/userfilms">View Filme</a>
    <a href="/shows-1/addComentari">Add Comentariu</a>
    <a href="/shows-1/comentari">View Comentari</a>
        <a href="/shows-1/usertipfilms">View Film types</a>
    <a href="/shows-1/login">Log out</a>
</div>
<h1>
    User Interface
</h1>
</body>
</html>
