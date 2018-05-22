<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">

        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>
    </head>

    <body>
        <table id="datatable">

        </table>
        <script type="text/javascript">
            $(function(){
                $("#datatable").datagrid({
                    columns:[[
                        {"title":"编号","field":"id","checkbox":true,"hidden":true},
                        {"title":"姓名","field":"name","sortable":true},
                        {"title":"年龄","field":"age"}
                    ]],
                    url:"${pageContext.request.contextPath}/json/datagrid_data2.json",
                    rownumbers:true,
                    toolbar:[
                        {text:"添加",iconCls:"icon-add",handler:function(){
                                $( '#dlg').dialog( 'open');
                            }},
                        {text:"查询",iconCls:"icon-search"},
                        {text:"修改",iconCls:"icon-edit"}

                    ],
                    pagination:true,
                    fit:true
                });
            });
        </script>

        <div id="dlg" class="easyui-dialog" title="Basic Dialog" data-options="iconCls: 'icon-save'"
             style="width:300px;height:250px;padding:10px" closed="true">
            <form id="info" method="post">
                <table cellpadding="5">
                    <tr>
                        <td>工作单位</td>
                        <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></input>
                        </td>
                    </tr>
                    <tr>
                        <td>所在科室</td>
                        <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></input>
                        </td>
                    </tr>
                    <tr>
                        <td>姓名</td>
                        <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></input>
                        </td>
                    </tr>
                    <tr>
                        <td>身份证号</td>
                        <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></input>
                        </td>
                    </tr>
                    <tr>
                        <td><a href="javascript:void(0)" class="easyui-linkbutton"
                               onclick="$('#info').form('submit')">提交</a></td>
                        <td><a href="javascript:void(0)" class="easyui-linkbutton"
                               onclick="$('#dlg').dialog('close')">关闭</a></td>
                    </tr>
                </table>
            </form>

        </div>

    </body>

</html>