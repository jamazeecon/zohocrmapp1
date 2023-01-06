<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create | Lead </title>
		
</head>
<body>
	<form action="updates" method="post">
		<pre>
				<input type="hidden" name="id"	value="${leads.id }"/>
			firstName<input type="text" name="firstName" value="${leads.firstName }"/>
			lastName<input type="text" name="lastName"  value="${leads.lastName }"/>
			emailId<input type="text" name="email"  value="${leads.email }"/>
			mobile<input type="number" name="mobile"  value="${leads.mobile }"/>
			<input type="submit" value="save"/>
		
		</pre>
		
		</form>
		${msg}

</body>
</html>