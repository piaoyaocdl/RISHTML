<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<div class="container vertical-center" style="width: 300px;">
		<div class="panel panel-default">
			<div class="panel-heading">重庆血液中心</div>
			<div class="panel-body">
				<form action="/dengluyanzheng" method="post">
					<div class="form-group">
						<label for="exampleInputEmail1">帐号</label>
						<input type="text" class="form-control" name="zhanghao" id="exampleInputEmail1">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">密码</label>
						<input type="password" class="form-control" name="mima" id="exampleInputPassword1">
					</div>
					<div class="checkbox">
						<label>
							<input type="checkbox" name="jizhuwo">
							记住我
						</label>
						<button type="submit" class="btn btn-default" style="margin-left: 40px;width: 100px;">登录</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>