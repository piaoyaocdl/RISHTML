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
	<div class="container-fluid">
		<div class="row">
			<div class="col-xs-12">
				<form class="form-inline">
					<div class="form-group">
						<input type="text" class="form-control" id="exampleInputName2" placeholder="申请单编号">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="exampleInputEmail2" placeholder="患者姓名">
					</div>
					<button type="submit" class="btn btn-default pull-right">查询</button>
				</form>
			</div>
		</div>
		<div class="row" style="margin-top: 20px;">
			<div class="col-xs-12">
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>申请单编号</th>
							<th>患者姓名</th>
							<th>性别</th>
							<th>出生日期</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<th scope="row">1</th>
							<td>Mark</td>
							<td>Otto</td>
							<td>@mdo</td>
							<td>@mdo</td>
							<td>
								<a role="button">增加</a>
								<a role="button">修改</a>
								<a role="button">删除</a>
							</td>
						</tr>
						<tr>
							<th scope="row">2</th>
							<td>Jacob</td>
							<td>Thornton</td>
							<td>@fat</td>
							<td>@mdo</td>
							<td>
								<a role="button" data-toggle="modal" data-target="#myModal">增加</a>
								<a role="button">修改</a>
								<a role="button">删除</a>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Modal title</h4>
				</div>
				<div class="modal-body">...</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>