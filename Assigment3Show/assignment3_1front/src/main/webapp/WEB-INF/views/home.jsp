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
    <a class="active"  href="/shows-1/admin">Home</a>
    <a href="/shows-1/addUser">Add User</a>
    <a href="/shows-1/users">View Users</a>
    <a href="/shows-1/addFilm">Add Film</a>
    <a href="/shows-1/films">View Film</a>
        <a  href="/shows-1/tipfilms">View Film types</a>
    <a href="/shows-1/login">Log out</a>
</div>
<h1>
    Pharmacy management
</h1>
</body>
</html>
