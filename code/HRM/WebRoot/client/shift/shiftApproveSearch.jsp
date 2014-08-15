<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<jsp:include page="../platform/cbb/head.jsp"/>
		<jsp:include page="../platform/cbb/js.jsp"/>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<script type="text/javascript" src="lib/unicoinadmin/js/My97DatePicker/WdatePicker.js"></script>
		
		<title>加油站排班系统</title>
		
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="../lib/unicoinadmin/css/bootstrap.min.css" />
		<link rel="stylesheet" href="../lib/unicoinadmin/css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="../lib/unicoinadmin/css/uniform.css" />
		<link rel="stylesheet" href="../lib/unicoinadmin/css/select2.css" />	
		<link rel="stylesheet" href="../lib/unicoinadmin/css/tree.css" />			
		<link rel="stylesheet" href="../lib/unicoinadmin/css/unicorn.main.css" />
		<link rel="stylesheet" href="../lib/unicoinadmin/css/unicorn.grey.css" class="skin-color" />	
		<style type="text/css" mce_bogus="1">  
		  table th{
					white-space: nowrap;
				}
				table td{
					white-space: nowrap;
				}
				body,table{
				 font-size:12px;
				}
		  table{
				 empty-cells:show; 
				 border-collapse: collapse;
				 margin:0 auto;
				}
		  </style>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	</head>
<body>
<!-----标题栏----->
<jsp:include page="../platform/cbb/title.jsp"/>

<!---快捷信息操作栏---->
<jsp:include page="../platform/cbb/info.jsp"/>
<!---快捷操作栏---->
<!----菜单栏--->
<jsp:include page="../platform/cbb/menu.jsp"/>
<!----菜单栏--->
<!----内容栏--->
	<div id="content">
		  <div id="content-header">
			<h1>${page_pageName}</h1>
		  </div>
		  <!---面包屑导航---->
		  <jsp:include page="../platform/cbb/bread.jsp"/>
		  <!---End 面包屑导航---->
		  <!----内容页---->
		  <div class="container-fluid">
		   <div class="row-fluid">
				<form action="<%=request.getContextPath()%>/shiftApproveSearch.do" method="post" class="form-horizontal" name="shiftsForm">
					<h6>排班综合情况</h6>
					<table class="table table-striped table-bordered table-hover table-condensed">
						<thead>
							<tr>
								<th class="span3">油站名称</th>
								<th class="span3">经营管理部</th>
								<th class="span3">营业时长</th>
								<th class="span3">营业时段</th>
							
							
							</tr>
						</thead>
						<tbody>
							<tr>

								<td style="text-align:center"><s:textfield name="gasStationName" value="%{GasStationForm.gasStationName}" readonly="true" class="span12"></s:textfield></td>
								<td style="text-align:center"><s:textfield name="businessDept" value="%{GasStationForm.businessDept}" readonly="true" class="span12"></s:textfield></td>								
								<td style="text-align:center"><s:textfield name="openHours" value="%{GasStationForm.GasStationInfoForm.openHours}" readonly="false" class="span12"></s:textfield></td>
								<td style="text-align:center"><s:textfield name="openTime" value="%{GasStationForm.GasStationInfoForm.openTime}" readonly="false" class="span12"></s:textfield></td>
							</tr>
						</tbody>
  
				
						<thead>
							<tr>
								<th style="width:100px">排班方式</th>

								<th class="span4">持卡比例</th>
								<th class="span4">月销量（吨）</th>
								<th class="span4">非油月销售额（万元/月）</th>
							
							</tr>
						</thead>
						<tbody>
							<tr>

								<td style="text-align:center">
									
										
											<select multiple="" name = "shiftType" class="span12" >
	
												<c:forEach var="i" items= "${shiftTypeList}"> 																								  
												<option id="${i}"/>${i}	
																					
												</c:forEach>
											</select>
										
									
								  </td>
								<td style="text-align:center"><s:textfield name="cardProportion" value="%{GasStationForm.GasBusinessForm.cardProportion}" readonly="false" class="span12"></s:textfield></td>
								<td style="text-align:center"><s:textfield name="oilSalesVolume" value="%{GasStationForm.GasBusinessForm.oilSalesVolume}" readonly="false" class="span12"></s:textfield></td>
								<td style="text-align:center"><s:textfield name="commoditySalesVolume" value="%{GasStationForm.GasBusinessForm.commoditySalesVolume}" readonly="false" class="span12"></s:textfield></td>	
							
							</tr>
						</tbody>
						<thead>
							<tr>
								<th>编制人数</th>
								<th>用工人数</th>
								<th>平均每日休息员工数</th>
								<th>月均休息人数</th>
								
							
							</tr>
						</thead>
						<tbody>
							<tr>
								<td style="text-align:center"><s:textfield name="employeesLimit" value="%{GasStationForm.GasShiftInfoForm.employeesLimit}" readonly="false" class="span12"></s:textfield></td>
								<td style="text-align:center"><s:textfield name="employeesNum" value="%{GasStationForm.GasShiftStatsForm.employeesNum}" readonly="false" class="span12"></s:textfield></td>
								<td style="text-align:center"><s:textfield name="avgRestEmployeesPerDay" value="%{GasStationForm.GasShiftStatsForm.avgRestEmployeesPerDay}" readonly="false" class="span12"></s:textfield></td>
								<td style="text-align:center"><s:textfield name="avgRestDaysPerMonth" value="%{GasStationForm.GasShiftStatsForm.avgRestDaysPerMonth}" readonly="false" class="span12"></s:textfield></td>	
							
							</tr>
						</tbody>
					</table>
	                
					<h6>班次管理</h6>
				<div class="buttons"  id="shifts">
									<a id="add-event" data-toggle="modal" href="#modal-add-event" class="btn btn-success btn-mini"><i class="icon-plus icon-white"></i> 新增班次</a>
									
									<div class="modal hide" id="modal-add-event">
										 <div class="modal-header">
											<button type="button" class="close" data-dismiss="modal">×</button>
											<h3>新建班次信息输入</h3>
										</div>
										<div class="modal-body">
											<p>班号</p>
											<p><input id="classNumber" type="text" name="classNumber" value="C"/></p>
											<p>班名称</p>
											<p><input id="className" type="text" name="className" value="晚班"/></p>
											<p>工作时间</p>
											<p>
											<span>
											<input id="startTime" type="text" name="startTime" onclick="WdatePicker({dateFmt:'HH:mm'})"  style="width:100px"/>
											</span>
											<font face="Microsoft YaHei" size=3>-</font>
											<span>
											<input id="endTime" type="text" name="endTime" onclick="WdatePicker({dateFmt:'HH:mm'})" style="width:100px"/>
											</span>
											</p>
											
											<p>时间段</p>
											<p><input id="timeSegment" type="text" name="timeSegment" value="7"/></p>
											<p>当月平均每班休息人数</p>
											<p><input id="restAmount" type="text" name="restAmount" value="2"/></p>											
										</div>
										<div class="modal-footer">
											<a href="#" class="btn" data-dismiss="modal">取消</a>
											<a  id="add-event-submit" class="btn btn-primary" onclick="addShift()" href="#" data-dismiss="modal">确定</a>
										</div>
									</div>
								</div>
					<table class="table table-striped table-bordered table-hover table-condensed" id="shiftsInfo" >
						<thead>

							<tr >
								<th style="width:30px">班号</th>
								<th style="width:50px">班名称</th>
								<th class="span6">时间段</th>
								<th style="width:60px">工作时间(小时)</th>
								<th style="width:100px">当月平均每班人数(人)</th>
								<th style="width:60px">调整班次</th>

							</tr>
						</thead>
						<tbody id="shiftTable">
						
						<!-- iterator标签进行数组遍历 -->
						<s:iterator  var="i" value="shiftsInfoList">
						<tr >
						<td style="text-align:center"><s:property value="i.classNumber"/> </td>
						<td style="text-align:center"><s:property value="i.className"/> </td>
						<td style="text-align:center"><s:property value="i.startTime"/>
						<span>
						<font face="Microsoft YaHei" size=3>-</font>
						</span>
						<s:property value="i.endTime"/> </td>
						<td style="text-align:center"><s:property value="i.timeSegment"/> </td>
						<td style="text-align:center"><s:property value="i.restAmount"/> </td>
						<td style="text-align:center">
																						
						<span class="icon" ><a href="#editGroup" role="button"  title="编辑班次" class="tip-bottom" data-toggle="modal"><i class="icon-pencil"></i></a></span>
						&nbsp&nbsp
						<span class="icon" ><a class="tip-bottom" href="charts.html" title="删除班次"><i class="icon-remove"></i></a></span>
						</td>
						</tr>
						</s:iterator>
							<tr>
								<td name="shiftType" style="text-align:center">A</td>
								<td style="text-align:center">早班</td>
								<td style="text-align:center">07:00-15:00</td>
								<td style="text-align:center">8</td>
								<td style="text-align:center">3.4</td>
								<td style="text-align:center">
																						
									<span class="icon" ><a href="#editGroup" role="button"  title="编辑班次" class="tip-bottom" data-toggle="modal"><i class="icon-pencil"></i></a></span>
									&nbsp&nbsp
									<span class="icon" ><a class="tip-bottom" href="charts.html" title="删除班次"><i class="icon-remove"></i></a></span>
								</td>
							</tr>
							<tr>
								<td name="shiftType" style="text-align:center">B</td>
								<td style="text-align:center">中班</td>
								<td style="text-align:center">15:00-23:00</td>
								<td style="text-align:center">8</td>
								<td style="text-align:center">3</td>
								<td style="text-align:center">
									<span class="icon" ><a href="#editGroup" role="button"  title="编辑班次" class="tip-bottom" data-toggle="modal"><i class="icon-pencil"></i></a></span>
									&nbsp&nbsp
									<span class="icon" ><a class="tip-bottom" href="charts.html" title="删除班次"><i class="icon-remove"></i></a></span>
								</td>
							</tr>
						</tbody>
					</table>
	  
	  
					
					
										
				<h6>排班表</h6>
										

			    <div style=" height:500px ;overflow:scroll;">
			
					<table class="table table-striped table-bordered table-hover table-condensed" valign="middle">
							<thead>
								<tr>
									<th width="span4" colspan="3">员工信息</th>
									<th width="span4" colspan="5">统计信息</th>
									<th class="span4" colspan="31" >排班信息</th>
													
								</tr>
								<tr>
									<th style="width:40px">操作</th>
									<th style="width:70px">员工姓名</th>
									<th style="width:70px">岗位</th>	
									
								
									
									<th style="text-align:center">1</th>
									<th>2</th>
									<th>3</th>
									<th>4</th>
									<th>5</th>
									<th>6</th>
									<th>7</th>
									<th>8</th>
									<th>9</th>
									<th>10</th>
									<th>11</th>
									<th>12</th>
									<th>13</th>
									<th>14</th>
									<th>15</th>
									<th>16</th>
									<th>17</th>
									<th>18</th>
									<th>19</th>
									<th>20</th>
									<th>21</th>
									<th>22</th>
									<th>23</th>
									<th>24</th>
									<th>25</th>
									<th>26</th>
									<th>27</th>
									<th>28</th>
									<th>29</th>
									<th>30</th>
									<th>31</th>		
									<th style="width:140px">累计工作时长</th>	
									<th style="width:140px">法定节假日工作时长</th>	
									<th style="width:140px">超时工作时长</th>
									<th style="width:140px">工作天数</th>
									<th style="width:140px">休息天数</th>									
								</tr>
							</thead>
							<tbody>
								<tr>
									<td style="text-align:center "  ><span class="icon" ><a class="tip-bottom" href="charts.html" title="删除员工"><i class="icon-remove"></i></a></span></td>								
									<td style="text-align:center">张三</td>
									<td style="text-align:center ;width:100px">站长</td>
																							
								
									
									
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center" type="text" /></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center">80</td>
									<td style="text-align:center">80</td>
									<td style="text-align:center">80</td>
									<td style="text-align:center">12</td>
									<td style="text-align:center">5</td>
								</tr>	
									<tr>
									<td style="text-align:center"><span class="icon" ><a class="tip-bottom" href="charts.html" title="删除员工"><i class="icon-remove"></i></a></span></td>								
									<td style="text-align:center">李四</td>
									<td style="text-align:center ;width:100px">营业员</td>
									
								
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
									<td style="text-align:center"><input type="text" style="width:20px;text-align:center"/></td>
								
										<td style="text-align:center">80</td>
									<td style="text-align:center">80</td>
									<td style="text-align:center">80</td>
									<td style="text-align:center">12</td>
									<td style="text-align:center">5</td>
								</tr>
								<tr>
									<th colspan="8" width="span6"><span>用Excel表导入<input type="file" /><button class="btn btn-small btm-primary">导入</button></span></th>			
									<th colspan="31" width="span6"><a href="charts.html"><span class="icon" ></span><i class="icon-plus"></i>增加员工</span></a></th>			
								</tr>
							</tbody>
					</table> 
				</div>
				
				
				
			
			<hr>
				<div align=" right">
												
							<ul class="quick-actions-horizontal">
								<li>
									<a href="#">
										<i class="icon-download"></i>
										<span>下载排班表</span>
									</a>
								</li>												
							</ul>
							<button class="btn btm-primary">提交</button>		
							<button class="btn btm-primary">返回</button>	
							
			    </div>
			
			
						
			
			
			
				
				

             </form>
			</div>
				
					<!----内容页完---->
					<!----尾部声明---->
		</div>
		<jsp:include page="../platform/cbb/footer.jsp"/>
		   
	</div>
    <script language="JavaScript" type="text/javascript">

			function addShift()
			{   

				var table=document.getElementById("shiftTable");
				var lastHTML=table.innerHTML;
				
				var classNumber=document.getElementById("classNumber").value;
				var className=document.getElementById("className").value;
				var startTime=document.getElementById("startTime").value;
				var endTime=document.getElementById("endTime").value;
				var timeSegment=document.getElementById("timeSegment").value;
				var restAmount=document.getElementById("restAmount").value;
				
				var arr = new Array(2)
				arr[0]=startTime;
				arr[1]=endTime;
				var classTime=arr.join("-");
				
				var newRow=
				"<td style=\"text-align:center\">"+
				classNumber
				
				+"</td>	<td style=\"text-align:center\">"+
				className
				+"</td><td style=\"text-align:center\">"+
				classTime
				+"</td>	<td style=\"text-align:center\">"+
				timeSegment
				+"</td><td style=\"text-align:center\">"+
				restAmount
				
						
				+"<td style=\"text-align:center\"><span class=\"icon\" ><a href=\"#editGroup\" role=\"button\"  title=\"编辑班次\" class=\"tip-bottom\" data-toggle=\"modal\"><i class=\"icon-pencil\"></i></a></span>"
				+"&nbsp&nbsp&nbsp&nbsp"
				+"<span class=\"icon\" ><a class=\"tip-bottom\" href=\"charts.html\" title=\"删除班次\"><i class=\"icon-remove\"></i></a></span></td>";

				table.innerHTML=lastHTML+newRow;
            }
		   </script>
			
			
			
			
            <script src="js/jquery.min.js"></script>
			<script src="js/tree.js"></script>
            <script src="js/jquery.ui.custom.js"></script>
            <script src="js/bootstrap.min.js"></script>
            <script src="js/jquery.uniform.js"></script>
            <script src="js/select2.min.js"></script>
            <script src="js/jquery.dataTables.min.js"></script>
            <script src="js/unicorn.js"></script>
            <script src="js/unicorn.tables.js"></script>	
</body>
</html>