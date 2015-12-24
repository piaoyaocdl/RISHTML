<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/bootstrap-3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="/bootstrap-3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="/hswstyle/css/hsw.css">
<script src="/bootstrap-3.3.5/js/jquery.min.js"></script>
<script src="/bootstrap-3.3.5/js/bootstrap.min.js"></script>
<title>HSWRIS</title>
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand">
				<img src="/image/tubiaohsw.png" style="height: 30px;">
			</a>
		</div>
		<a type="button"  class="pull-right btn btn-default navbar-btn">登出</a>
	</div>
	</nav>
</body>
</html>