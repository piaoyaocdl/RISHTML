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
	<nav id="导航条" class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand">
				<img src="/image/tubiaohsw.png" style="height: 30px;">
			</a>
		</div>
		<a type="button" href="/dengchu" class="pull-right btn btn-default navbar-btn">登出</a>
	</div>
	</nav>
	<div class="row">
		<div class="col-md-2" id="左边列表">
			<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
				<div id="个人中心" class="panel panel-default">
					<div class="panel-heading" role="tab" id="headingOne">
						<h4 class="panel-title">
							<a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne"> 个人中心 </a>
						</h4>
					</div>
					<div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
						<div class="panel-body">个人中心01</div>
					</div>
				</div>
				<div id="组织配型" class="panel panel-default">
					<div class="panel-heading" role="tab" id="headingTwo">
						<h4 class="panel-title">
							<a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo"> 组织配型 </a>
						</h4>
					</div>
					<div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
						<div class="panel-body">
							<div id="临床HLA" class="dropdown">
								<a class="dropdown-toggle" role="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
									临床HLA
									<span class="caret"></span>
								</a>
								<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
									<li>
										<a role="button" target="jiazaiqi" href="zuzhipeixing/linchuanghla/jianceshenqingdan">检测申请单</a>
									</li>
									<li>
										<a role="button">Another action</a>
									</li>
									<li>
										<a role="button">Something else here</a>
									</li>
									<li>
										<a role="button">Separated link</a>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-10" id="加载器" style="padding-right: 40px;">
			<iframe id="jiazaiqi" name="jiazaiqi" scrolling="no" style="width: 100%; border-width: 0px;"> </iframe>
		</div>
	</div>
	<script type="text/javascript">
		function reinitIframe()
		{
			var iframe = document.getElementById("jiazaiqi");
			try {
				
				iframe.height = iframe.contentWindow.document.documentElement.scrollHeight;
			} catch (ex) {
			}
		}
		window.setInterval("reinitIframe()", 1000);
	</script>
</body>
</html>