<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title></title>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<meta name="keywords" content="">
<meta name="discription" content="">
<link rel="stylesheet" type="text/css" href="../hcss/homecss.css" />


</head>
<body>

 <tiles:insertAttribute name="top"></tiles:insertAttribute>
<div class="content">
 <tiles:insertAttribute name="left"></tiles:insertAttribute>
</div>
<tiles:insertAttribute name="main"></tiles:insertAttribute>
</body>
</html>
