<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询用户信息</title>
</head>
<body>
<form action="${pageContent.request.contentPath}/queryInfomation.action }" method="post">
<input type="hidden" name="id" value="1" />
    查询条件
    <table width="100%" border="1">
    <tr>
    <td><input type="submit" value="查询" /></td>
    </tr>
    </table>
    商品列表
    <table width="100%" border="1">
    <tr>
    <td>姓名</td>
    <td>密码</td>
    <td>操作</td>
    </tr>
    <c:forEach items="${infomations}" var="infomation">
    <tr>
    <td>${infomation.name}</td>
    <td>${infomation.password}</td>
    <td>
        <a href="${pageContext.request.contextPath }/infomation/selectByPrimaryKey.action?id=${infomation.id}">修改</a>
        <a href="${ pageContext.request.contextPath}/infomation/updateByPrimaryKey.action">更新</a>
    </td>
    </tr>
    </c:forEach>
    </table>
</form>
</body>
</html>