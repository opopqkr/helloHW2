<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>이수 구분별 학점 내역</title>
</head>
<body>
	
	<c:forEach var="enrolment" items="${enrolments}">
		<c:if test="${enrolment.division=='일교'}">
			<c:set var="divisionIG" value="${divisionIG+enrolment.credit}"></c:set>
		</c:if>
		<c:if test="${enrolment.division=='교필'}">
			<c:set var="divisionGP" value="${divisionGP+enrolment.credit}"></c:set>
		</c:if>
		<c:if test="${enrolment.division=='핵교A'}">
			<c:set var="divisionHA" value="${divisionHA+enrolment.credit}"></c:set>
		</c:if>
		<c:if test="${enrolment.division=='핵교B'}">
			<c:set var="divisionHB" value="${divisionHB+enrolment.credit}"></c:set>
		</c:if>
		<c:if test="${enrolment.division=='전지'}">
			<c:set var="divisionJJ" value="${divisionJJ+enrolment.credit}"></c:set>
		</c:if>
		<c:if test="${enrolment.division=='전기'}">
			<c:set var="divisionJG" value="${divisionJG+enrolment.credit}"></c:set>
		</c:if>
		<c:if test="${enrolment.division=='전선'}">
			<c:set var="divisionJS" value="${divisionJS+enrolment.credit}"></c:set>
		</c:if>
	</c:forEach>
	
	<c:set var="divisionCH">
		${divisionGP+divisionIG+divisionHA+divisionHB+divisionJJ+divisionJG+divisionJS}
	</c:set>
	
	<h5> - 이수 구분별 학점 내역</h5>
	<table border="1">
		<tr align="center">
			<td>일교</td>
			<td>교필</td>
			<td>핵교A</td>
			<td>핵교B</td>
			<td>전지</td>
			<td>전기</td>
			<td>전선</td>
			<td>총학점</td>
		</tr>
		<tr align="center">
			<td>${divisionIG}</td>
			<td>${divisionGP}</td>
			<td>${divisionHA}</td>
			<td>${divisionHB}</td>
			<td>${divisionJJ}</td>
			<td>${divisionJG}</td>
			<td>${divisionJS}</td>
			<td>${divisionCH}</td>
		</tr>
	</table>

	</br>
	<a href="${pageContext.request.contextPath}/">홈페이지 돌아가기</a>

</body>
</html>