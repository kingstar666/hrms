<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
    <%--<script type="text/javascript" src="${pageContext.request.contextPath}/js/person.js"></script>--%>
</head>

<body>
<table class="easyui-datagrid" style="width:100%;height:100%" id="list_grid">
    <thead>
    <tr>
        <th data-options="field: 'personName',width:80">姓名</th>
        <th data-options="field: 'birthday',width:80">出生日期</th>
        <th data-options="field: 'orgName',width:80">工作单位</th>
        <th data-options="field: 'deptName',width:80">所在科室</th>
        <th data-options="field: 'ethnicity',width:80">民族</th>
        <th data-options="field: 'nativePlace',width:80">籍贯</th>
        <th data-options="field: 'partyName',width:80">政治面貌</th>
        <th data-options="field: 'education',width:80">学历</th>
        <th data-options="field: 'techLevel',width:80">职称</th>
        <th data-options="field: 'postLevel',width:80">职务</th>
        <th data-options="field: 'personId',width:80,formatter:formatter2">功能列表</th>
        <script type="text/javascript">
            var formatter2 = function (value) {
                return "<a href=personAction_query?personId=" + value + ">查看</a>&nbsp<a href=personAction_delete?personId=" + value + ">删除</a>";
            }
            var f2 = function (value) {
                return "研究生";
            }
            var f3 = function (value) {
                return "高级工程师工程师";
            }
            var f4 = function (value) {
                return "机关党委专职书记";
            }
        </script>
    </tr>
    </thead>
</table>
<div id="tb" style="padding:5px;height:auto">
    <div style="margin-bottom:0px">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
           onclick="$('#dlg').dialog('open')">新增人员</a>
    </div>
</div>
<script type="text/javascript">
    $('#list_grid').datagrid({
        loadMsg: '加载中，请耐心等待……',
        singleSelect: true,
        collapsible: false,
        url: 'personListAction_pageQuery.action',
        method: 'get',
        toolbar: '#tb',
        fit: true,
        border: false,
        rownumbers: true,
        pageList: [5, 50, 100],
        pagination: true,
        idField: 'personId',
        queryParams: {
            type: "deptId",
            id: "<s:property value="#session.id"></s:property>"
        }
    });

</script>
<div id="dlg" class="easyui-dialog" title="新增人员" data-options="iconCls: 'icon-save'"
     style="width:370px;height:270px;padding:10px" closed="true">
    <form id="info" method="post" action="personAction_add">
        <table cellpadding="5">
            <tr>
                <td colspan="2">
                    <input id="org-input" class="easyui-combobox" name="orgId"
                           data-options="url:'mainTreeAction_listOrg',valueField:'id',textField:'name',required:true,width:300,label:'工作单位',labelPosition:'left'"></input>
                </td>
            </tr>
            <tr>

                <td colspan="2">
                    <input id="dept-input" class="easyui-combobox" name="deptId"
                           data-options="valueField:'id',textField:'name',required:true,width:300,label:'所在科室',labelPosition: 'left'"></input>
                </td>
            </tr>
            <tr>

                <td colspan="2"><input class="easyui-textbox" type="text" name="personName" data-options="width:300,required:true,label:'姓&nbsp;&nbsp;&nbsp;&nbsp;名'"></input>
                </td>
            </tr>
            <tr>
                <td colspan="2"><input class="easyui-textbox" type="text" name="identityCard" data-options="width:300,required:true,label:'身份证号'"></input>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">姓名和身份证号一经提交无法修改，请谨慎填写！
                </td>
            </tr>
            <tr>
                <td align="center"><a href="javascript:void(0)" class="easyui-linkbutton"
                                                  onclick="$('#dlg').dialog('close');$('#info').form('submit');$('#list_grid').datagrid('reload')">提交</a></td>
                <td align="center"><a href="javascript:void(0)" class="easyui-linkbutton"
                                                  onclick="$('#info').form('reset')">重置</a></td>
            </tr>
        </table>
    </form>
<script type="text/javascript">
    $('#org-input').combobox({
        onChange: function (newValue, oldValue) {
            $('#dept-input').combobox('reload', 'mainTreeAction_listDept?orgId='+newValue);
        }
    });
</script>

</div>

</body>

</html>