<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
</head>
<body>
Hello, Jimmy!<br/>
<form action="memo" method="post">
	<table>
		<tr>
			<td>Title</td>
			<td><input type="text" name="title"/></td>
		</tr>
		<tr>
			<td>Amount</td>
			<td><input type="text" name="amount"/></td>
		</tr>
		<tr>
			<td>Remark</td>
			<td><input type="text" name="remark"/></td>
		</tr>
	</table>
	<input type="submit"/>
</form>
</body>
</html>