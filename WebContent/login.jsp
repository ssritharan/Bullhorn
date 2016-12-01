<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="Login" method="post" >
<p>Enter your Email: </p> <input type="text" name="email" id="email" > </input><br/>
<p>Enter your password: </p> <input type="text" name="password" id="password" > </input><br/>
<input type="hidden" name = "action" id="action" value = "login" > </input><br/>
<input type="submit" value="submit"> </input>
</form>

</body>
</html>