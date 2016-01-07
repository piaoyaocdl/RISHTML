<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/component/biaotipart.jsp"%>
<%@ include file="/component/kuangjiakaishi.jsp"%>
<!-- 主体开始 -->
<div class="container-fluid">
	<!-- 查询输入 开始-->
	<div class="row">
		<form class="form-inline">
			<div class="form-group">
				<input type="text" class="form-control" id="exampleInputName2" placeholder="申请单编号">
			</div>
			<div class="form-group">
				<input type="email" class="form-control" id="exampleInputEmail2" placeholder="患者姓名">
			</div>
			<button type="submit" class="btn btn-default pull-right">查询</button>
		</form>
	</div>
	<!-- 查询输入 结束-->
	<!-- 分页 开始 -->
	<div class="row">
		<nav class="pull-right">
			<ul class="pagination">
				<li>
					<a href="#" aria-label="Previous">
						<span aria-hidden="true">&laquo;</span>
					</a>
				</li>
				<li>
					<a href="#">前页</a>
				</li>
				<li>
					<a href="#">3</a>
				</li>
				<li>
					<a href="#">后页</a>
				</li>
				<li>
					<a href="#" aria-label="Next">
						<span aria-hidden="true">&raquo;</span>
					</a>
				</li>
			</ul>
		</nav>
	</div>
	<!-- 分页 结束-->
	<!-- 申请单表格 开始 -->
	<div class="row">
		<a class="btn btn-default" href="/zuzhipeixing/linchuanghla/daotianjiayemian" role="button">添加申请单</a>
	</div>
	<div class="row" style="margin-top: 5px;">
		<table class="table table-striped table-bordered table-hover table-condensed">
			<thead>
				<tr>
					<th>编号</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>Mark</td>
					<td>Otto</td>
					<td>
						<div class="btn-group">
							<button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								操作
								<span class="caret"></span>
							</button>
							<ul class="dropdown-menu">
								<li>
									<a href="#">修改</a>
								</li>
								<li>
									<a href="#">删除</a>
								</li>
								<li>
									<a href="#">详细信息</a>
								</li>
							</ul>
						</div>
					</td>
				</tr>
				
			</tbody>
		</table>
	</div>
	<!-- 申请单表格 结束 -->
</div>
<!-- 主体结束 -->
<%@ include file="/component/kuangjiajiesu.jsp"%>
<%@ include file="/component/jieweipart.jsp"%>