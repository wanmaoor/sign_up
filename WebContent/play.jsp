<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.jeelearning.Bean" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册信息</title>
</head>
<body>
<%
@SuppressWarnings("unchecked")  List<Bean> list=(List<Bean>)session.getAttribute("list");
%>
<table border="1" cellspacing="0" width="600" bgcolor="ffdedd">
	<tr>
		<th colspan="4">用户注册信息</th>
	</tr>
	<tr>
		<th>编号</th>
		<th>用户名</th>
		<th>邮箱账号</th>
		<th>密码</th>
	</tr>
	
	<% for(int i=0;i<list.size();i++){
		Bean bean=list.get(i);
		%>
		<tr>
			<td><%=i+1%></td>
			<td><%=bean.getUsername() %></td>
			<td><%=bean.getemail() %></td>
			<td><%=bean.getPassword() %></td>
	
	    </tr>
	<% }%>

</table>

<a href="http://localhost:8080/sign_up/sign.html">返回注册页面</a>

</body>
</html>