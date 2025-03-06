<%--
  Created by IntelliJ IDEA.
  User: 王轩
  Date: 2025/3/6
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New User Registration</title>
    <!-- 引入 jQuery -->
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
<h1>New User Registration!</h1>
<form id="registerForm" onsubmit="return validateForm()">
    <!-- 用户名 -->
    <label for="username">Username:</label>
    <input type="text" id="username" name="username">
    <span id="usernameError" style="color:red"></span><br>

    <!-- 密码 -->
    <label for="password">Password:</label>
    <input type="password" id="password" name="password">
    <span id="passwordError" style="color:red"></span><br>

    <!-- 邮箱 -->
    <label for="email">Email:</label>
    <input type="text" id="email" name="email">
    <span id="emailError" style="color:red"></span><br>

    <!-- 性别（单选按钮） -->
    <label>Gender:</label>
    <input type="radio" name="gender" value="male"> Male
    <input type="radio" name="gender" value="female"> Female
    <span id="genderError" style="color:red"></span><br>

    <!-- 出生日期 -->
    <label for="birthdate">Date of Birth (yyyy-dd-mm):</label>
    <input type="text" id="birthdate" name="birthdate">
    <span id="birthdateError" style="color:red"></span><br>

    <!-- 提交按钮 -->
    <input type="submit" value="Register">
</form>

<script>
    function validateForm() {
        let isValid = true;

        // 用户名验证（必填）
        const username = $("#username").val();
        if (!username) {
            $("#usernameError").text("Username is required!");
            isValid = false;
        } else {
            $("#usernameError").text("");
        }

        // 密码验证（至少8位）
        const password = $("#password").val();
        if (!password) {
            $("#passwordError").text("Password is required!");
            isValid = false;
        } else if (password.length < 8) {
            $("#passwordError").text("Password must be at least 8 characters!");
            isValid = false;
        } else {
            $("#passwordError").text("");
        }

        // 邮箱验证（格式）
        const email = $("#email").val();
        const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
        if (!email) {
            $("#emailError").text("Email is required!");
            isValid = false;
        } else if (!emailRegex.test(email)) {
            $("#emailError").text("Invalid email format!");
            isValid = false;
        } else {
            $("#emailError").text("");
        }

        // 性别验证（必选）
        const gender = $("input[name='gender']:checked").val();
        if (!gender) {
            $("#genderError").text("Gender is required!");
            isValid = false;
        } else {
            $("#genderError").text("");
        }

        // 出生日期验证（yyyy-dd-mm格式）
        const birthdate = $("#birthdate").val();
        const dateRegex = /^\d{4}-\d{2}-\d{2}$/;
        if (!birthdate) {
            $("#birthdateError").text("Birthdate is required!");
            isValid = false;
        } else if (!dateRegex.test(birthdate)) {
            $("#birthdateError").text("Format must be yyyy-dd-mm!");
            isValid = false;
        } else {
            $("#birthdateError").text("");
        }

        return isValid;
    }
</script>
</body>
</html>
