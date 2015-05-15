<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp"%>


<div class="col-md-9">

	<c:forEach items="${conversations}" var="conversation">
		<a class="list-group-item"
			href="<spring:url value='/message/${conversation.id}.html' />">
			Subject: ${conversation.subject}
					<span class="pull-right"> ${conversation.senderUser.name} </span>
			
			</a>

	</c:forEach>
</div>