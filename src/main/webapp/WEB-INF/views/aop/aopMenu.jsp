<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<jsp:include page="/WEB-INF/views/include/bs4.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
	<h3>AOP연습</h3>
	<hr/>
		<a href="${ctp}/aop/aopTest1">연습1</a>
		<a href="${ctp}/aop/aopTest2">연습2</a>
		<a href="${ctp}/aop/aopTest3">연습3</a>
		<a href="${ctp}/aop/aopTest4">연습4</a>
		<a href="${ctp}/aop/aopTest5">연습5</a>
	<p>
		<a href="${ctp}/">돌아가기</a>
	</p>
</div>
<p><br/></p>
</body>
</html>