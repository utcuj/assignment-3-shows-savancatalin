
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
    <a href="/shows-1/addFilm">Add Film</a>
    <a href="/shows-1/films">View Film</a>
        <a  href="/shows-1/tipfilms">View Film types</a>
    <a href="/shows-1/login">Log out</a>
</div>
<div class="form">
    <form method="post" action="/shows-1/addUser">
        <p>
            Nume: <br>
            <input type="text" id="nume" name="nume" required/>
        </p>
        <p>
            Prenume: <br>
            <input type="text" id="prenume" name="prenume" required/>
        </p>
        <p>
            Username: <br>
            <input type="text" id="username" name="username" required/>
        </p>
        <p>
            Password: <br>
            <input type="text" id="password" name="password" required/>
        </p>
        <p>
            Type: <br>
            <input type="text" id="type" name="type" required/>
        </p>
        <p>
            <input type="submit" name="addUser" value="Add user">
        </p>
    </form>
</div>
</body>
</html>
