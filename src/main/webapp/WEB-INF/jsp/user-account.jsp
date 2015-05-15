<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- include tag libs files -->
<%@ include file="../layout/taglib.jsp"%>

<style>
<!--
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
-->
</style>


<sec:authentication var="currentUser" property="principal" />


<c:if test="${success eq true}">
	<div class="alert alert-success">Added successfully!!</div>
</c:if>


<form:form commandName="topic" cssClass="form-horizontal topicForm">
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>
					<h6 class="modal-title" id="myModalLabel">New Topic</h6>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="topicTitle" class="col-sm-2 control-label"><h5>Title:</h5></label>
						<div class="col-sm-9">
							<form:input path="title" class="form-control" />
							<form:errors path="title" />
						</div>
					</div>
					<div class="form-group">

						<label for="category" class="col-sm-2 control-label"><h5>Category:</h5></label>
						<div class="col-sm-9">
							<select name="topic_category" class="form-control">
								<c:forEach items="${categoryList}" var="category_str">
									<option value="${category_str}">${category_str}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<form:form commandName="entry" cssClass="form-horizontal entryForm">
						<div class="form-group">
							<label for="description" class="col-sm-2 control-label"><h5>Entry:</h5></label>
							<div class="col-sm-9">
								<form:textarea path="description" class="form-control" />
							</div>
						</div>
					</form:form>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">
						Close</button>
					<input type="submit" name="button1" class="btn btn-primary"
						value="Save" />
				</div>
			</div>

		</div>
	</div>
</form:form>



<div class="col-md-9">
	<h1>${user.name}</h1>

	<center>
		<button class="btn btn-primary btn-lg" data-toggle="modal"
			data-target="#myModal">New Topic</button>
			<a href="<spring:url value='/account/inbox.html' />" class="btn btn-primary btn-lg">Inbox</a>
			<a href="<spring:url value='/profile/edit.html' />" class="btn btn-primary btn-lg">Edit Infos</a>

	</center>
	<br>


	<div id="div1">
		<h3>Popular Entries</h3>

		<c:forEach items="${mostVoted}" var="entry">
			<a class="list-group-item" href="/entry/${entry.id}.html">
				${entry.topic.title}</a>
		</c:forEach>
	</div>

	<div id="div2">
		<h3>Favorites</h3>
		<c:forEach items="${favorites}" var="entry">
			<a class="list-group-item" href="/entry/${entry.id}.html">
				${entry.topic.title}</a>
		</c:forEach>

	</div>
	<div id="div3">
		<h3>Latest Entries</h3>
		<c:forEach items="${lastEntries}" var="entry">
			<a class="list-group-item" href="/entry/${entry.id}.html">
				${entry.topic.title}</a>
		</c:forEach>

	</div>
</div>


