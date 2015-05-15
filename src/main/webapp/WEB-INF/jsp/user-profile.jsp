<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- include tag libs files -->
<%@ include file="../layout/taglib.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<style>
#div1 {
	width: 50%;
	height: 50%;
	float: left;
}

#div2 {
	width: 50%;
	height: 50%;
	float: left;
}

#div3 {
	width: 100%;
	height: 50%;
	float: left;
}

#div4 {
	width: 100%;
	height: 50%;
	float: left;
}
</style>


<form:form modelAttribute="privateMessageConversation"
	cssClass="form-horizontal topicForm">
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>
					<h6 class="modal-title" id="myModalLabel">New Conversation with ${user.name}</h6>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="subject" class="col-sm-2 control-label"><h5>Subject:</h5></label>
						<div class="col-sm-9">
							<form:input path="subject" class="form-control" />
<%-- 							<form:errors path="subject" /> --%>
						</div>
					</div>
					<form:form commandName="privateMessage"
						cssClass="form-horizontal entryForm">
						<div class="form-group">
							<label for="message" class="col-sm-2 control-label"><h5>Message:</h5></label>
							<div class="col-sm-9">
								<form:textarea path="message" class="form-control" />
							</div>
						</div>
					</form:form>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">
						Close</button>
					<input type="submit" name="button1" class="btn btn-primary"
						value="Send" />
				</div>
			</div>

		</div>
	</div>
</form:form>





<div class="col-md-9">
	<center>
		<h2>${user.name}'sprofile</h2>
	</center>
	<security:authorize access="isAuthenticated()">

		<center>
			<button class="btn btn-primary btn-lg" data-toggle="modal"
				data-target="#myModal">Send Message</button>

		</center>
	</security:authorize>

	<div id="div1">
		<h3>Popular Entries</h3>
		<c:if test="${empty mostVoted}">
    		There aren't any popular entries of the user.
		</c:if>
		<c:forEach items="${mostVoted}" var="entry">
			<a class="list-group-item" href="/entry/${entry.id}.html">
				${entry.topic.title}</a>
		</c:forEach>
	</div>

	<div id="div2">
		<h3>Favorites</h3>
		<c:if test="${empty favorites}">
    		There aren't any favorite entries of the user.
		</c:if>
		<c:forEach items="${favorites}" var="entry">
			<a class="list-group-item" href="/entry/${entry.id}.html">
				${entry.topic.title}</a>
		</c:forEach>

	</div>
	<div id="div3">
		<h3>Latest Entries</h3>
		<c:if test="${empty lastEntries}">
    		There aren't any entries of the user.
		</c:if>
		<c:forEach items="${lastEntries}" var="entry">
			<a class="list-group-item" href="/entry/${entry.id}.html">
				${entry.topic.title}</a>
		</c:forEach>

	</div>
</div>
