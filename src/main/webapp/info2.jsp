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
<div>
    
</div>
<div id="person-basic-info">
    <form id="basicinfo">
        <style type="text/css">
            .tg {
                border-collapse: collapse;
                border-spacing: 0;
            }

            .tg td {
                font-family: Arial, sans-serif;
                font-size: 14px;
                padding: 10px 5px;
                overflow: hidden;
                word-break: normal;
                height: 35px;
            }

            hr {
                width: 30%;
                height: 2px;
                background-color: #6b9cde
            }

        </style>

        <div style="width: 500px;margin: 0 auto;clear: both;text-align: center">
            <hr style="float: left">
            <span>基本信息</span>
            <hr style="float: right">
        </div>
        <table class="tg" align="center">
            <tr>
                <td class="tg-031e">
                    <input class="easyui-textbox" id="personName">
                </td>
                <td class="tg-031e" colspan="2">
                    <input class="easyui-textbox" id="foreignName">
                </td>
                <td class="tg-031e">
                    <input class="easyui-textbox" id="usedName">
                </td>
                <td class="tg-pic" rowspan="3" width="160px" align="center">
                    <div style="text-align: center"><img src="${pageContext.request.contextPath}/img/person-default.jpg"
                                                         width="105" height="155"/></div>
                </td>
            </tr>
            <tr>
                <td class="tg-031e">
                    <div class="showInBegin"><input class="easyui-textbox" id="gender" name="gender"></div>
                    <div class="showInEdit" hidden><input class="easyui-combobox" id="gender-input"></div>
                </td>
                <td class="tg-031e" colspan="2">
                    <div class="showInBegin"><input class="easyui-textbox" id="birthday" name="birthday"></div>
                    <div class="showInEdit" hidden><input id="birthday-input" type="text" class="easyui-datebox"></div>
                </td>
                <td class="tg-031e">
                    <input class="easyui-textbox" id="nationality">
                </td>
            </tr>
            <tr>
                <td class="tg-031e">
                    <div class="showInBegin"><input class="easyui-textbox" id="nativeplace"></div>
                    <div class="showInEdit" hidden><input class="easyui-combotree" id="nativeplace-input"></div>
                </td>
                <td class="tg-031e" colspan="2">
                    <div class="showInBegin"><input class="easyui-textbox" id="birthplace"></div>
                    <div class="showInEdit" hidden><input class="easyui-combotree" id="birthplace-input"></div>
                </td>
                <td class="tg-031e">
                    <div class="showInBegin"><input class="easyui-textbox" id="domicileplace"></div>
                    <div class="showInEdit" hidden><input class="easyui-combotree" id="domicileplace-input"></div>
                </td>
            </tr>
            <tr>
                <td class="tg-031e">
                    <div class="showInBegin"><input class="easyui-textbox" id="ethnicity"></div>
                    <div class="showInEdit" hidden><input class="easyui-combobox" id="ethnicity-input"></div>
                </td>
                <td class="tg-031e" colspan="2">
                    <div class="showInBegin"><input class="easyui-textbox" id="health"></div>
                    <div class="showInEdit" hidden><input class="easyui-combobox" id="health-input"></div>
                <td class="tg-031e">
                    <div class="showInBegin"><input class="easyui-textbox" id="marriage"></div>
                    <div class="showInEdit" hidden><input class="easyui-combobox" id="marriage-input"></div>
                </td>
                <td>
                    <div class="showInEdit" style="text-align: center" hidden><input class="easyui-filebox"
                                                                                     id="picture-input"></div>
                </td>
            </tr>
            <tr>
                <td class="tg-031e" colspan="2">
                    <input class="easyui-textbox" id="identityCard">
                </td>
                <td class="tg-031e" colspan="3">
                    <div style="text-align: right"><input class="easyui-textbox" id="homeAddress"></div>
            </tr>
            <tr>
                <td class="tg-031e" colspan="2">
                    <input class="easyui-textbox" id="phone">
                </td>
                <td class="tg-031e" colspan="3">
                    <div style="text-align: right"><input class="easyui-textbox" id="email"></div>
                </td>
            </tr>
            <tr>
                <td class="tg-031e" colspan="2">工作单位：滨州市卫生和计划生育委员会</td>
                <td class="tg-031e" colspan="3">所在科室：规划信息科</td>
            </tr>
        </table>
        <div style="text-align: center">
            <a id="btn-modify" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'"
               onclick="hideSomething()">修改</a>
            <a id="btn-save" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'"
               onclick="showSomething()">保存</a></div>
        <script>
            function hideSomething() {
                $(".showInBegin").hide();
                $(".showInEdit").show();
                $(".easyui-textbox").textbox({
                    editable: true
                });
            }

            function showSomething() {
                $(".showInEdit").hide();
                $(".showInBegin").show();
                $(".easyui-textbox").textbox({
                    editable: 'false'
                });
            }
        </script>


    </form>
</div>
<div style="height: 5px">
    <a id="btn-modify2" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'"
       onclick="hideSomething1()">修改</a>
</div>
<div id="person-study">
    <form>
        <div style="width: 500px;margin: 0 auto;clear: both;text-align: center;">
            <hr style="float: left">
            <span>学历信息</span>
            <hr style="float: right">
        </div>
        <div id="study-grid-body" style="width: 48%;margin:auto">
            <table class="easyui-datagrid" id="study-grid"
                   data-options="singleSelect:true,collapsible:false,url:'${pageContext.request.contextPath}/json/datagrid_data.json',method:'post'">
                <thead>
                <tr>
                    <th data-options="field: 'id',width:80">编号</th>
                    <th data-options="field: 'name',width:100">姓名</th>
                    <th data-options="field: 'age',width:80,align: 'right'">年龄</th>
                </tr>
                </thead>
            </table>
        </div>

        <script>
            function hideSomething1() {
                $("#study-grid").datagrid('insertRow',{
                    row:{
                        id:"001",
                        name:"李",
                        age:"20"
                    }
                });
                //$("#study-grid").datagrid('reload');$("#person-study").show();
                $("#study-grid").datagrid({
                    url:'${pageContext.request.contextPath}/json/datagrid_data.json'
                });

                $("#study-grid").datagrid('reload');
                $("#study-grid-body").css('width','48%');
                $("#study-grid-body").css('margin','auto');
            }
        </script>
    </form>
</div>

</body>

</html>