<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/component/biaotipart.jsp"%>
<%@ include file="/component/kuangjiakaishi.jsp"%>
<!-- 主体开始 -->
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
		<div class="col-xs-12 ">
			<div style="overflow: auto; width: auto;">
				<table class="table table-striped table-hover  table-condensed" style="width: 1300px; overflow: auto;">
					<thead>
						<tr>
							<th style="width: 50px;">ID</th>
							<th style="width: 100px;">申请单编号</th>
							<th style="width: 100px;">患者姓名</th>
							<th style="width: 60px;">性别</th>
							<th style="width: 100px;">出生日期</th>
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
								<a role="button" data-toggle="modal" data-target="#xinjiashenqingdan">增加</a>
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
								<a role="button" data-toggle="modal" data-target="#xinjiashenqingdan">增加</a>
								<a role="button">修改</a>
								<a role="button">删除</a>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
<!-- 新加申请单 弹出框  开始 -->
<form class="form-horizontal"  action="/zuzhipeixing/linchuanghla/tianjiashenqingdan" method="post">
	<div class="modal fade" id="xinjiashenqingdan" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">新加申请单</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="shenqingdanbianhao" class="col-sm-3 control-label">申请单编号</label>
						<div class="col-sm-9">
							<input type="text" name="shenqingdanbianhao" class="form-control" id="shenqingdanbianhao">
						</div>
					</div>
					<div class="form-group">
						<label for="huanzhexinging" class="col-sm-3 control-label">患者姓名</label>
						<div class="col-sm-9">
							<input type="text" name="huanzhexinging" class="form-control" id="huanzhexinging">
						</div>
					</div>
					<div class="form-group">
						<label for="xingbie" class="col-sm-3 control-label">性别</label>
						<div class="col-sm-9">
							<select class="form-control" name="xingbie" id="xingbie">
								<option></option>
								<option>男</option>
								<option>女</option>
								<option>未知</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="chushengriqi" class="col-sm-3 control-label">出生日期</label>
						<div class="col-sm-9">
							<input type="date" name="chushengriqi" class="form-control" id="chushengriqi">
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="submit" onclick="this.form.submit()" class="btn btn-default" data-dismiss="modal">添加</button>
				</div>
			</div>
		</div>
	</div>
</form>
<!-- 新加申请单 弹出框  结束 -->
<script type="text/javascript">
	$(function() {
		/* $(".form_datetime").datetimepicker({
			format : 'yyyy-mm-dd hh:ii'
		}); */
	});
</script>
<!-- 主体结束 -->
<%@ include file="/component/kuangjiajiesu.jsp"%>
<%@ include file="/component/jieweipart.jsp"%>