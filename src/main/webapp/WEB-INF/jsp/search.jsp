<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- include tag libs files -->
<%@ include file="../layout/taglib.jsp"%>

<div class="col-md-9 ">

	<h2>
		Result for
		<%=request.getParameter("criteria")%></h2>

	<c:forEach items="${searchResults}" var="topic">
		<div class="caption-full">

			<a class="list-group-item"
				href="<spring:url value='/topic/${topic.id}.html' />">
				${topic.title} </a>
		</div>
		<br />
	</c:forEach>


</div>