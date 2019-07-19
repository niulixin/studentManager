<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	您好，欢迎使用学生管理系统！
	<form method="post" action="login.do">
		用户名： <input type="text"  name="username"  /> <br />
		密码：<input type="text"  name="password"  />  <br />
		<input type="submit"  value="登录"/>
	</form>
	<a href="register.jsp">立即注册</a>
</body>
</html>