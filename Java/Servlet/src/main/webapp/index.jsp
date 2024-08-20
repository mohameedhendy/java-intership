<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h2>Welcome to my Web Application with servlet&JSP</h2>

    <!-- Button to redirect to the factorial page -->
    <form action="factorial" method="get">
        <input type="submit" value="Go to Factorial Page">
    </form>

    <!-- Button to redirect to the calculate age page -->
    <form action="calculateAge.jsp" method="get">
        <input type="submit" value="Go to Calculate Age Page">
    </form>
</body>
</html>
