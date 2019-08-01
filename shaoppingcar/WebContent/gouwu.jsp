<%@page import="java.util.List"%>
<%@page import="com.neu.entity.TbGoods"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>		
	<table border="1">
		<tr>
			<td>编号</td><td>名称</td><td>单价</td><td>数量</td><td>小计</td>
		</tr>
		
			<c:forEach items="${ map}" var="keyValue">
		<tr>
			<td>${	keyValue.value.good.id }</td>
			<td>${keyValue.value.good.name }</td>
			<td>${keyValue.value.good.price }</td>
			<td>${keyValue.value.num}</td>
			<td>${keyValue.value.total }</td>
		</tr>
			</c:forEach>
		<tr>
			<td colspan="5">总计：${ sum }</td>
		</tr>
	</table>
	<a href="javascript:history.go(-1)">返回上一页</a>
</body>
</html>