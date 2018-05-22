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
        }

        table {
            border-width: 1px;
            border-color: #CC2222;
        }

        .title-person-detail {
            width: 80px;
            text-align: center;
        }

        .content-short-person-detail {
            width: 100px;
            text-align: center;
        }

        .content-long-person-detail {
            text-align: center;
        }

        .content {
            font-size: 14px;
            color: #ffce2e;
            border: 1px;
            margin: 0;
            padding: 4px;
            white-space: normal;
            vertical-align: top;
            outline-style: none;
            resize: none;
            -moz-border-radius: 5px 5px 5px 5px;
            -webkit-border-radius: 5px 5px 5px 5px;
            border-radius: 5px 5px 5px 5px;
            border-width: 2px;
        }
    </style>
</head>
<body>
<s:debug></s:debug>
<div>
    <a class="easyui-menubutton" data-options="iconCls:'icon-add',menu:'#mm'">修改基本信息</a>
    <div id="mm" align="right">
        <div onclick="$('#picture-upload-window').window('open')">上传照片</div>
        <div onclick="$('#basicinfo-edit-window').window('open')">修改基本信息</div>

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
            <td class="title-person-detail">
                姓名
            </td>
            <td class="content-short-person-detail">
                <span class="content"><s:property value="personName"></s:property></span>
            </td>
            <td class="title-person-detail">
                外文名
            </td>
            <td class="content-short-person-detail">
                <span class="content"><s:property value="foreignName"></s:property></span>
            </td>
            <td class="title-person-detail">
                曾用名
            </td>
            <td class="content-short-person-detail">
                <span class="content"><s:property value="usedName"></s:property></span>
            </td>
            <td class="tg-pic" rowspan="4" width="160px" align="center">
                <div style="text-align: center">
                    <img width="105" height="155"
                         src="<s:if test="photo==null">${pageContext.request.contextPath}/pictures/default.jpg</s:if>
                    <s:else>${pageContext.request.contextPath}/pictures/${photo}.jpg</s:else>"/>
                </div>
            </td>
        </tr>
        <tr>
            <td class="title-person-detail">
                性别
            </td>
            <td class="content-short-person-detail">
                <span class="content"><s:property value="gender.genderName"></s:property></span>
            </td>
            <td class="title-person-detail">
                出生日期
            </td>
            <td class="content-short-person-detail">
                <span class="content"><s:date name="birthday" format="yyyy-MM-dd"></s:date></span>
            </td>
            <td class="title-person-detail">
                国籍
            </td>
            <td class="content-short-person-detail">
                <span class="content"><s:property value="nationality.shortnameCn"></s:property></span>
            </td>

        </tr>
        <tr>
            <td class="title-person-detail">
                籍贯
            </td>
            <td class="content-short-person-detail">
                <span class="content"><s:property value="nativePlace.superDistirctCode.superDistirctCode.shortName"></s:property><s:property value="nativePlace.shortName"></s:property></span>
            </td>
            <td class="title-person-detail">
                出生地
            </td>
            <td class="content-short-person-detail">
                <span class="content"><s:property value="birthPlace.superDistirctCode.superDistirctCode.shortName"></s:property><s:property value="birthPlace.shortName"></s:property></span>
            </td>
            <td class="title-person-detail">
                户籍地
            </td>
            <td class="content-short-person-detail">
                <span class="content"><s:property value="domicilePlace.superDistirctCode.superDistirctCode.shortName"></s:property><s:property value="domicilePlace.shortName"></s:property></span>
            </td>

        </tr>
        <tr>
            <td class="title-person-detail">
                民族
            </td>
            <td class="content-short-person-detail">
                <span class="content"><s:property value="ethnicity.itemName"></s:property></span>
            </td>
            <td class="title-person-detail">
                健康状况
            </td>
            <td class="content-short-person-detail">
                <span class="content"><s:property value="health.itemName"></s:property></span>
            </td>
            <td class="title-person-detail">
                婚姻状况
            </td>
            <td class="content-short-person-detail">
                <span class="content"><s:property value="marriage.itemName"></s:property></span>
            </td>

        </tr>
        <tr>
            <td class="title-person-detail">
                身份证号
            </td>
            <td colspan="2" class="content-long-person-detail">
                <span class="content"><s:property value="identityCard"></s:property></span>
            </td>
            <td class="title-person-detail">
                家庭住址
            </td>
            <td colspan="3" class="content-long-person-detail">
                <span class="content"><s:property value="homeAddress"></s:property></span>
            </td>
        </tr>
        <tr>
            <td class="title-person-detail">
                手机号码
            </td>
            <td colspan="2" class="content-long-person-detail">
                <span class="content"><s:property value="phone"></s:property></span>
            </td>
            <td class="title-person-detail">
                电子邮箱
            </td>
            <td colspan="3" class="content-long-person-detail">
                <span class="content"><s:property value="email"></s:property></span>
            </td>
        </tr>
        <tr>
            <td class="title-person-detail">
                工作单位
            </td>
            <td colspan="2" class="content-long-person-detail">
                <span class="content"><s:property value="orgInfo.orgName"></s:property></span>
            </td>
            <td class="title-person-detail">
                所在科室
            </td>
            <td colspan="3" class="content-long-person-detail">
                <span class="content"><s:property value="deptInfo.deptName"></s:property></span>
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
               id="list_grid">
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
<!-- 照片上传 -->
<div id="picture-upload-window" class="easyui-window" style="width:500px;height:300px;padding:10px" closed="true">
    <div style="float: left;">
        <s:form id="picture-upload" method="post" action="uploadAction" enctype="multipart/form-data">
            <table cellpadding="5" align="center">
                <tr>
                    <td>
                        <img id="imgPre" style="height: 200px;margin: auto"
                             src=<s:if test="photo!=null">"${pageContext.request.contextPath}/pictures/${photo}.jpg"></s:if>
                        <s:else>"${pageContext.request.contextPath}/pictures/default.jpg"</s:else>
                        align="center"/>
                    </td>
                </tr>
                <tr>
                    <td align="left"><s:file onchange="preImg(this.id,'imgPre');" name="upload"/></td>
                </tr>
                <tr>
                    <td><input type="submit"></td>
                </tr>
                <tr>
                    <td><input type="hidden" name="personId" value="${personId}"></td>
                </tr>
                <script type="text/javascript">
                    /**
                     * 从 file 域获取 本地图片 url
                     */
                    function getFileUrl(sourceId) {
                        var url;
                        if (navigator.userAgent.indexOf("MSIE") >= 1) { // IE
                            url = document.getElementById(sourceId).value;
                        } else if (navigator.userAgent.indexOf("Firefox") > 0) { // Firefox
                            url = window.URL.createObjectURL(document.getElementById(sourceId).files.item(0));
                        } else if (navigator.userAgent.indexOf("Chrome") > 0) { // Chrome
                            url = window.URL.createObjectURL(document.getElementById(sourceId).files.item(0));
                        }
                        return url;
                    }

                    /**
                     * 将本地图片 显示到浏览器上
                     */
                    function preImg(sourceId, targetId) {
                        var url = getFileUrl(sourceId);
                        var imgPre = document.getElementById(targetId);
                        imgPre.src = url;
                    }

                </script>
            </table>
        </s:form>
    </div>
    <div>
        <table style="font-size: 16px;line-height: 25px">
            <tr style="height: 60px">
                <td>上传照片必须为：</td>
            </tr>
            <tr style="height: 60px">
                <td>1.近期一寸免冠彩色证件照，禁止上传生活照、艺术照、集体照</td>
            </tr>
            <tr style="height: 60px">
                <td>2.图片格式：jpg格式、文件大小50KB以内、宽:120px、高:150px</td>
            </tr>
            <tr style="height: 60px">
                <td>3.照片必须清晰，完整</td>
            </tr>
        </table>
    </div>
</div>
<div id="basicinfo-edit-window" class="easyui-window" style="width:500px;height:300px;padding:10px" closed="true">
    <div style="float: left;">
        <s:form id="basicinfo-edit" method="post" action="personAction_edit">
            <table cellpadding="5" align="center">
                <tr>
                    <td style="padding-right: 30px">
                        <input id="foreignName" class="easyui-textbox" name="foreignName"
                               value="<s:property value="foreignName"></s:property> ">
                    </td>
                    <td>
                        <input id="usedName" class="easyui-textbox" name="usedName"
                               value="<s:property value="usedName"></s:property> ">
                    </td>
                    <td>
                        <input id="gender" class="easyui-combobox" name="gender"
                               data-options="valueField: 'genderId',textField: 'genderName',url: 'dicGenderAction_list',width:150,value:<s:property value='gender.genderId'/>">
                    </td>
                </tr>
                <tr>
                    <td>
                        <input id="birthday" name="birthday" type="text" class="easyui-datebox" required="required"
                               value="<s:date name="birthday" format="MM/dd/yyyy"/>"> </input>
                    </td>
                    <td>
                        <input id="nationality" class="easyui-combobox" name="nationality"
                               data-options="valueField: 'id',textField: 'shortnameCn',url: 'dicNationAction_list',width:150,value:'<s:property value="nationality.shortnameCn"></s:property>'">
                    </td>
                    <td>
                        <input id="ethnicity" class="easyui-combobox" name="ethnicity"
                               data-options="valueField: 'id',textField: 'itemName',url: 'dicEthnicityAction_list',width:150,value:'<s:property value="ethnicity.itemName"></s:property>'">
                    </td>
                </tr>
                <tr>
                    <td>

                    </td>
                    <td>

                    </td>
                    <td>
                        <input type="submit">
                    </td>
                </tr>

            </table>
        </s:form>
    </div>
</div>
</body>

</html>