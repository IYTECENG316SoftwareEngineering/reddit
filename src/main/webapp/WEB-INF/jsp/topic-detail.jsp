<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- include tag libs files -->
<%@ include file="../layout/taglib.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<sec:authentication var="user" property="principal" />

<div class="col-md-9">


	<div class="text-left">
		<h3>${topic.title}</h3>
	</div>


	<c:forEach items="${topic.entries}" var="entry">
		<div class="thumbnail">
			<div class="caption-full">
				<p>${entry.description}</p>

				<div class="ratings">
					<span class="pull-right"><b>${entry.user.name} </b> <a
						href="<spring:url value='/entry/${entry.id}.html' />">${entry.dateString}</a>
						<security:authorize access="isAuthenticated()">
							<c:if test="${entry.user.name == user.username}">
								<button class="open-editEntry btn btn-primary btn-sm"
									data-id="${entry.id}" data-entry="${entry.description}"
									data-toggle="modal" data-target="#myModal">Edit</button>
							</c:if>
						</security:authorize> </span>
				</div>
				<br>
			</div>

		</div>
	</c:forEach>



	<security:authorize access="isAuthenticated()">
		<form:form commandName="entry" method="POST"
			cssClass="form-horizontal">
			<form:textarea path="description" class="form-control" />
			<form:errors path="description" />
			<br>
			<button type="submit" name="addEntry" class="btn btn-default">Submit</button>
		</form:form>
	</security:authorize>
</div>

<form:form commandName="entry" cssClass="form-horizontal topicForm">
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>
					<h6 class="modal-title" id="myModalLabel">Edit Entry</h6>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="description" class="col-sm-2 control-label"><h5>Entry:</h5></label>
						<div class="col-sm-9">
							<form:input id="desc" path="description" class="form-control"
								value="" />
							<form:hidden path="id" value="" />
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">
						Close</button>
					<input type="submit" name="edit" class="btn btn-primary"
						value="Save" />
				</div>
			</div>

		</div>
	</div>
</form:form>
<script>
	$(document).on("click", ".open-editEntry", function() {
		var my_entry = $(this).data('entry');
		var entry_id = $(this).data('id');
		$(".modal-body #desc").val(my_entry);
		$(".modal-body #id").val(entry_id);

	});
</script>
