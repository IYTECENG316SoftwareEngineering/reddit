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
	<div class="alert alert-success" id="success-alert">
		<button type="button" class="close" data-dismiss="alert">x</button>
		<strong>Success! </strong> Your vote is saved.
	</div>

	<div class="alert alert-danger" id="fail-alert">
		<button type="button" class="close" data-dismiss="alert">x</button>
		<strong>Fail! </strong>You already voted.
	</div>

	<div class="alert alert-success" id="success-fav-alert">
		<button type="button" class="close" data-dismiss="alert">x</button>
		<strong>Success! </strong> Entry is added to your favorites
	</div>

	<div class="alert alert-danger" id="fail-fav-alert">
		<button type="button" class="close" data-dismiss="alert">x</button>
		<strong>Fail! </strong>It is already on your favorites
	</div>



	<div>

		<%-- 		<form action="<c:url value='/topic/${topic.id}.html'/>"> --%>

		<!-- 			<span class="pull-right"> <select -->
		<!-- 				onchange="this.form.submit()" name="sort"> -->
		<%-- 					<option value="upVoteCount"><c:out value="Nice" /></option> --%>
		<%-- 					<option value="upVoteCount"><c:out value="Date" /></option> --%>


		<!-- 			</select> -->
		<!-- 			</span> -->
		<!-- 		</form> -->

		<a
			href="<spring:url value="/topic/${topic.id}.html?p=1&sort=upVoteCount" />">
			Best entries </a>

		<form action="<c:url value='/topic/${topic.id}.html'/>">

			<span class="pull-right"> <select
				onchange="this.form.submit()" name="p">
					<c:forEach var="i" begin="1" end="${totalPageCount}">
						<c:choose>
							<c:when test="${i == page}">
								<option selected="selected" value="${i}"><c:out
										value="${i}" /></option>
							</c:when>
							<c:otherwise>
								<option value="${i}"><c:out value="${i}" /></option>
							</c:otherwise>
						</c:choose>
					</c:forEach>

			</select>
			</span>
			<c:if test="${not empty param.sort}">
				<input name="sort" hidden="true" value="${param.sort}" />
			</c:if>
		</form>
		<div class="text-left">
			<h3>
				<a href="<spring:url value="/topic/${topic.id}.html" />">
					${topic.title} </a>
			</h3>
			<security:authorize access="hasRole('ROLE_ADMIN')">

				<button class="open-editTopicTitle btn btn-primary btn-sm"
					data-id="${topic.id}" data-entry="${topic.title}"
					data-toggle="modal" data-target="#topicTitleModall">Edit
					Title</button>
			</security:authorize>
		</div>
	</div>
	<c:forEach items="${topic.entries}" var="entry">
		<div class="thumbnail">
			<div class="caption-full">
				<p>${entry.description}</p>

				<div class="ratings">
					<span class="pull-right"><b> <a
							href="<spring:url value="/profile/${entry.user.id}.html" />">
								<c:out value="${entry.user.name}" />
						</a></b> <a href="<spring:url value='/entry/${entry.id}.html' />">${entry.dateString}</a>
						<security:authorize access="isAuthenticated()">
							<c:if test="${entry.user.name == user.username}">
								<button class="open-editEntry btn btn-primary btn-sm"
									data-id="${entry.id}" data-entry="${entry.description}"
									data-toggle="modal" data-target="#myModal">Edit</button>
							</c:if></span> <span class="pull-left"> <span data-id="${entry.id}"
						class="open-upButton glyphicon glyphicon-chevron-up" id="up"
						aria-hidden="true"></span> <a><span
							class="open-downButton glyphicon glyphicon-chevron-down"
							aria-hidden="true" id="down" data-id="${entry.id}"></span></a> <span
						class="favoriteButton glyphicon glyphicon-star" id="star"
						aria-hidden="true" data-id="${entry.id}"></span>

					</span>
					</security:authorize>

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


<form action="<c:url value ='/topic/${topic.id}/edit.html'/>">
	<div class="modal fade" id="topicTitleModall" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Edit Topic Title</h4>
				</div>
				<div class="modal-body">
					<input name="newTitle" class="form-control" value="${topic.title}"
						data-title="${topic.title}" data-id="${topic.id}"></input>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="submit" class="btn btn-primary">Save changes</button>

				</div>
			</div>
		</div>
	</div>
</form>


​
<script>
	var entry_id;
	var formData;
	$(document).on(
			"click",
			".favoriteButton",
			function() {
				entry_id = $(this).data('id');
				formData = {
					id_str : entry_id
				};

				favorite();

				function favorite() {
					$.ajax({
						url : "/favorite.html",
						type : "POST",
						data : formData,
						success : function(data) {
							$("#success-fav-alert").alert();
							$("#success-fav-alert").fadeTo(2000, 500).slideUp(
									500, function() {
										$("#success-fav-alert").hide();
									});
						},
						error : function() {
							$("#fail-fav-alert").alert();
							$("#fail-fav-alert").fadeTo(2000, 500).slideUp(500,
									function() {
										$("#fail-fav-alert").hide();
									});
						}

					});
				}

			});
</script>

<script>
	$(document).on("click", ".open-editEntry", function() {
		var my_entry = $(this).data('entry');
		var entry_id = $(this).data('id');
		$(".modal-body #desc").val(my_entry);
		$(".modal-body #id").val(entry_id);

	});
</script>

<script>
	var entry_id;
	$(document).on("click", ".open-upButton", function() {
		entry_id = $(this).data('id');
		vote("up");
	});

	$(document).on("click", ".open-downButton", function() {
		entry_id = $(this).data('id');
		vote("down");
	});

	function vote(name) {
		var formData = {
			id_str : entry_id
		};
		$.ajax({
			url : "/vote/" + name + ".html",
			type : "POST",
			data : formData,
			success : function(data) {
				$("#success-alert").alert();
				$("#success-alert").fadeTo(2000, 500).slideUp(500, function() {
					$("#success-alert").hide();
				});
			},
			error : function() {
				$("#fail-alert").alert();
				$("#fail-alert").fadeTo(2000, 500).slideUp(500, function() {
					$("#fail-alert").hide();
				});
			}

		});

	}
</script>

<script>
	$(document).ready(function() {
		$("#success-alert").hide();
		$("#fail-alert").hide();
		$("#success-fav-alert").hide();
		$("#fail-fav-alert").hide();

	});
	$(".dropdown-menu li a").click(
			function() {
				var selText = $(this).text();
				$(this).parents('.btn-group').find('.dropdown-toggle').html(
						selText + ' <span class="caret"></span>');
			});
</script>


<style>
.glyphicon:hover {
	color: yellow;
}

.glyphicon:active {
	color: yellow;
}

.enteredClass {
	color: yellow;
}
</style>