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
	<h4>이곳은 test8.jsp입니당~</h4>
	<hr/>
	<p>
		이름: ${vo.name} 아이디 : ${vo.mid}, 비밀번호 : ${vo.pwd}, 나이:${vo.age}, 성별:${vo.sex}
	</p>
	<p>
		<a href="${ctp}/0611/index" class="btn btn-success">돌아가기</a>
	</p>
</div>
<p><br/></p>
</body>
</html>