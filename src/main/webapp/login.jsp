<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Login"/>
    </jsp:include>
</head>
<body>
<h1>Please Log In</h1>
<jsp:include page="partials/navbar.jsp"/>
<form action="login.jsp" method="post">
    <input name="username" type="text">
    <input name="password" type="text">
    <input type="submit" value="Log In">
</form>

</body>
</html>


<c:if test="${param.username == 'admin' && param.password == 'password'}">
    <c:redirect url="/profile.jsp"/>
</c:if>

<%--<c:choose>--%>
<%--    <c:when test="${param.username == 'admin' && param.password == 'password'}">--%>
<%--    <c:redirect url="/profile.jsp"/>--%>
<%--    </c:when>--%>
<%--        <c:otherwise>--%>
<%--            <c:redirect url="/login.jsp"/>--%>
<%--        </c:otherwise>--%>
<%--</c:choose>--%>