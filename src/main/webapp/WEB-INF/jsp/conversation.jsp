<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp"%>

<div class="col-md-9">

	<div class="thumbnail">
		<div class="caption-full">
			<center>
				<h3>Subject: ${conversation.subject}</h3>
			</center>
		</div>
	</div>
	<c:forEach items="${conversation.messages}" var="oneMessage">
		<div class="thumbnail">
			<div class="caption-full">
				<a class="list-group-item"><h4>${oneMessage.user.name}:</h4> 
				${oneMessage.message}
				</a>
			</div>
		</div>
	</c:forEach>

	<form:form commandName="privateMessage" method="POST"
		cssClass="form-horizontal">
		<form:textarea path="message" class="form-control" />
		<form:errors path="message" />
		<br>
		<button type="submit" name="sendMessage" class="btn btn-default">Submit</button>
	</form:form>
</div>