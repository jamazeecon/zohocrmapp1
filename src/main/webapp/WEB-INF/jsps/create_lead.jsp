<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create | Lead </title>
		
</head>
<body>
	<form action="save_lead" method="post">
		<pre>
					
			firstName<input type="text" name="firstName"/>
			lastName<input type="text" name="lastName"/>
			emailId<input type="text" name="email"/>
			mobile<input type="number" name="mobile"/>
			<input type="submit" value="save"/>
		
		</pre>
		
		</form>
		${msg}

</body>
</html>