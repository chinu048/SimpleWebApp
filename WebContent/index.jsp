<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

int val1 = Integer.parseInt(request.getParameter("num1"));
int val2 = Integer.parseInt(request.getParameter("num2"));

char c = request.getParameter("op").charAt(0);

int ans = 0;
switch(c) {
case '+':
	ans = val1 + val2;
	break;
case '-':
	ans = val1 - val2;
	break;
case '*':
	ans = val1 * val2;
	break;
case '/':
	if(val2 == 0) {
		out.println("Cannot divide by 0");
		return;
	}
	ans = val1 / val2;
	break;
default:		
	out.println("Invalid operation");
	return;
}
out.println("Answer is " + ans);
%>
</body>
</html>