<%@ page contentType="text/html; utf-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Авторизация</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body style="padding: 10px 10px 10px 10px">
<h4>Авторизация:</h4>
<form method="post" action="/main" accept-charset="UTF-8">
    <input type="text" name="clientname"><br>
    <input type="password" name="password"><br>
    <input type="submit" value="Авторизация">
</form>
</body>
</html>
