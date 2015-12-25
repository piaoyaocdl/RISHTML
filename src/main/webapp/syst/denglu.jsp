<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/component/biaotipart.jsp"%>

<!-- 这里开始窗体  -->

<div class="container vertical-center" style="width: 300px;">
	<div class="panel panel-default">
		<div class="panel-heading">重庆血液中心</div>
		<div class="panel-body">
			<form action="/dengluyanzheng" method="post">
				<div class="form-group">
					<label for="exampleInputEmail1">帐号</label>
					<input type="text" value="ceshi" class="form-control" name="zhanghao" id="exampleInputEmail1">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">密码</label>
					<input type="password" value="ceshi" class="form-control" name="mima" id="exampleInputPassword1">
				</div>
				<div class="checkbox">
					<label>
						<input type="checkbox" checked="checked" name="jizhuwo">
						记住我
					</label>
					<button type="submit" class="btn btn-default" style="margin-left: 40px; width: 100px;">登录</button>
				</div>
			</form>
			<div style="color: red; font-weight: bold;" align="center">${cuowuxinxi}</div>
		</div>
	</div>
</div>

<!-- 这里结束窗体  -->

<%@ include file="/component/jieweipart.jsp" %>