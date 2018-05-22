$(function () {
    $(".easyui-textbox").textbox({
        labelPosition: 'before',
        labelWidth: '70',
        width: '180'
    });
    $(".easyui-textbox ").css("text-align", "center");
    $(".easyui-combobox ").css("text-align", "center");
    $(".easyui-datebox ").css("text-align", "center");
    $(".easyui-combotree").css("text-align", "center");
    $(".easyui-combobox").combobox({
        labelPosition: 'before',
        labelWidth: '70'

    });

    $('#list_grid').datagrid({
        loadMsg: '加载中，请耐心等待……',
        singleSelect: true,
        collapsible: false,
        fir: true,
        method: 'get',
        toolbar: '#tb',
        fit: true,
        border: false,
        rownumbers: true,
        idField: 'familyPersonId',

    });

    $('.easyui-filebox').filebox({
        buttonText: '浏览',
        width: 100
    });
    $('#picture-upload-window').window({
        iconCls: 'icon-save',
        modal: true,
        minimizable: false,
        collapsible: false,
        maximizable: false,
        title: '照片上传',
        width: 600,
        height: 400
    });
    $('#basicinfo-edit-window').window({
        iconCls: 'icon-save',
        modal: true,
        minimizable: false,
        collapsible: false,
        maximizable: false,
        title: '基本信息修改',
        width: 700,
        height: 400
    });
    $('#personName').textbox({
        label: '姓名'
    });
    $('#foreignName').textbox({
        label: '外文名'
    });
    $('#usedName').textbox({
        label: '曾用名'
    });
    $('#gender').combobox({
        label: '性别'
    });
    $('#birthday').datebox({
        label: '出生日期',
        width:180
    });
    $('#nationality').combobox({
        label: '国籍',
        width:180
    });
    $('#ethnicity').combobox({
        label: '民族',
        width:180
    });
});