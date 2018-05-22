<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>Test1</title>
		<script src="${pageContext.request.contextPath}/js/echarts.js"></script>
		<script src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
	</head>

	<body>
		<div id="test1" style="width: 600px;height:400px;"></div>

		<script type="text/javascript">
			var myChart = echarts.init(document.getElementById('test1'));
			var count = 1;
			$.post("${pageContext.request.contextPath}/json/test1.json","",function(data){
				var names = [];
				var nums = [];

			    if(data){
				    for(var i=0;i<data.length;i++){
						names.push(data[i].name);
						nums.push(data[i].data);
					}
					myChart.setOption({
                        title: {
                            text: 'test1'
                        },
                        legend:{
                            data:['aaa']
                        },
						xAxis:{
						    data:names
						},
                        yAxis:{},
						series:[{
						    name:'aaa',
                            type:'bar',
							data:nums
						}]
					});
				}
			},'json');

		</script>

	</body>
</html>