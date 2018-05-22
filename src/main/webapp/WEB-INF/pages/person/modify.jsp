<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/easyui/themes/icon.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/easyui/themes/IconExtension.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/person.js"></script>

</head>

<body style="background-image:url(${pageContext.request.contextPath}/img/background-person-info4.gif);background-repeat:repeat;">
<div id="tt" class="easyui-tabs" data-options="fit:true,tabPosition:'left',titleDirection:'up',border:false">
    <div id="tt1" title="基本信息"></div>
    <div title="录用信息"></div>
    <div title="教育信息"></div>
    <div title="任职信息"></div>
    <div title="奖惩信息"></div>
    <div title="科技信息"></div>
    <div title="家庭信息"></div>
</div>
</body>
</html>