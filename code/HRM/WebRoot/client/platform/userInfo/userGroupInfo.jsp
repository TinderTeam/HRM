<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
	<head>
		<jsp:include page="../cbb/head.jsp"/>
		<jsp:include page="../cbb/js.jsp"/>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
<body>
<!-----标题栏----->
<jsp:include page="../cbb/title.jsp"/>

<!---快捷信息操作栏---->
<jsp:include page="../cbb/info.jsp"/>
<!---快捷操作栏---->
<!----菜单栏--->
<jsp:include page="../cbb/menu.jsp"/>
<!----菜单栏--->
<!----内容栏--->
	<div id="content">
		  
		  <!---面包屑导航---->
		  <jsp:include page="../cbb/bread.jsp"/>
		  <!---End 面包屑导航---->
	<div class="row-fluid">
		<div class="span12">
	    	<div class="widget-box">
				<div class="widget-title">
					<span class="icon">
						<i class="icon-th"></i>
					</span>
		       		<h5>用户信息</h5>
		   		</div>

 
   					<div class="widget-content nopadding">	
       					<s:form action="user/groupManage" method="POST" theme="simple">	
	       					<div class="form-horizontal">
	       						<div class="control-group">
	       						    <s:hidden name="groupManage.userGroup.groupID"  value="%{groupManage.userGroup.groupID}"/>
	       						    
	       							<div class="control-label">
	        							<s:text name="用户组名称"/>
	        						</div>
					                 <div class="controls">
					                    <s:textfield name="groupManage.userGroup.groupName"/>					                       
									 </div>
								</div>
								<div class="control-group">
	       							<div class="control-label">
	        							<s:text name="用户组描述"/>
	        						</div>
					                 <div class="controls">
					                    <s:textfield name="groupManage.userGroup.groupDesp"/>					                       
									 </div>
								</div>
		 				 		 
	                 			<div class="form-actions">
		                 			<div class="offset10">
			                 			    <c:if test="${'create' == operateType}">
									       		<s:submit cssClass="btn btn-primary" name="create" value="新增" method="create"/>
					                  		</c:if>
					                  		<c:if test="${'modify' == operateType}">
					                       		
					                       		<s:submit cssClass="btn btn-primary" name="modify" value="修改" align="left" method="modify" />
					                   		</c:if> 
					               
					                       	<input class="btn btn-primary" type="submit"  name="cancel"  class="btn btn-success" value="取消"/>
		                 			</div>
			                    </div>
		                   	 </div>
	                    </s:form>
					</div>
					
 					<div class="container-fluid">		
						<div class="row-fluid">
										
							 <table class="table table-striped table-bordered table-hover table-condensed">
					       
					             <thead>
					                <tr>
					                    <th>功能名称</th>
					                    <th>功能描述</th>
					 					<th style="width:60px">操作</th>
					                </tr>
					            </thead>
					            <tbody>
					               <c:forEach var="function" items="${groupManage.userGroup.functionList}"> 						 
									  <tr>
					                    <td  style="text-align:center" >${function.functionName}</td>
					                    <td  style="text-align:center" >${function.functionDesp}</td>
					          
					                    <td  style="text-align:center">
					  						<span class="icon" ><a class="tip-bottom" href="groupManage!deleteFunction.action?selectedID=${userGroup.groupID}&operateType=delete" title="删除"><i class="icon-remove"></i></a></span>
					                    </td>		
					                  </tr>   
											 
									</c:forEach>
					         
					            </tbody>
					        </table>
        	         <a class="btn btn-primary offset10"  href="groupManage!show.action?selectedID=${userGroup.groupID}&operateType=create">新增</a>	
									</div>
					</div>
							
							
                     <c:set var="userList" value="${groupManage.userGroup.userList}" scope="request"/>
                     <c:set var="tableExtAttrNameList" value="${groupManage.userGroup.tableExtAttrNameList}" scope="request"/>	  
                    	<div class="container-fluid">		 	  
		        	<jsp:include page="./userInfoList.jsp"/>	
		        	</div>
			</div>
			</div>	
			
			<a href="#functionModal" data-toggle="modal" class="btn btn-primary">Modal dialog</a>
			<div id="functionModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"><i class="icon-remove"></i></button>
					<h3 id="ModalTitle"></h3>
				</div>
				
				<div class="modal-body">
								<table class="table table-bordered table-striped">
									<thead>
										<tr>
											<th style="width:150px">模块</th>
											<th class="span12">功能</th>						
										</tr>
									</thead>
									<tbody>	
										<tr>
											<td>
												<label class="checkbox">
													<input type="checkbox"> 系统维护
												</label>
											</td>
											<td>
												<div class="form-inline">
													<label class="checkbox">
														<input type="checkbox"> 系统参数修改
												 	 </label>
													<label class="checkbox">
														<input type="checkbox"> 基础数据维护
											 		 </label>
												</div>													
											</td>								
										</tr>	
										
										<tr>
											<td>
												<label class="checkbox">
													<input type="checkbox"> 用户管理
												</label>
											</td>
											<td>
												<div class="form-inline">
													<label class="checkbox">
														<input type="checkbox"> 用户信息管理
												 	 </label>
													<label class="checkbox">
														<input type="checkbox"> 用户密码重置
											 		 </label>
													 <label class="checkbox">
														<input type="checkbox"> 组织机构管理
											 		 </label>
												</div>													
											</td>								
										</tr>
										
										<tr>
											<td>
												<label class="checkbox">
													<input type="checkbox"> 用户组管理
												</label>
											</td>
											<td>
												<div class="form-inline">
													<label class="checkbox">
														<input type="checkbox"> 用户组管理
												 	 </label>												
												</div>													
											</td>								
										</tr>	
										
										<tr>
											<td>
												<label class="checkbox">
													<input type="checkbox"> 全选
												</label>
											</td>
											<td>
												<div class="form-inline">
													<button type="submit" class="btn btn-primary">保存</button>	
													<button type="submit" class="btn">返回</button>										
												</div>													
											</td>								
										</tr>		
									</tbody>
								</table>  
			
				</div>
				
				<div class="modal-footer">				  	
					
					<a id="ConformBtn" class="btn btn-danger" href="">确认</a>
					<button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
				</div>
			</div>
				
			
			
			
	
    </div>
     
		  <!---End 面包屑导航---->
		  <!----内容页---->
		  <div class="container-fluid">
				
					<!----内容页完---->
					<!----尾部声明---->
				<jsp:include page="../cbb/footer.jsp"/>
		   </div>
	</div>
	
</body>
</html>


