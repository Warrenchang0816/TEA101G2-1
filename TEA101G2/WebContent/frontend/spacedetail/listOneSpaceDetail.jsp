<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.spaceDetail.model.*"%>

<%
  SpaceDetailVO spaceDetailVO = (SpaceDetailVO) request.getAttribute("spaceDetailVO"); //SpaceDetailServlet.java(Concroller), 存入req的spaceDetailVO物件
%>

<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
<title>場地明細</title>

<!-- GOOGLE WEB FONT -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700;800&display=swap" rel="stylesheet">

<!-- BASE CSS -->
    <link href="<%=request.getContextPath()%>/plugins/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/plugins/css/style.css" rel="stylesheet">
	<link href="<%=request.getContextPath()%>/plugins/css/vendors.css" rel="stylesheet">

<!-- Your custom styles -->
    <link href="<%=request.getContextPath()%>/plugins/css/custom.css" rel="stylesheet" type="text/css">

<!-- Table -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  	
</head>
<body>

<div id="page">
		
	<header class="header menu_fixed">
		<div id="preloader"><div data-loader="circle-side"></div></div><!-- /Page Preload -->
		<div id="logo">
			<a href="<%=request.getContextPath()%>/frontend/space/spaceHome.jsp">
				<img src="<%=request.getContextPath()%>/plugins/img/logo.svg" width="150" height="36" alt="" class="logo_normal">
				<img src="<%=request.getContextPath()%>/plugins/img/logo_sticky.svg" width="150" height="36" alt="" class="logo_sticky">
			</a>
		</div>		
		<ul id="top_menu">
			<li><a href="cart-1.html" class="cart-menu-btn" title="Cart"><strong>4</strong></a></li>
			<li><a href="#sign-in-dialog" id="sign-in" class="login" title="Sign In">Sign In</a></li>
			<li><a href="wishlist.html" class="wishlist_bt_top" title="Your wishlist">Your wishlist</a></li>
		</ul>
		<!-- /top_menu -->
		<a href="#menu" class="btn_mobile">
			<div class="hamburger hamburger--spin" id="hamburger">
				<div class="hamburger-box">
					<div class="hamburger-inner"></div>
				</div>
			</div>
		</a>
		<nav id="menu" class="main-menu">
			<ul>
				<li><span><a href="<%=request.getContextPath()%>/frontend/space/spaceHome.jsp">場地</a></span>
					<ul>
						<li>
							<span><a href="<%=request.getContextPath()%>/frontend/space/spaceHome.jsp">我的場地</a></span>
							<ul>
								<li><a href="<%=request.getContextPath()%>/frontend/space/addSpace.jsp">新增場地</a></li>
								<li><a href="<%=request.getContextPath()%>/frontend/space/listAllSpace.jsp">所有場地</a></li>
							</ul>
						</li>
						<li>
							<span><a href="<%=request.getContextPath()%>/frontend/spacedetail/spaceDetailHome.jsp">我的場地明細</a></span>
							<ul>
								<li><a href="<%=request.getContextPath()%>/frontend/spacedetail/addSpaceDetail.jsp">新增場地明細</a></li>
								<li><a href="<%=request.getContextPath()%>/frontend/spacedetail/listAllSpaceDetail.jsp">所有場地明細</a></li>
							</ul>
						</li>
						<li>
							<span><a href="<%=request.getContextPath()%>/frontend/spacephoto/spacePhotoHome.jsp">場地照片</a></span>
							<ul>
								<li><a href="<%=request.getContextPath()%>/frontend/spacephoto/addSpacePhoto.jsp">新增場地照片</a></li>
								<li><a href="<%=request.getContextPath()%>/frontend/spacephoto/listAllSpacePhoto.jsp">所有場地照片</a></li>
							</ul>
						</li>
						<li>
							<span><a href="<%=request.getContextPath()%>/frontend/spacecomment/spaceCommentHome.jsp">場地評價</a></span>
							<ul>
								<li><a href="<%=request.getContextPath()%>/frontend/spacecomment/addSpaceComment.jsp">新增場地評價</a></li>
								<li><a href="<%=request.getContextPath()%>/frontend/spacecomment/listAllSpaceComment.jsp">所有場地評價</a></li>
							</ul>
						</li>
					</ul>
				</li>
				<li><span><a></a></span>
				</li>
				<li><span><a></a></span>
				</li>
				<li><span><a></a></span>
				</li>
				<li><span><a></a></span>
				</li>
				<li><span><a></a></span>
				</li>
				<li><span><a></a></span>
				</li>
				<li><span><a></a></span>
				</li>
				<li><span><a></a></span>
				</li>
				<li><span><a></a></span>
				</li>
				<li><span><a></a></span>
				</li>
			</ul>
		</nav>
	</header>
  <!-- /header -->

  <main>
		
		<section class="hero_in hotels">
			<div class="wrapper">
				<div class="container">
					<h1 class="fadeInUp"><span></span>場地明細</h1>
				</div>
			</div>
		</section>
		<!--/hero_in-->

<table class="table">
	<thead>
	<tr>
		<th>場地明細ID</th>
		<th>場地ID</th>
		<th>場地開放日期</th>
		<th>場地開放起始時間</th>
		<th>場地開放結束時間</th>
		<th>場地租借費用</th>
	</tr>
	</thead>
	<tbody>
	<tr>
		<td><%=spaceDetailVO.getSpaceDetailId()%></td>
		<td><%=spaceDetailVO.getSpaceId()%></td>
		<td><%=spaceDetailVO.getSpaceDetailFreeDate()%></td>
		<td><%=spaceDetailVO.getSpaceDetailFreeTimeStart()%></td>
		<td><%=spaceDetailVO.getSpaceDetailFreeTimeEnd()%></td>
		<td><%=spaceDetailVO.getSpaceDetailCharge()%></td>
	</tr>
	</tbody>
</table>
</main>
<!--/main-->
</div>
<!-- page -->

<!-- COMMON SCRIPTS -->
  	<script src="<%=request.getContextPath()%>/plugins/js/common_scripts.js"></script>
  	<script src="<%=request.getContextPath()%>/plugins/js/main.js"></script>
	
<!-- Map -->
	<script src="http://maps.googleapis.com/maps/api/js"></script>
	<script src="<%=request.getContextPath()%>/plugins/js/markerclusterer.js"></script>
	<script src="<%=request.getContextPath()%>/plugins/js/map_hotels.js"></script>
	<script src="<%=request.getContextPath()%>/plugins/js/infobox.js"></script>
	
</body>
</html>