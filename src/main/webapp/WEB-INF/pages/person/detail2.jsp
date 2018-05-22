<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
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

        body {
            background-image: url(${pageContext.request.contextPath}/img/background-person-info4.gif);
            background-repeat: repeat;
            opacity: 50;
            filter: alpha(opacity=50);
            -moz-opacity: 0.50;
        }

        table {
            border-width: 1px;
            border-color: #CC2222;
        }
    </style>
</head>
<body>
<s:debug></s:debug>
<div>
    <a class="easyui-menubutton" data-options="iconCls:'icon-add',menu:'#mm'">追加信息</a>
    <div id="mm" align="right">
        <div>追加学历信息</div>
        <div>追加党派信息</div>
        <div>追加录用信息</div>
        <div>追加行政职务</div>
        <div>追加专技职务</div>
        <div>追加党派职务</div>
    </div>
</div>
<div id="person-basic-info">
    <div style="width: 490px;margin: 0 auto;clear: both;text-align: center;height: 50px">
        <hr style="float: left">
        <span>基本信息</span>
        <hr style="float: right">
    </div>
    <table class="tg" align="center">
        <tr>
            <td class="tg-031e">
                <s:property value="personName"/>
                <%--<input type="text" id="perssonName" name="personName">--%>
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
                <div><input class="easyui-textbox" id="gender" name="gender"></div>
            </td>
            <td class="tg-031e" colspan="2">
                <div><input class="easyui-textbox" id="birthday" name="birthday"></div>
            </td>
            <td class="tg-031e">
                <input class="easyui-textbox" id="nationality">
            </td>
        </tr>
        <tr>
            <td class="tg-031e">
                <div><input class="easyui-textbox" id="nativeplace"></div>

            </td>
            <td class="tg-031e" colspan="2">
                <div><input class="easyui-textbox" id="birthplace"></div>

            </td>
            <td class="tg-031e">
                <div><input class="easyui-textbox" id="domicileplace"></div>

            </td>
        </tr>
        <tr>
            <td class="tg-031e">
                <div><input class="easyui-textbox" id="ethnicity"></div>

            </td>
            <td class="tg-031e" colspan="2">
                <div><input class="easyui-textbox" id="health"></div>

            <td class="tg-031e">
                <div><input class="easyui-textbox" id="marriage"></div>
            </td>

        </tr>
        <tr>
            <td class="tg-031e" colspan="2">
                <input class="easyui-textbox" id="identityCard">
            </td>
            <td class="tg-031e" colspan="3">
                <div style="text-align: right"><input class="easyui-textbox" id="homeAddress"></div>
            </td>
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
            <td class="tg-031e" colspan="2">
                <input class="easyui-textbox" id="org">
            </td>
            <td class="tg-031e" colspan="3">
                <div style="text-align: right"><input class="easyui-textbox" id="dept"></div>
            </td>
        </tr>
    </table>
    <div style="width: 500px;margin: 30px auto 0;clear: both;text-align: center;height: 50px;float: none">
        <hr style="float: left">
        <span>扩展信息</span>
        <hr style="float: right">
    </div>

    <table class="tg" align="center">
        <tr>
            <td>
                <input class="easyui-textbox" id="status">
            </td>
            <td style="text-align: center">
                <a class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
            </td>
            <td>
                <input class="easyui-textbox" id="party">
            </td>
            <td>
                <a class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
            </td>
            <td>
                <input class="easyui-textbox" id="dabh">
            </td>
            <td>
                <a class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
            </td>
        </tr>
        <tr>
            <td>
                <input class="easyui-textbox" id="xzzw">
            </td>
            <td style="text-align: center">
                <a class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
            </td>
            <td>
                <input class="easyui-textbox" id="dzzw">
            </td>
            <td>
                <a class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
            </td>
            <td colspan="2">
                <input class="easyui-textbox" id="xzjb">
            </td>
        </tr>
        <tr>
            <td>
                <input class="easyui-textbox" id="zjzg">
            </td>
            <td style="text-align: center">
                <a class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
            </td>
            <td>
                <input class="easyui-textbox" id="zjzw">
            </td>
            <td>
                <a class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
            </td>
            <td>
                <input class="easyui-textbox" id="gqjb">
            </td>
            <td>
                <a class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
            </td>
        </tr>
    </table>
    <table class="tg" align="center">

        <tr style="border-bottom: 2px">
            <td>
                <input class="easyui-textbox" id="full-time-education">
            </td>
            <td>
                <input class="easyui-textbox" id="full-time-school">
            </td>
            <td>
                <input class="easyui-textbox" id="full-time-specification">
            </td>
            <td>
                <a class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
            </td>
        </tr>
        <tr>
            <td>
                <input class="easyui-textbox" id="part-time-education">
            </td>
            <td>
                <input class="easyui-textbox" id="part-time-school">
            </td>
            <td>
                <input class="easyui-textbox" id="part-time-specification">
            </td>
            <td>
                <a class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
            </td>
        </tr>

    </table>
    <div style="width: 500px;margin: 30px auto 0;clear: both;text-align: center;height: 50px;float: none">
        <hr style="float: left">
        <span>家庭信息</span>
        <hr style="float: right">
    </div>
    <div style="width: 50%;height:240px;margin:auto">
        <table class="easyui-datagrid" data-options="url:'${pageContext.request.contextPath}/json/family.json'"
               id="list_grid" >
            <thead>
            <tr>

                <th data-options="field: 'familyPersonName',width:80">姓名</th>
                <th data-options="field: 'familyPersonEthnicity',width:80">民族</th>
                <th data-options="field: 'familyPersonRelation',width:80">与本人的关系</th>
                <th data-options="field: 'familyPersonBirthday',width:80">出生日期</th>
                <th data-options="field: 'familyPersonWork',width:300">工作单位及职务</th>
                <th data-options="field: 'familyPersonParty',width:100">政治面貌</th>
                <th data-options="field: 'familyPersonId',width:80,formatter:formatter2">编号</th>
                <script type="text/javascript">
                    var formatter2 = function (value) {
                        return "<a href=familyPersonAction_modify?familyPersonId=" + value + ">修改</a>&nbsp<a href=familyPersonAction_delete?familyPersonId=" + value + ">删除</a>";
                    }
                </script>

            </tr>
            </thead>
        </table>
    </div>
    <div id="tb" style="padding:5px;height:auto">
        <div style="margin-bottom:0px">
            <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
               onclick="$( '#dlg').dialog( 'open')">新增人员</a>
        </div>
    </div>

    <div style="width: 500px;margin: 30px auto 0;clear: both;text-align: center;height: 50px;float: none">
        <hr style="float: left">
        <span>工作简历</span>
        <hr style="float: right">
    </div>
    <div style="width: 500px;margin: 30px auto 0;clear: both;text-align: center;height: 50px;float: none">
        <hr style="float: left">
        <span>专技信息</span>
        <hr style="float: right">
    </div>
</div>


</body>

</html>