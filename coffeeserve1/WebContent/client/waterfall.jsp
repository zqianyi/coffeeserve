<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
*{margin:0;padding:0;list-style-type:none;}
a,img{border:0;}
body{font:12px/180% Arial, Helvetica, sans-serif, "新宋体";}
/* container */
#container{width:940px;margin:50px auto;}
#container ul{width:300px;list-style:none;float:left;margin-right:20px;}
#container ul li{
    margin-bottom:20px;
    
    -moz-border-bottom-colors:none;
    -moz-border-left-colors:none;
    -moz-border-right-colors:none;
    -moz-border-top-colors:none;
    background-color:#fff;
    background-image:linear-gradient(to bottom, #FFFFFF, #E6E6E6);
    background-repeat:repeat-x;
    border-color:#e6e6e6 #e6e6e6 #B3B3B3;
    border-image:none;
    border-radius:4px 4px 4px 4px;
    border-style:solid;
    border-width:1px;
    box-shadow:0 1px 0 rgba(255, 255, 255, 0.2) inset, 0 1px 2px rgba(0, 0, 0, 0.05);  
}
#container ul li img{width:298px;}
.water_user{color:#666;padding:10px;}
.water_option{background:#f5f5f5;border-top:1px #f0f0f0 solid;padding:5px 0 5px 10px;}
.water_option:after{content:"";display:block;clear:both;visibility:hidden;}
.water_option .option_item,.water_option .split{float:right;}
.water_option .option_item{color:#3e88cd;text-decoration:none;margin-right:10px;}
.water_option .option_item:hover{ text-decoration:underline;}
.water_option .split{display:inline-block;margin:5px 10px 0 0;height:12px;width:1px;background-color:#D8D8D8;}

.loadMeinvMOre{height:30px;line-height:30px;color:#999;text-align:center;background:#f9f9f9;display:block;clear:both;text-decoration:none;}
.loadMeinvMOre:hover{ background:#f0f0f0;color:#666;}
</style>

</head>
<body>

<div id="container">

	<ul class="col">
		<li>
			<div class="water_pic"><a href=""><img src='photoshow.action?fid=1'/></a></div>
			<div class="water_user"></div>
			<div class="water_option">
				<a href="" class="option_item"></a>
				<span class="split"></span>
				<a href="" class="option_item option_comt"></a>
				<span class="split"></span>
				<a href="" class="option_item option_relay"></a>
			</div>
		</li>
		<li>
			<div class="water_pic"><a href=""><img src='photoshow.action?fid=2'/></a></div>
			<div class="water_user"></div>
			<div class="water_option">
				<a href="" class="option_item"></a>
				<span class="split"></span>
				<a href="" class="option_item option_comt"></a>
				<span class="split"></span>
				<a href="" class="option_item option_relay"></a>
			</div>
		</li>
		<li>
			<div class="water_pic"><a href=""><img src='photoshow.action?fid=3'/></a></div>
			<div class="water_user"></div>
			<div class="water_option">
				<a href="" class="option_item"></a>
				<span class="split"></span>
				<a href="" class="option_item option_comt"></a>
				<span class="split"></span>
				<a href="" class="option_item option_relay"></a>
			</div>
		</li>
	</ul>
	
	<ul class="col"></ul>
	
	<ul class="col" style="margin-right:0"></ul>
	
	<a href="javascript:" class="loadMeinvMOre" id="loadMeinvMOre">加载更多</a>
	
</div><!--container end-->

<script type="text/javascript" src="../js/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
$(function() {
	//url data function dataType
	function loadMeinv() {
		var data = 0;
		for (var i = 0; i < 10; i++) {//每次加载时模拟随机加载图片
			data = parseInt(Math.random() * 10);
			var html = "";
			html = '<li><div class="water_pic"><a href="#"><img src = img/'
				+ data + '.jpg></a></div><div class="water_user">_'
				+ data + '</div><div class="water_option"><a href="" class="option_item">收藏 4</a> <span class="split"></span><a href="" class="option_item option_comt">评论 8</a><span class="split"></span><a href="" class="option_item option_relay"></a></div></li>';
			$minUl = getMinUl();
			$minUl.append(html);
		}
	}
	loadMeinv();
	//无限加载
	$(window).on("scroll", function() {
		$minUl = getMinUl();
		if ($minUl.height() <= $(window).scrollTop() + $(window).height()) {
			//当最短的ul的高度比窗口滚出去的高度+浏览器高度大时加载新图片
			//loadMeinv();//加载新图片
		}
	})
	function getMinUl() {//每次获取最短的ul,将图片放到其后
		var $arrUl = $("#container .col");
		var $minUl = $arrUl.eq(0);
		$arrUl.each(function(index, elem) {
			if ($(elem).height() < $minUl.height()) {
				$minUl = $(elem);
			}
		});
		return $minUl;
	}
	//点击更多加载
	$("#loadMeinvMOre").click(function() {
		$minUl = getMinUl();
		loadMeinv();
	});
	
})
</script>

</body>
</html>