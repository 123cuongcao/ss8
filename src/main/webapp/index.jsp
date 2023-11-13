<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<form action="/CalculatorServlet" method="get">
    <h1>Simple Calculator</h1>
    <label>First operand</label>
    <input type="text" name="FO">
    <label>Operator</label>
    <select name="operator">
        <option value="PLUS" selected>+</option>
        <option value="MINUS">-</option>
        <option value="MULTIPLY">*</option>
        <option value="DIVIDE">/</option>
    </select>
    <label>Second operand</label>
    <input type="text" name="SO">
    <input type="submit" >
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>