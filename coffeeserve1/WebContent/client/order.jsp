<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../css/ocss.css" rel="stylesheet">
</head>
<body>
<header>
<a href="/" id="logo"><img src="../images/logo.png" alt=""/><h1>Coffee</h1></a>
 <div id="wrap-menu">                    
   <ul id="header-menu">
     <li><a href="/">网站首页</a></li>
     <li><a href="/">登陆</a></li>
     <li><a href="/">下订单</a></li>
     <li><a href="home/home.html">后台管理</a></li>
     <li><a href="register/registerl.html">注册会员</a></li>
     <li><a href="/">友情链接</a></li>
    </ul>
</div>            
</header>
<div class="tu">   <img src="../images/buy_process01[1].gif" width="760" height="55" /></div>
<div class="buy_com_tablehead">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;确认菜品价格与交易条件</div>
<div class="buy_com_formhead">
 <table width="99%" border="0">
    <tr>
      <td width="10%" align="center">我要购买</td>
      <td width="20%" align="left">图片</td>
      <td width="50%" align="left">名称</td>
      <td width="10%" align="left">价格</td>
    </tr>
	 <TR>
      <TD colspan="4"><hr noshade="noshade" style="border:1px  #CCCCCC dashed " /></TD>
    </TR>
  
    <s:if test="foodlist!=null">
	<s:iterator value="foodlist">
	<tr>
	<td width="10%" rowspan="3" align="center"><input type="checkbox" value="1" name="auction_id"/></td>
    <td width="20%" rowspan="3"><!--<a href="photoshow.action?fid=<s:property value="fid"/>"></a>--><img src='photoshow.action?fid=<s:property value="fid"/>' width="74" height="74" border="0"/></td>
	<td width="50%"><s:property value="fname"/></td>		
	<td width="10%" rowspan="3"><s:property value="fprice"/></td>
	
	</tr>
	<tr>
      <td width="50%"><!--  种类：<s:property value="fkid"/>--></td>
    </tr>
    <tr>
      <td width="50%" valign="middle">
	<!--  <a href="#">。。</a> &nbsp;&nbsp;-->
	  <a href="#"> <img src="../images/list_tool_fav1.gif" width="12" height="12"  border="0" /> 收藏</a>	  </td>
    </tr>
     <TR>
      <TD colspan="4"><hr noshade="noshade" style="border:1px  #CCCCCC dashed " /></TD>
    </TR>
    </s:iterator>
   
	</s:if>
   
   
   
	
   


  </table>
  <p>&nbsp; </p>
</div>
</body>
</html>