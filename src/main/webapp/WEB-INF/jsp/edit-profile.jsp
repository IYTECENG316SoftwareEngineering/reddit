
<%@ include file="../layout/taglib.jsp"%>

<div class="col-md-9">

	<form:form commandName="user" cssClass="form-horizontal entryForm">
		<div class="form-group">
			<label for="description" class="col-sm-2 control-label"><h5>E-Mail:</h5></label>
			<div class="col-sm-9">
				<form:textarea path="email" class="form-control" />
			</div>
		</div>
	</form:form>

</div>