<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>formtest</title>
</head>
<body>
	<form action="/webex02/param" method="post">
	<!-- text/radio/select/textarea/password/checkbox ....  -->
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>PW</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td>GENDER</td>
				<td>
					<input type="radio" name="gender" value="MALE">MALE
					<input type="radio" name="gender" value="FEMALE">FEMALE
				</td>
			</tr>
			<tr>
				<td>COUNTRY</td>
				<td>
					<select name="country">
						<option>KOREA</option>
						<option>JAPAN</option>
						<option>CHINA</option>
						<option>USA</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>HOBBY</td>
				<td>
					<input type="checkbox" name="hobby" value="READING">READING	
					<input type="checkbox" name="hobby" value="WRITING">WRITING	
					<input type="checkbox" name="hobby" value="DOING SPORTS">DOING SPORTS	
					<input type="checkbox" name="hobby" value="SHOPPING">SHOPPING	
					<input type="checkbox" name="hobby" value="WEB SURFING">WEB SURFING
				</td>
			</tr>
			<tr>
				<td>COMMENT</td>
				<td>
					<textarea name="comment" rows="5" cols="80"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="JOIN">
					<input type="reset" value="RESET">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>