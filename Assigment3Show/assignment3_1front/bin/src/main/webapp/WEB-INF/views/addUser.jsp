<%--
  Created by IntelliJ IDEA.
  User: Pocol
  Date: 4/12/2018
  Time: 10:40 PM
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

        input[type=text], select {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=number], select {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=submit] {
            width: 100%;
            background-color: #333333;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            -webkit-transition-duration: 0.4s;
            transition-duration: 0.4s;
        }

        input[type=submit]:hover {
            background-color: #ffffff;
            color: black;
        }

        .form {
            border-radius: 5px;
            background-color: #ddd;
            padding: 100px;
            margin-left: 450px;
            margin-right: 450px;
        }
    </style>
    <title>Add User</title>
</head>
<body>
<div class="topnav">
    <a href="/shows-1/admin">Home</a>
    <a class="active" href="/shows-1/addUser">Add User</a>
    <a href="/shows-1/users">View Users</a>
    <a href="/shows-1/addShow">Add Shows</a>
    <a href="/shows1/viewShows">View Shows</a>
    <a href="/shows-1/login">Log out</a>
</div>
<div class="form">
    <form method="post" action="/shows-1/addUser">
        <p>
            Name: <br>
            <input type="text" id="name" name="name" required/>
        </p>
        <p>
            Password: <br>
            <input type="text" id="password" name="password" required/>
        </p>
        <p>
            Permission: <br>
            <select name="permission" id="permission">
                <option value="0">Admin</option>
                <option value="1">Premium</option>
                <option value="2">Basic</option>
            </select>
        </p>
        <p>
            <input type="submit" name="addUser" value="Add user">
        </p>
    </form>
</div>
</body>
</html>
