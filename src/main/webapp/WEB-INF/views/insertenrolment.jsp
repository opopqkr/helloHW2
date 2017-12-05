<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
<title>수강 신청 페이지</title>
</head>
<body>

	<sf:form method="get" action="${pageContext.request.contextPath}/doinsert" modelAttribute="enrolment"> 
	<input type="hidden" name="year" value="2018"> 
	<input type="hidden" name="semester" value="1">
	<h5> - 2018년도 1학기 수강신청</h5>
	<table class="formtable">
		<tr><td class="label">과목코드:</td><td><sf:input class="control" type="text" path="code"/></br>
			<sf:errors path="code" class="error"></sf:errors></td></tr>
		<tr><td class="label">과목명:</td><td><sf:input class="control" type="text" path="name"/></br>
			<sf:errors path="name" class="error"></sf:errors></td></tr>
		<tr><td class="label">구분:</td><td><sf:input class="control" type="text" path="division"/></br>
			<sf:errors path="division" class="error"></sf:errors></td></tr>
		<tr><td class="label">학점:</td><td><sf:input class="control" type="text" path="credit"/></br>
			<sf:errors path="credit" class="error"></sf:errors></td></tr>
		<tr><td class="label">   </td><td><input class="control" type="submit" value="수강 신청"/></td></tr>
	</table>
	</sf:form>
	
	</br>
	<a href="${pageContext.request.contextPath}/">홈페이지 돌아가기</a>

</body>
</html>