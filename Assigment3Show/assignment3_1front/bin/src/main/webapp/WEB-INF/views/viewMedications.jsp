<%--
  Created by IntelliJ IDEA.
  User: Pocol
  Date: 4/19/2018
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Medications </title>
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
    <caption><h3>MEDICATIONS</h3></caption>
    <div class="topnav">
        <a href="/pharmacy-1/admin">Home</a>
        <a href="/pharmacy-1/addUser">Add User</a>
        <a href="/pharmacy-1/users">View Users</a>
        <a href="/pharmacy-1/addShow">Add Show</a>
        <a class="active" href="/pharmacy-1/viewShows">View Shows</a>
        <a href="/shows-1/login">Log out</a>
    </div>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Manufacturer</th>
        <th>Ingredients</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Actions</th>
    </tr>
    <tbody>
    <c:forEach items="${medications}" var="medication">
        <tr id="data">
            <td>${medication.ID}</td>
            <td>${medication.name}</td>
            <td>${medication.manufacturer}</td>
            <td>${medication.ingredients}</td>
            <td>${medication.price}</td>
            <td>${medication.quantity}</td>
            <td>
                <table>
                    <tr>
                        <form action="/pharmacy-1/editMedication/${medication.ID}" method="get">
                            <button class="button" type="submit" id="edit" name="edit">Edit</button>
                        </form>
                    </tr>
                    <tr>
                        <form action="/pharmacy-1/deleteMedication/${medication.ID}" method="post">
                            <button class="button" type="submit" id="delete" name="delete">Delete</button>
                        </form>
                    </tr>
                    <tr>
                        <form action="/pharmacy-1/sellMedication/${medication.ID}" method="post">
                            <input type="number" name="quantity" id="quantity" min="0" max="${medication.quantity}">
                            <button class="button" type="submit" id="sell" name="sell">Sell</button>
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