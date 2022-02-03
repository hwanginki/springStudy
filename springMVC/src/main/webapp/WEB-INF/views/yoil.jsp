<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>요일 홈페이지</title>
</head>
<body>
<h1>year=<%=request.getParameter("year") %></h1>
<p> ${year}년 ${month}월 ${day}일은 ${yoil}입니다.</p>
</body>
</html>