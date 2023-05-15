<%--
  Created by IntelliJ IDEA.
  User: nickstephstudio
  Date: 5/15/23
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quotes</title>
</head>
<body>
<c:forEach var="quote" items="${quotes}">
    <div class="quote">
        <p>${quote.author.author_name} said: ${quote.content}</p>
    </div>
</c:forEach>
</body>
</html>
</body>
</html>
