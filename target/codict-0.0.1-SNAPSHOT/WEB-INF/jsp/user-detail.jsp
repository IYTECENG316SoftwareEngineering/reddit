<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- include tag libs files -->
<%@ include file="../layout/taglib.jsp"%>


<div class="col-md-9">

	<h1>${user.name}</h1>


	<c:forEach items="${user.entries}" var="entry">
		<div class="thumbnail">
			<div class="caption-full">
				<h4>
					<a href="<spring:url value="/topic/${entry.topic.id}.html" />">
						<c:out value="${entry.topic.title}" />
					</a>
				</h4>

				<p>${entry.description}</p>

				<div class="ratings">
					<span class="pull-right">${entry.dateString} <b><a
							href="<spring:url value="/users/entry/remove/${entry.id}.html" />"
							class="btn btn-danger triggerRemove"> remove </a> </b></span>

				</div>
				<br>
			</div>

		</div>
	</c:forEach>
</div>
<!-- Modal -->
<div class="modal fade" id="modalRemove" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="myModalLabel">Remove blog</h4>
			</div>
			<div class="modal-body">Really remove?</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
				<a href="" class="btn btn-danger removeBtn">Remove</a>
			</div>
		</div>
	</div>
</div>
<script>
	$('#myModal').on('shown.bs.modal', function() {
		$('#myInput').focus()
	})
</script>