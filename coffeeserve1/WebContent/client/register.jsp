<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../css/css.css" rel="stylesheet">
<link href="../css/registercss.css" rel="stylesheet">
</head>
<body>
<header>
<a href="/" id="logo"><img src="../images/logo.png" alt=""/><h1>Coffee</h1></a>
 <div id="wrap-menu">                    
   <ul id="header-menu">
     <li><a href="http://localhost:8080/coffeeserve1/index.jsp">网站首页</a></li>
     <li><a href="http://localhost:8080/coffeeserve1/login.jsp">登陆</a></li>
     <li><a href="http://localhost:8080/coffeeserve1/client/tofind">下订单</a></li>
     <li><a href="http://localhost:8080/coffeeserve1/food/toshow">后台管理</a></li>
     <li><a href="http://localhost:8080/coffeeserve1/client/add.action">注册会员</a></li>
     <li><a href="http://localhost:8080/coffeeserve1/index.jsp">友情链接</a></li>
    </ul>
</div>            
</header>
<div id="rcontainer">
<s:form method="post" action="add" namespace="/client">

<TABLE width="950" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#99CCFF">



  <TR class="register_table_line">
    <TD width="160"  align="right" bgcolor="#E7FBFF"></TD>
    <TD align="left" bordercolor="#E7E3E7"><s:textfield name="mv.mname" key="member.add.mname"></s:textfield>
</TD>
  </TR>
  <TR class="register_table_line">
    <TD width="160" align="right" bgcolor="#E7FBFF"></TD>
    <TD align="left" bordercolor="#E7E3E7"> <s:textfield name="mv.mpassword" key="member.add.mpassword"></s:textfield>
</TD>
  </TR>
  <!-- 
  <TR class="register_table_line">
    <TD width="160" height="0" align="right" bgcolor="#E7FBFF">再次输入密码：</TD>
    <TD height="0" align="left" bordercolor="#E7E3E7"><INPUT name="rpass" type="password" 

class="register_textBroader"  id="rpass" size="26"></TD>
  </TR>
  -->
  <TR class="register_table_line">
    <TD width="160" height="0" align="right" bgcolor="#E7FBFF"></TD>
    <TD height="0" align="left" bordercolor="#E7E3E7"><s:textfield name="mv.memail" key="member.add.memail"></s:textfield></TD>
  </TR>
  <TR class="register_table_line">
    <TD width="160" align="right" bgcolor="#E7FBFF"></TD>
    <TD align="left" bordercolor="#E7E3E7">
   <s:radio name="mv.msex" key="member.add.msex" list="#{0:'男',1:'女'}" ></s:radio> 
		
    </TD>
  </TR>
  <TR class="register_table_line">
    <TD width="160" align="right" bgcolor="#E7FBFF"></TD>
    <TD align="left" bordercolor="#E7E3E7">
    <s:checkboxlist name="behaves" list="behaveList" listKey="no" listValue="name" key="member.add.behave"></s:checkboxlist>
	
	</TD>
  </TR>
  <TR class="register_table_line">
    <TD width="160" align="right" bgcolor="#E7FBFF"></TD>
    <TD align="left" bordercolor="#E7E3E7">
		
		<s:select name="mv.fk.fkid" list="foodkindList" listKey="fkid" listValue="fkname" key="member.add.fkid"></s:select>
		
	</TD>
  </TR>
  <TR class="register_table_line">
    <TD width="160" height="35" align="right" bgcolor="#E7FBFF">
        <INPUT type="reset" name="Reset" value=" 重   填 "></TD>
    <TD height="35" align="left" bordercolor="#E7E3E7">
		<INPUT type="submit" name="Button" value="同意以下服务条款，提交注册信息">
	</TD>
  </TR>
  <TR>
    <TD colspan="2"><TABLE width="760" border="0">
      <TR>
        <TD height="36">
			<H4><IMG src="../images/read.gif" width="35" height="26">阅读服务协议 </H4>
	    </TD>
      </TR>
      <TR>
        <TD height="120">
			<TEXTAREA name="textarea" cols="80" rows="6">
欢迎阅读服务条款协议，本协议阐述之条款和条件适用于您使用coffee.com网站的各种工具和服务。
本服务协议双方为coffee与coffee网用户，本服务协议具有合同效力。 
coffee的权利和义务
1.coffee有义务在现有技术上维护整个网上交易平台的正常运行，并努力提升和改进技术，使用户网上交易活动的顺利。 
2.对用户在注册使用coffee网上交易平台中所遇到的与交易或注册有关的问题及反映的情况，coffee应及时作出回复。 
3.对于在coffee网网上交易平台上的不当行为或其它任何coffee认为应当终止服务的情况，coffee有权随时作出删除相关信息、终止服务提

供等处理，而无须征得用户的同意。 
4.因网上交易平台的特殊性，coffee没有义务对所有用户的注册资料、所有的交易行为以及与交易有关的其他事项进行事先审查。 	
		  </TEXTAREA>
		</TD>
      </TR>
    </TABLE></TD>
  </TR>
 
</TABLE>
</s:form>
</div>
</body>
</html>