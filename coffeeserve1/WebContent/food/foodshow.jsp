<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title></title>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<meta name="keywords" content="">
<meta name="discription" content="">
<link rel="stylesheet" type="text/css" href="../hcss/homecss.css" />
<script src="../js/jquery-1.4.4.min.js" type="text/javascript"></script>  
<script type="text/jscript">  
        $(document).ready(function() {  
           // $("table").attr("bgColor", "#222222"); //设置表格的背景颜色   
        //    $("tr").attr("bgColor", "#3366CC"); //为单数行表格设置背景颜色   
            $("tr:even").css("background-color", "#CFF"); //为双数行表格设置背颜色素  
        //    $("table").css("width", "300px"); //为表格添加样式，设置表格长度为300像素  
        });  
  
    </script>  

</head>
<body>

<div class="header">
<a href="/" id="logo"><img src="../images/logo.png" alt=""/><h1>后台管理</h1></a>			
			</div>
<div class="content">
<div class="sysmenua">
				<ul>
					<li><a href="">后台首页</a></li>
					<li><a href="">食品管理</a></li>
					<li><a href="">服务人员管理</a></li>
					<li><a href="">订单管理</a></li>
					<li><a href="">会员管理</a></li>
					<li><a href="">营业额管理</a></li>
					<li><a href="../indexl.html">返回</a></li>
				</ul>
			</div>
</div>
<div class="sysmenub">

<table width="100%" class="datatable">
<caption> 食品列表</caption>
<tr>
<th scope="col" >编号</th>
<th scope="col">菜品名称</th>
<th scope="col">菜品种类</th>
<th scope="col">菜品库存</th>
<th scope="col" >价格</th>
</tr>
 <s:iterator value="foodList">
   <tr>
   <td> <s:property value="fid"/>  </td>
   <td> <s:property value="fname"/>  </td>
    <td><s:property value="fkind"/></td>
    <td><s:property value="fstock"/></td>
      <td><s:property value="fprice"/></td>
   </tr>
   </s:iterator>
</table>
页数:<s:property value="pageno"/>/<s:property value="pageCount"/>   <a href='toshow.action?pageno=<s:property value="pageno-1"/>'>上页</a>  
<a href='toshow.action?pageno=<s:property value="pageno+1"/>'>下页</a>




<s:form action="add" method="post" enctype="multipart/form-data" namespace="/food">


<s:textfield name="fv.fname" label="名称" ></s:textfield>

<div class="wu"><s:textfield name="fv.fkind" label="种类" ></s:textfield></div>
<s:textfield name="fv.fstock" label="有无存货" ></s:textfield>
<div class="wu"><s:textfield name="fv.fprice" label="价钱" ></s:textfield></div>


<s:file name="photo" label="照片"></s:file>


<div class="wu"><s:submit value="提交"></s:submit></div>
</s:form>
</div>
</body>
</html>
