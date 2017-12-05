<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018년도 1학기 수강신청 조회</title>
</head>
<body>

	<h5>- 2018년도 1학기 수강신청 조회</h5>

	<table border="1">
		<tr align="center">
			<td>수강년도</td>
			<td>학기</td>
			<td>교과코드</td>
			<td>교과목명</td>
			<td>구분</td>
			<td>학점</td>
		</tr>
		<c:forEach var="enrolment" items="${enrolments}">
			<tr align="center">
				<td>${enrolment.year}</td>
				<td>${enrolment.semester}</td>
				<td>${enrolment.code}</td>
				<td>${enrolment.name}</td>
				<td>${enrolment.division}</td>
				<td>${enrolment.credit}</td>
			</tr>
		</c:forEach>
	</table>

	</br>
	<a href="${pageContext.request.contextPath}/">홈페이지 돌아가기</a>

</body>
</html>