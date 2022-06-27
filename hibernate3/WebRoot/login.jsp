<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC"-//W3C//DTD HTML 4.01 Transitional//EN" "http://WWW.W3.org/TR/html14/loose.dtd">
<html>
  <head>
    <base href="<%=basePath%>">   
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><s:text name="基于SH的登录和注册系统"></s:text></title>   
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body bgcolor="#CCCCFF">
        <s:form action="login" method="post">
            <br><br><br><br><br><br>
            <table border="1" align="center" bgcolor="#AABBCCDD">
                <tr>
                    <td>
                        <s:textfield name="userName" label="用户名字" size="16"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <s:password name="password" label="用户密码" size="18"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <s:submit value="登录"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <s:a href="http://localhost:8080/hibernate3/register.jsp">注册</s:a>
                    </td>
                </tr>
            </table>
        </s:form>
    </body>
</html>