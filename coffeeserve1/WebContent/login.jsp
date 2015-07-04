<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="hcss/lcss.css" />
</head>
<body>
<!--  
<h1>用户登录</h1>
<form action="login" method="post">
账号:<input type="text" name="userid"/><br/>
密码:<input type="password" name="password"/><br/>
<input type="submit" value="提交" />
</form>
-->
<header>
</header>

<div class="tu">
	<img src="images/06.jpg" >
    </div>

    <div class="right">
    
<div class="loginwrap">
			<div class="loginh">
				<div class="fl">会员登录</div>
				<div class="fr">还没有账号<a id="sigup_now" href="http://localhost:8080/coffeeserve1/client/toadd">立即注册</a></div>
			</div>
			<!--
            <h3><span class="fl">邮箱登录</span><span class="login_warning">用户名或密码错误</span><div class="clear"></div></h3>
            -->
			<form action="login" method="post" id="login_form">
				<div class="logininput">
					<input type="text" name="username" class="loginusername" value="" placeholder="邮箱/用户名" />
					<input type="text" class="loginuserpasswordt" value="" placeholder="密码" />
					<input type="password" name="password" class="loginuserpasswordp" style="display:none" />  
				</div>
				<div class="loginbtn">
					<div class="loginsubmit fl"><input type="submit" value="登录" class="btn" /></div>
					<div class="fl" style="margin:26px 0 0 0;"><input id="bcdl" type="checkbox" checked="true" />保持登录</div>
					<div class="fr" style="margin:26px 0 0 0;"><a href="">忘记密码?</a></div>
					<div class="clear"></div>
				</div>
			</form>
</div>
<div class="thirdlogin">
		<div class="pd50">
			<h4>用第三方帐号直接登录</h4>
			<ul>
				<li id="sinal"><a href="http://www.17sucai.com/oauth/weibo/login">微博账号登录</a></li>
				<li id="qql"><a href="http://www.17sucai.com/oauth/qq/login">QQ账号登录</a></li>
			</ul>
			<div class="clear"></div>
		</div>
</div>

</div>
</body>
</html>