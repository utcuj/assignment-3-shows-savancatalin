
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
    <title>Filme</title>
</head>
<body>
<table id="clients">
    <caption><h3>Filme</h3></caption>
    <div class="topnav">
    <a href="/shows-1/usernormal">Home</a>
    <a href="/shows-1/userfilms">View Filme</a>
    <a href="/shows-1/addComentari">Add Comentariu</a>
    <a href="/shows-1/comentari">View Comentari</a>
    <a class="active"  href="/shows-1/usertipfilms">View Film types</a>
    <a href="/shows-1/login">Log out</a>
    </div>
    <tr>
        <th>idfilmtip</th>
        <th>tip</th>
    </tr>
    <tbody>
    <c:forEach items="${usertipfilms}" var="film">
        <tr id="data">
        
            <td>${film.idfilmtip}</td>
            <td>${film.tip}</td>


        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>