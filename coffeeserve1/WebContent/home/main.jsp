<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    
<div class="sysmenub">

<h1>增加食品</h1>
<s:form action="add" method="post" enctype="multipart/form-data" namespace="/home">
<s:textfield name="fv.id" label="编号" ></s:textfield>

<s:textfield name="fv.name" label="名称" ></s:textfield>

<s:file name="photo" label="照片"></s:file>


<s:submit value="提交"></s:submit>
</s:form>

</div>