<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<table>
			<tr>
				<td>证书类型;</td>
				<td>
					<select name="sType">
						<c:forEach items="${list }" var="list">
							<option value="${ list.sType }">${ list.cardName }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>姓名：</td>
				<td>
					<input type="text" name="sName">
				</td>
			</tr>
			<tr>
				<td>身份证：</td>
				<td>
					<input type="text" name="idCard">
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="查询"><input type="reset" name="重来"></td>
			</tr>
		</table>
	</form>
</body>
</html>