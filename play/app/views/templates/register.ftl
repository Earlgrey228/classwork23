<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Register</h1>
<form method="post" action="@routes.HomeController.register()">
    <label for="username">Username:</label>
    <input type="text" name="username" id="username" required><br>
    <label for="password">Password:</label>
    <input type="password" name="password" id="password" required><br>
    <button type="submit">Register</button>
</form>
</body>
</html>