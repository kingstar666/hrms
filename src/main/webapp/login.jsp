<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>

<head>
    <title>人力资源管理信息系统登陆</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>
</head>

<body >

<form id="login" action="userAction_login.action" method="post">
    <h1><img src="img/login.png" id="loginpic"/></h1>
    <fieldset id="inputs">
        <input id="username" name="username" type="text" placeholder="Username" autofocus required>
        <input id="password" name="password" type="password" placeholder="Password" required>
        <input id="checkcode" name="checkcode" type="text" placeholder="Checkcode" required>
        <img src="${pageContext.request.contextPath}/validatecode.jsp" id="checkpic" title="点击刷新验证码" align="right"
             onclick="document.getElementById('checkpic').src='${pageContext.request.contextPath }/validatecode.jsp?'+Math.random();"/>
    </fieldset>
    <div style="alignment: left;border: none;margin:0px;padding:0px;height: 20px">
        <h3 style="color:red"><s:actionerror/></h3>
    </div>
    <fieldset id="actions" style="border: none;margin:0px;padding:0px;position: relative;">
        <input type="reset" id="reset" value="重置">
        <input type="submit" id="submit" value="登陆">
    </fieldset>
</form>
</body>

</html>