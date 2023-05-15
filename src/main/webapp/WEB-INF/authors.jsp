<%--
  Created by IntelliJ IDEA.
  User: nickstephstudio
  Date: 5/15/23
  Time: 10:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="author" items="${authors}">
    <div>
        <p>${author.id}</p>
        <p>${author.name}</p>
    </div>
</c:forEach>
</body>
</html>
