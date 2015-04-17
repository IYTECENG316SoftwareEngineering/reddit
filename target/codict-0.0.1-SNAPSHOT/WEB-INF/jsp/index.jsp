<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- include tag libs files -->
<%@ include file="../layout/taglib.jsp"%>



<div class="col-md-9">


	<div class="text-left">
		<h3>Latest Entries</h3>
	</div>


	<c:forEach items="${entries}" var="entry">
		<div class="thumbnail">
			<div class="caption-full">
				<p>${entry.description}</p>

				<div class="ratings">
					<a href="<spring:url value='/topic/${entry.topic.id}.html' />">${entry.topic.title}</a>
					<span class="pull-right"><b>${entry.user.name} </b> <a
						href="<spring:url value='/entry/${entry.id}.html' />">${entry.dateString}</a>
					</span>
				</div>
				<br>
			</div>

		</div>
	</c:forEach>


</div>











<!-- <table class="table table-bordered table-hover table-striped"> -->
<!-- 	<thead> -->
<!-- 		<tr> -->
<!-- 			<th>Entry</th> -->
<!-- 			<th>Topic</th> -->
<!-- 			<th>Category</th> -->

<!-- 		</tr> -->
<!-- 	</thead> -->
<!-- 	<tbody> -->
<%-- 		<c:forEach items="${entries}" var="entry"> --%>
<!-- 			<tr> -->
<%-- 				<td>${entry.description}</td> --%>
<%-- 				<td>${entry.topic.title}</td> --%>
<%-- 				<td>${entry.topic.category.name}</td> --%>
<!-- 			</tr> -->
<%-- 		</c:forEach> --%>
<!-- 	</tbody> -->
<!-- </table> -->
