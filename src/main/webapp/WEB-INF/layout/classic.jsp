<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--  Add taglib -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>


<script
	src="http://cdn.jsdelivr.net/jquery.validation/1.13.1/jquery.validate.min.js"></script>




<!-- Jquery Integration -->

<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

<!-- End of Jquery Integration -->

<!-- Bootstrap integration -->

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<!--End of Bootstrap integration -->



<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@ include file="../layout/taglib.jsp"%>


<title><tiles:getAsString name="title"></tiles:getAsString></title>
</head>
<body>


	<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
		prefix="tilesx"%>


	<!-- reads the current attribute in general.xml, and put it in the page scope -->
	<tilesx:useAttribute name="current" />

	<div class="container">

		<!-- from navbar example of bootstrap -->

		<!-- Static navbar -->



		<nav class="navbar navbar-default" role="navigation">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">CoDict</a>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="${current == 'index' ?  'active' : '' }"><a
						href='<spring:url value="/"/>'>Home</a></li>

					<li class="dropdown"><a href="#" data-toggle="dropdown"
						class="dropdown-toggle">Categories <b class="caret"></b></a>
						<ul id="categoryList" class="dropdown-menu">

						</ul></li>

					<security:authorize access="hasRole('ROLE_ADMIN')">
						<li class="${current == 'users' ?  'active' : '' }"><a
							href="<spring:url value="/users.html"/>">Users</a></li>
						<li class="${current == 'topics' ?  'active' : '' }"><a
							href="<spring:url value="/topics.html"/>">Topics</a></li>
					</security:authorize>
					<security:authorize access="isAuthenticated()">
						<li class="${current == 'account' ?  'active' : '' }"><a
							href="<spring:url value="/account.html"/>"><sec:authentication
									property="name" /></a></li>
					</security:authorize>
				</ul>

				<ul class="nav navbar-nav navbar-right">
					<security:authorize access="! isAuthenticated()">
						<li class="${current == 'register' ?  'active' : '' }"><a
							href="<spring:url value="/register.html"/>">Register</a></li>
						<li class="${current == 'login' ?  'active' : '' }"><a
							href="<spring:url value="/login.html"/>">Login</a></li>
					</security:authorize>



					<security:authorize access="isAuthenticated()">
						<li><a href="<spring:url value="/logout"/>">Logout</a></li>
					</security:authorize>
				</ul>
				<form class="navbar-form navbar-left" role="search"
					action="<c:url value='/result.html'/>" method="GET">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search"
							name=criteria>
					</div>
					<button type="submit" class="btn btn-default">
						<i class="glyphicon glyphicon-search"></i>
					</button>
				</form>

			</div>
		</nav>

		<tiles:insertAttribute name="left-bar" />

		<tiles:insertAttribute name="body" />
		<br> <br>
		<center>
			<tiles:insertAttribute name="footer" />
		</center>
	</div>
</body>


</html>