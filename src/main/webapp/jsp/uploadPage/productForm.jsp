<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Add Product Form</title>
    <style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
    <!--返回页面大方法有HtteRequest 才可以用 $ { context } -->
    <form action="${context}/saveUpload.html" method="post"  enctype="multipart/form-data" >
        <div>为景区添加新景点</div>
        <table border="1px" width="100%">
            <tr>
                <td width="20%">景点名称：</td>
                <td width="80%"><input type="text"  style="width:100%"/></td>
            </tr>
            <tr>
                <td width="20%">景点票价：</td>
                <td width="80%"><input type="text"  style="width:100%"/></td>
            </tr>
            <tr>
                <td width="20%">景点简介：</td>
                <td width="80%"><input type="text"  style="width:100%;height:100px"/></td>
            </tr>
            <tr>
                <td width="20%">景点图片：</td>
                <td width="80%"><input type="file" name="imgFile"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="保存">
                    <input type="reset" value="重置">
                </td>
            </tr>
        </table>
        <form>
</div>
</body>
</html>
