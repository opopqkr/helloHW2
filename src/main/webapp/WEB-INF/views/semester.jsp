<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>학년/학기별 이수 총 학점 조회</title>
</head>
<body>

	<c:forEach var="enrolment" items="${enrolments}">
		<c:if test="${enrolment.year=='2012'}">
			<c:if test="${enrolment.semester=='1'}">
				<c:set var="semester20121" value="${semester20121+enrolment.credit}"></c:set>
			</c:if>
			<c:if test="${enrolment.semester=='2'}">
				<c:set var="semester20122" value="${semester20122+enrolment.credit}"></c:set>
			</c:if>
		</c:if>
		<c:if test="${enrolment.year=='2013'}">
			<c:if test="${enrolment.semester=='1'}">
				<c:set var="semester20131" value="${semester20131+enrolment.credit}"></c:set>
			</c:if>
		</c:if>
		<c:if test="${enrolment.year=='2016'}">
			<c:if test="${enrolment.semester=='2'}">
				<c:set var="semester20162" value="${semester20162+enrolment.credit}"></c:set>
			</c:if>
		</c:if>
		<c:if test="${enrolment.year=='2017'}">
			<c:if test="${enrolment.semester=='1'}">
				<c:set var="semester20171" value="${semester20171+enrolment.credit}"></c:set>
			</c:if>
			<c:if test="${enrolment.semester=='2'}">
				<c:set var="semester20172" value="${semester20172+enrolment.credit}"></c:set>
			</c:if>
		</c:if>
	</c:forEach>
	
	<h5> - 학년/학기별 이수 총 학점</h5>
	<table border="1">
		<tr align="center"><td>년도</td><td>학기</td><td>이수 학점</td><td>상세보기</td></tr>
		<tr align="center"><td>2012</td><td>1</td><td>${semester20121}</td><td><a href="${pageContext.request.contextPath}/view/2012/1">링크</td></tr>
		<tr align="center"><td>2012</td><td>2</td><td>${semester20122}</td><td><a href="${pageContext.request.contextPath}/view/2012/2">링크</td></tr>
		<tr align="center"><td>2013</td><td>1</td><td>${semester20131}</td><td><a href="${pageContext.request.contextPath}/view/2013/1">링크</td></tr>
		<tr align="center"><td>2016</td><td>2</td><td>${semester20162}</td><td><a href="${pageContext.request.contextPath}/view/2016/2">링크</td></tr>
		<tr align="center"><td>2017</td><td>1</td><td>${semester20171}</td><td><a href="${pageContext.request.contextPath}/view/2017/1">링크</td></tr>
		<tr align="center"><td>2017</td><td>2</td><td>${semester20172}</td><td><a href="${pageContext.request.contextPath}/view/2017/2">링크</td></tr>
	</table>
	
	</br>
	<a href="${pageContext.request.contextPath}/">홈페이지 돌아가기</a>

</body>
</html>