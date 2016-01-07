<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/component/biaotipart.jsp"%>
<%@ include file="/component/kuangjiakaishi.jsp"%>
<!-- 主体开始 -->
<div class="container-fluid">
	<form action="/zuzhipeixing/linchuanghla/tianjiashenqingdan" id="tianjianshenqingdan">
		<div class="row">
			<div class="col-md-2">
				<div class="form-group">
					<label>样本类型</label>
					<select class="form-control" name="yangbenleixing">
						<option>SZ</option>
						<option selected="selected">FY</option>
					</select>
				</div>
			</div>
			<div class="col-md-2">
				<div class="form-group">
					<label>申请单编号</label>
					<input type="text" class="form-control" disabled="disabled">
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2">
				<div class="form-group">
					<label style="color: red;">患者姓名</label>
					<input type="text" name="huanzhexingming" class="form-control">
				</div>
			</div>
			<div class="col-md-2">
				<div class="form-group">
					<label>性别</label>
					<select class="form-control" name="xingbie">
						<option>男</option>
						<option>女</option>
						<option selected="selected">未知</option>
					</select>
				</div>
			</div>
			<div class="col-md-2">
				<div class="form-group">
					<label>出生日期</label>
					<input type="date" name="chushengriqi" class="form-control">
				</div>
			</div>
			<div class="col-md-2">
				<div class="form-group">
					<label>身份证号</label>
					<input type="text" name="shenfenzhenghao" class="form-control">
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="form-group">
					<label>申请医院</label>
					<input type="text" name="shenqingyiyuan" class="form-control">
				</div>
			</div>
			<div class="col-md-2">
				<div class="form-group">
					<label>申请医生</label>
					<input type="text" name="shenqingyisheng" class="form-control">
				</div>
			</div>
			<div class="col-md-3"></div>
			<div class="col-md-3"></div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<div class="form-group">
					<label>通讯地址</label>
					<input type="text" name="tongxundizhi" class="form-control">
				</div>
			</div>
			<div class="col-md-2">
				<div class="form-group">
					<label>邮编</label>
					<input type="text" name="youbian" class="form-control">
				</div>
			</div>
			<div class="col-md-2">
				<div class="form-group">
					<label>联系电话</label>
					<input type="text" name="lianxidianhua" class="form-control">
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="form-group">
					<label>备注</label>
					<input type="text" name="beizhu" class="form-control">
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<a class="btn btn-default" href="javascript:tianjiashenqingdan()" role="button">添加申请单</a>
			</div>
		</div>
	</form>
	<script type="text/javascript">
		function tianjiashenqingdan()
		{
			if ($('input[name="huanzhexingming"]').val().trim().length == "0") {
				alert("患者姓名不能为空！");
				return;
			}
			$("#tianjianshenqingdan").submit();
		}
	</script>
</div>
<%@ include file="/component/kuangjiajiesu.jsp"%>
<%@ include file="/component/jieweipart.jsp"%>