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
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
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
				
					<!----内容页完---->
					<!----尾部声明---->
				<jsp:include page="../platform/cbb/footer.jsp"/>
		   </div>
	</div>
	
</body>
</html>