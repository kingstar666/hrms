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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/zTreeStyle/zTreeStyle.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ztree.all.js"></script>
    <script>
        $(function () {
            $("#sxl").on("click", function (title, url) {
                title = "baidu";
                url = "http://www.baidu.com";
                if ($('#tt').tabs('exists', title)) {
                    $('#tt').tabs('select', title);
                } else {
                    var content = '<iframe scrolling="auto" frameborder="0"  src="' + url + '" style="width:100%;height:100%;"></iframe>';
                    $('#tt').tabs('add', {
                        title: title,
                        content: content,
                        closable: true
                    });
                }
            });
        });
    </script>
</head>

<body class="easyui-layout">
<div data-options="region:'north',border:false"
     style="height:100px;padding:10px;background: url(/img/background-person-info4.gif);">

    <div style="position:relative">
        <img src="../../../img/title.png"
             style="position:absolute;top:0px;left:100px; width:50%;height:90px;float:left;"/>
    </div>
    <div align="right">
        欢迎你：<span>${sessionScope.get("loginUser").username}</span>
    </div>

</div>
<div data-options="region:'west',split:true,title:'功能列表'" style="width:200px;height:100%;">
    <div class="easyui-accordion" style="width:100%;background: url(/img/background-person-info4.gif);" fit="true">
        <div title="人员列表" data-options="iconCls:'icon-client'" style="overflow:auto;width:100%;height:300px;">
            <div class="easyui-panel" style="padding:5px;height:100%">
                <ul id="ztree2" class="ztree"></ul>
                <script type="text/javascript">
                    $(function () {
                        var setting2 = {
                            data: {
                                simpleData: {
                                    enable: true
                                }
                            },
                            callback: {
                                onClick: function (event, treeId, treeNode) {
                                    if (treeNode.type != undefined) {
                                        var page;
                                        var title;
                                        var content;
                                        if (treeNode.type == 'orgId' || treeNode.type == 'deptId') {
                                            page = 'person_list';
                                            title = '人员列表';
                                            content = '<iframe frameborder="0" height="100%" width="100%" src="page_' + page + '.action?type=' + treeNode.type + '&id=' + treeNode.id + '"></iframe>'
                                        } else if (treeNode.type == 'personId') {
                                            page = 'person_detail';
                                            title = '个人详情';
                                            content = '<iframe frameborder="0" height="100%" width="100%" src="personAction_query?personId='  + treeNode.id + '"></iframe>'
                                        } else {
                                            page = 'error';
                                            title = '错误';
                                        }
                                        var e = $('#tt').tabs("exists", title);


                                        if (e) {
                                            $('#tt').tabs("select", title);
                                            var tab = $('#tt').tabs("getSelected");
                                            $('#tt').tabs("update", {
                                                tab: tab,
                                                options: {
                                                    content: content
                                                }
                                            });


                                        } else {
                                            $("#tt").tabs("add", {
                                                title: title,
                                                closable: true,
                                                content: content
                                            });
                                        }
                                    }
                                }
                            }
                        };
                        var url = "mainTreeAction_initTree";
                        $.post(url, {}, function (data) {
                            $.fn.zTree.init($("#ztree2"), setting2, data);
                        }, 'json');
                    });
                </script>


            </div>
        </div>
        <div title="机构设置" data-options="iconCls:'icon-house'" style="overflow:auto;width:100%;">
            <div class="easyui-panel" style="padding:5px;height:100%">
                <ul id="ztree3" class="ztree"></ul>
                <script type="text/javascript">
                    $(function () {
                        var setting3 = {
                            data: {
                                simpleData: {
                                    enable: true
                                }
                            },
                            callback: {
                                onClick: function (event, treeId, treeNode) {
                                    if (treeNode.type != undefined) {
                                        var page;
                                        var title;
                                        var content;
                                        if (treeNode.type == 'orgId' || treeNode.type == 'deptId') {
                                            page = 'person_list';
                                            title = '人员列表';
                                            content = '<iframe frameborder="0" height="100%" width="100%" src="page_' + page + '.action?type=' + treeNode.type + '&id=' + treeNode.id + '"></iframe>'
                                        } else if (treeNode.type == 'personId') {
                                            page = 'person_detail';
                                            title = '个人详情';
                                            content = '<iframe frameborder="0" height="100%" width="100%" src="personAction_query?personId='  + treeNode.id + '"></iframe>'
                                        } else {
                                            page = 'error';
                                            title = '错误';
                                        }
                                        var e = $('#tt').tabs("exists", title);


                                        if (e) {
                                            $('#tt').tabs("select", title);
                                            var tab = $('#tt').tabs("getSelected");
                                            $('#tt').tabs("update", {
                                                tab: tab,
                                                options: {
                                                    content: content
                                                }
                                            });


                                        } else {
                                            $("#tt").tabs("add", {
                                                title: title,
                                                closable: true,
                                                content: content
                                            });
                                        }
                                    }
                                }
                            }
                        };
                        var url = "mainTreeAction_initOrgTree";
                        $.post(url, {}, function (data) {
                            $.fn.zTree.init($("#ztree3"), setting3, data);
                        }, 'json');
                    });
                </script>


            </div>
        </div>
        <div title="统计数据" data-options="iconCls:'icon-chart_bar'" style="overflow:auto;width:100%;">
        </div>

        <div title="系统配置" data-options="iconCls:'icon-cog'" style="overflow:auto;width:100%;">

        </div>
    </div>
</div>

<div data-options="region:'south',border:false"
     style="height:60px;background: url(/img/background-person-info4.gif);border-width: 6px 0px 0px 0px;border-color:#e0ecff;padding:10px;">
    south region
</div>
<div data-options="region:'center',border:false">
    <div id="tt" class="easyui-tabs" data-options="fit:true">
        <div id="tt1" title="首页" data-options="closable:true" style="overflow: hidden">
            <iframe src="${pageContext.request.contextPath}/center.jsp" style="width: 100%;height:100%"
                    scrolling="auto"></iframe>
        </div>
    </div>


</div>
</body>

</html>