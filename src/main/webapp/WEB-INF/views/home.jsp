<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<%-- <%@ page session="false" %> --%>
<html>
<head>
	<title>Home</title>
	<script>
		'use strict';
		if('${msg}' != '') {
			alert("${msg}");
		}
	</script>
</head>
<body>
<h1>
	안뇽하세용..
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p>
	<a href="${ctp}/0611/index">index.jsp</a>
	<a href="${ctp}/logTest">로그 체크하기</a>
	<a href="${ctp}/aop/aopMenu">AOP연습</a>
</p>
</body>
</html>
