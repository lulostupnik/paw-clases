<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
    <link href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet"/>
</head>
<body>
<h2>Hello <c:out value="${user.username}" escapeXml="true"/>!</h2>
</body>
</html>
