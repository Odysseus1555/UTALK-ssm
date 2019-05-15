<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<title>login</title>
	<link rel="stylesheet" type="text/css" href="css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="css/demo.css" />
	<!--必要样式-->
	<link rel="stylesheet" type="text/css" href="css/component.css" />
	<!--[if IE]>
	<script src="js/html5.js"></script>
	<![endif]-->
</head>
  
  <body>
    <div class="container demo-1">
			<div class="content">
				<div id="large-header" class="large-header">
					<canvas id="demo-canvas"></canvas>
					<div class="logo_box">
						<h3>欢迎你</h3>
						<form action="${pageContext.request.contextPath }/login.action" method="post" style="margin-bottom:0;">
							<div class="input_outer">
								<span class="u_user"></span>
								<input name="username" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户">
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input name="password" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
							</div>
							<div style="text-align:center;">${error}</div>
							<div style="float:left;">
							<input class="act-but submit" width="50px" style="padding: 0.5em 2em;color: #FFFFFF" value="登录" type="submit">						
							</div>

						</form>
													<div style="float:right;">
							<form action="${pageContext.request.contextPath }/toregister.action" method="post">
						        	<input class="act-but submit" style="padding: 0.5em 2em;color: #FFFFFF" type="submit" value="注册">
							</form>
							</div>
						   
						
					</div>
				</div>
			</div>
		</div><!-- /container -->
		<script src="js/TweenLite.min.js"></script>
		<script src="js/EasePack.min.js"></script>
		<script src="js/rAF.js"></script>
		<script src="js/demo-1.js"></script>
		<div style="text-align:center;">
</div>
  </body>
</html>
