<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>수강신청 완료</title>
</head>
<body>

<h5>'${enrolment.name}' 강의가 신청 되었습니다. </h5>
</br>
<a href="${pageContext.request.contextPath}/insertenrolment">수강신청 이어하기</a></br>
<a href="${pageContext.request.contextPath}/">홈페이지 돌아가기</a>
</body>
</html>