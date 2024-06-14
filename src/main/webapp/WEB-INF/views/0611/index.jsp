<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="/WEB-INF/views/include/bs4.jsp"></jsp:include>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<%-- <jsp:include page="/WEB-INF/views/include/bs4.jsp" /> --%>
	<script type="text/javascript">
		function postCheck(no) {
			if(no == 7)
			myform.action = "${ctp}/0611/test7";
			else if(no == 8) 
			myform.action = "${ctp}/0611/test8";
			myform.submit();
		}
	</script>
</head>
<body>
<p><br/></p>
<div class="container">
	<h3>index.jsp</h3>
	<p>넘어온값${data}</p>
	<a href="${ctp}/home">뒤로가기</a>
	<a href="${ctp}/0611/test1?mid=okad3333&pwd=3332">테스트1번가기</a>
	<a href="${ctp}/0611/test2?mid=ok9999&pwd=9999&age=20&sex=2">테스트2번가기</a>
	<a href="${ctp}/0611/test3?mid=ok9999&pwd=9999&age=20&sex=1">테스트3번가기</a>
	<a href="${ctp}/0611/test4?mid=aaa9999&pwd=9332&age=20&sex=1">테스트4번가기</a>
	<a href="${ctp}/0611/test5?mid=aaa9999&pwd=9332&age=20&sex=2">테스트5번가기</a>
	<a href="${ctp}/0611/test6?mid=aaa1239&pwd=912332&age=20&sex=3">테스트6번가기</a>
	
	<form  name="myform" method="post">
		<table>
			<tr>
				<th>성명</th>
				<td><input type="text" name="name" id="name" class="form-control"/></td>
			</tr>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="mid" id="mid" class="form-control"/></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pwd" id="pwd" class="form-control"/></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="number" name="age" id="age" class="form-control"/></td>
			</tr>
			<tr>
				<th>성별</th>
				<td><input type="radio" name="sex" id="sex1" class="form-control" value="1"/>남자
				<input type="radio" name="sex" id="sex2" class="form-control" value="2"/>여자</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" value="test7전송" onclick="postCheck(7)"/>
					<input type="button" value="test8전송" onclick="postCheck(8)"/>
				</td>
			</tr>
		</table>
	</form>
	<hr/>
	<a href="${ctp}/0611/test9" class="btn btn-dark">테스트9번가기</a>
	<a href="${ctp}/0611/test10" class="btn btn-dark">테스트10번가기</a>
	<a href="${ctp}/0611/test11" class="btn btn-dark">테스트11번가기</a>
	<a href="${ctp}/0611/test12/okm5477/33dq" class="btn btn-dark">테스트12번가기(path variable방식으로)</a>	
	<a href="${ctp}/0611/test13" class="btn btn-secondary">테스트13번가기</a>	
	<a href="${ctp}/0611/test14" class="btn btn-secondary">테스트14번가기</a>	
	<a href="${ctp}/0611/test15" class="btn btn-secondary">테스트15번(메세지.jsp따로 빼서 거기 갔다가 다시 원래대로 가는방식??)</a>	
</div>
<p><br/></p>
</body>
</html>