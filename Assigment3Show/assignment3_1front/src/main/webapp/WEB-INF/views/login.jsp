
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        input[type=text], select {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=password], select {
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

        div {
            border-radius: 5px;
            background-color: #ddd;
            padding: 100px;
            margin-left: 450px;
            margin-right: 450px;
        }
    </style>
    <title>Log in</title>
</head>
<body>
<div>
    <form method="post" action="/shows-1/login"/>
    <p>
        Username: <br>
        <input type="text" id="username" name="username"/>
    </p>
    <p>
        Password: <br>
        <input type="password" id="password" name="password"/>
    </p>
    <p>
        <input type="submit" id="login" name="login" value="Log in"/>
    </p>
    </form>
</div>
</body>
</html>
