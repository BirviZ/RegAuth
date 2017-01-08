<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="example.resourses.Strings"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title><%= Strings.title %></title>
</head>
<body>
	<div class="form">
		<form action="check" method="post">
			<h2>Register</h2>
			<table>
				<tr>
					<td>
						Log in:
					</td>
					<td>
						<input type="text" size="10" name="login">
					</td>
				</tr>
				<tr>
					<td>
						Password:
					</td>
					<td>
						<input type="password" size="10" name="password">
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="Submit">
					</td>
					<td>
						<input type="reset" value="Reset">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>