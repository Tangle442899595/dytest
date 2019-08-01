<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<table border="1"  align="center">
			<tr>
				<td>编号</td><td>名称</td><td>价格</td><td>出厂日期</td><td>生产商家</td><td>描述</td><td>操作</td>
			</tr>
			<c:forEach items="${ list }" var="list" varStatus="status" >
				<tr>
					<td>${ list.id  }</td>
					<td>${ list.name  }</td>
					<td>${ list.price  }</td>
					<td>${ list.leaveDate  }</td>
					<td>${ list.company  }</td>
					<td>${ list.desc  }</td>
					<td><a href="${pageContext.request.contextPath }/GoodServlet?method=add&id=${ list.id }">点击购买</a></td>
				</tr>
			</c:forEach>
			
		</table>
		<p align="center">
			<c:if test="${pageNum==1 }">
				首页 上一页
			</c:if>
			<c:if test="${pageNum>1 }">
				<a href="${pageContext.request.contextPath }/GoodServlet?method=getPaged&pageNum=1">首页</a> 
				<a href="${pageContext.request.contextPath }/GoodServlet?method=getPaged&pageNum=${param.pageNum==1?1:param.pageNum-1}">上一页</a> 	
				
			</c:if>
			<c:if test="${pageNum==page }">
				下一页 末页
			</c:if>
			<c:if test="${pageNum<page }">
				<a href="${pageContext.request.contextPath }/GoodServlet?method=getPaged&pageNum=${param.pageNum==page?page:param.pageNum+1}">下一页</a> 	
				<a href="${pageContext.request.contextPath }/GoodServlet?method=getPaged&pageNum=${ page}">末页</a>
			
			</c:if>
				
		
		</p>
	</form>
</body>
</html>