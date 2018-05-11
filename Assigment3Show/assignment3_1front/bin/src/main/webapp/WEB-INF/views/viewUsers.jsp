<%--
  Created by IntelliJ IDEA.
  User: Pocol
  Date: 4/12/2018
  Time: 10:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

        #clients {
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        #clients td, #clients th {
            border: 1px solid #ddd;
            padding: 8px;
        }

        #clients tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        #clients tr:hover {
            background-color: #ddd;
        }

        #clients th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #333333;
            color: white;
        }

        .button {
            background-color: #333333;
            border-radius: 4px;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            margin: 4px 4px;
            cursor: pointer;
        }

        .button:hover {
            background-color: #ffffff;
            color: black;

        }

        .button {
            -webkit-transition-duration: 0.4s; /* Safari */
            transition-duration: 0.4s;
        }
    </style>
    <title>Users</title>
</head>
<body>
<table id="clients">
    <caption><h3>USERS</h3></caption>
    <div class="topnav">
        <a href="/shows-1/admin">Home</a>
        <a href="/shows-1/addUser">Add User</a>
        <a class="active" href="/shows-1/users">View Users</a>
        <a href="/shows-1/addShow">Add Show</a>
        <a href="/shows-1/viewShows">View Shows</a>
        <a href="/shows-1/login">Log out</a>
    </div>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Permission</th>
        <th>Actions</th>
    </tr>
    <tbody>
    <c:forEach items="${users}" var="user">
        <tr id="data">
            <td>${user.ID}</td>
            <td>${user.name}</td>
            <td>${user.permission}</td>
            <td>
                <table>
                    <tr>
                        <form action="/shows-1/editUser/${user.ID}" method="get">
                            <button class="button" type="submit" id="edit" name="edit">Edit</button>
                        </form>
                    </tr>
                    <tr>
                        <form action="/shows-1/delete/${user.ID}" method="post">
                            <button class="button" type="submit" id="delete" name="delete">Delete</button>
                        </form>
                    </tr>
                </table>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>