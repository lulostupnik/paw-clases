<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
    <link href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet"/>  //@TODO en la clase no le pone el $ (va directo de css). Porque lo necesito para que ande?
</head>
<body>
<h2>Hello <c:out value="${user.email}" escapeXml="true"/>!</h2>
</body>
</html>
