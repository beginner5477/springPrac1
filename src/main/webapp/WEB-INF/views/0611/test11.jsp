<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<jsp:include page="/WEB-INF/views/include/bs4.jsp" />
	<script>
		if('${msg}' != '') {
			alert("${msg}");
		}
	</script>
</head>
<body>
<p><br/></p>
<div class="container">
	<h4>회원가입</h4>
	<form method="post">
		<table>
			<tr>
				<th>성명</th>
				<td><input type="text" name="name" id="name"  value="${name}" class="form-control"/></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="number" name="age" id="age" value="${age}" class="form-control"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="회원가입"/>
					<input type="button" value="돌아가기" onclick="location.href='${ctp}/0611/index'"/>
				</td>
			</tr>
		</table>
	</form>
</div>
<p><br/></p>
</body>
</html>