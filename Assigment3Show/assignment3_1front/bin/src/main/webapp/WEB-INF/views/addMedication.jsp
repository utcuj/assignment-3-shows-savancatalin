<%--
  Created by IntelliJ IDEA.
  User: Pocol
  Date: 4/19/2018
  Time: 11:56 AM
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
<title>Add Medication</title>
</head>
<body>
<div class="topnav">
    <a href="/pharmacy-1/admin">Home</a>
    <a  href="/pharmacy-1/addUser">Add User</a>
    <a href="/pharmacy-1/users">View Users</a>
    <a class="active" href="/pharmacy-1/addMedication">Add Medication</a>
    <a href="/pharmacy-1/viewMedications">View Medications</a>
    <a href="/pharmacy-1/login">Log out</a>
</div>
<div class="form">
    <form method="post" action="/pharmacy-1/addMedication">
        <p>
            Name: <br>
            <input type="text" id="name" name="name" required/>
        </p>
        <p>
            Manufacturer: <br>
            <input type="text" id="manufacturer" name="manufacturer" required/>
        </p>
        <p>
            Ingredients: <br>
            <input type="text" id="ingredients" name="ingredients" required/>
        </p>
        <p>
            Price: <br>
            <input type="number" id="price" name="price" min="0" required/>
        </p>
        <p>
            Quantity: <br>
            <input type="text" id="quantity" name="quantity" min="0" required/>
        </p>
        <p>
            <input type="submit" name="addMedication" value="Add medication">
        </p>
    </form>
</div>
</body>
</html>
