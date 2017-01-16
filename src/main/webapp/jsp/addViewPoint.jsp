<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>添加景区的景点</title>
</head>
<body>
<%@ include file="includeTop.jsp"%>
	<form action="${context}/vp/save.html" method="post"  enctype="multipart/form-data" >
	<div>为景区添加新景点</div>
	<table border="1px" width="100%">
		<tr>
			<td width="20%">景点名称：</td>
			<td width="80%"><input type="text" name="pointName" style="width:100%"/></td>
		</tr>
		<tr>
			<td width="20%">景点票价：</td>
			<td width="80%"><input type="text" name="ticketPrice" style="width:100%"/></td>
		</tr>
		<tr>
			<td width="20%">景点简介：</td>
			<td width="80%"><input type="text" name="description" style="width:100%;height:100px"/></td>
		</tr>
		<tr>
			<td width="20%">景点图片：</td>
			<td width="80%"><input type="file" name="imgFile"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="保存">
				<input type="reset" value="重置">
				<input type="hidden" name="spaceId" value="${viewSpace.spaceId}"/>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>
