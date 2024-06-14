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
				<th>아이디</th>
				<td><input type="text" name="mid" id="mid" value="${vo.mid}" class="form-control" required/></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pwd" id="pwd"  value="${vo.pwd}" class="form-control"/></td>
			</tr>
			<tr>
				<th>성명</th>
				<td><input type="text" name="name" id="name"  value="${vo.name}" class="form-control"/></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="number" name="age" id="age" value="${vo.age}" class="form-control"/></td>
			</tr>
			<tr>
				<th>성별</th>
				<td><input type="radio" name="sex" id="sex1" ${vo.sex == 1 ? 'checked' : '' } value="1"/>남자
				<input type="radio" name="sex" id="sex2" value="2" ${vo.sex == 2 ? 'checked' : '' }/>여자</td>
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