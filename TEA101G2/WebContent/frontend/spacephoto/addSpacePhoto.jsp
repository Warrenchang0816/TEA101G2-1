<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.spacePhoto.model.*"%>

<%
  SpacePhotoVO spacePhotoVO = (SpacePhotoVO) request.getAttribute("spacePhotoVO");
%>

<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
<title>新增場地照片</title>

<!-- GOOGLE WEB FONT -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700;800&display=swap" rel="stylesheet">

<!-- BASE CSS -->
    <link href="<%=request.getContextPath()%>/plugins/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/plugins/css/style.css" rel="stylesheet">
	<link href="<%=request.getContextPath()%>/plugins/css/vendors.css" rel="stylesheet">

<!-- Your custom styles -->
    <link href="<%=request.getContextPath()%>/plugins/css/custom.css" rel="stylesheet" type="text/css">

</head>

<body>

<div id="page">
<%@ include file="/frontend/header.jsp" %>

  <main>
		
		<section class="hero_in hotels">
			<div class="wrapper">
				<div class="container">
					<h1 class="fadeInUp"><span></span>新增場地照片</h1>
				</div>
			</div>
		</section>
		<!--/hero_in-->
		
<FORM METHOD="post" ACTION="<%=request.getContextPath()%>/spacephoto/spacephoto.do" name="form1">
  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="<%=request.getContextPath()%>/frontend/spacephoto/spacephotoHome.jsp">spacephotoHome</a>
        </li>
        <li class="breadcrumb-item active">新增場地照片</li>
      </ol>
		<div class="box_general padding_bottom">
			<div class="header_box version_2">
				<h2><i class="fa fa-file"></i>新增場地照片</h2>
			</div>
			<div class="row">
				<div class="col-md-6">
					<div class="form-group">
						<label>場地ID</label>
						<input type="text" name="spaceId" class="form-control" value="SPACE00002">
					</div>
				</div>
			</div>			
			<!-- /row-->
			<div class="row">										
				<div class="col-md-12">
					<div class="form-group">
						<label>場地照片</label>
						<input type="file" name="spacePhoto" placeholder="選擇照片">
					</div>
				</div>
			</div>
			<!-- /row-->
		</div>    
		<!-- /box_general-->
		<p>
			<input type="hidden" name="action" value="insert">
            <input type="submit" value="送出新增" class="btn_1 medium">
		</p>
		</div>
		<!-- /container-fluid-->
	</div>
	<!-- /content-wrapper-->
</FORM>		
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