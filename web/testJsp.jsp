<%--
  Created by IntelliJ IDEA.
  User: dp
  Date: 09.07.20
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <p>

        <%@ page import="java.util.Date, logic.TestClass" %>

        <%--<% String name = request.getParameter("name"); %>--%>

        <%--<p> <%= "Hello, " + name%> <p>--%>

        <% TestClass testClass = new TestClass(); %>

        <%=
            testClass.getInfo()
        %>


    </p>
</body>
</html>
