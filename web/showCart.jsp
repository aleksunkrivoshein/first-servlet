<%--
  Created by IntelliJ IDEA.
  User: dp
  Date: 09.07.20
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
   <%@ page import="somePackage.Cart" %>

   <% Cart cart = (Cart) session.getAttribute("cart"); %>

   <P> Наименование: <%= cart.getName() %> <P>
   <P> Количество: <%= cart.getQuantity() %> </p>
</body>
</html>
