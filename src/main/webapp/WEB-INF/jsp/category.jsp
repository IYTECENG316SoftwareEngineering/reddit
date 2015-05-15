<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- include tag libs files -->
<%@ include file="../layout/taglib.jsp"%>



<div class="col-md-9 ">
	<h2>Category: ${requestScope.category}</h2>

	<c:forEach items="${categoryResults}" var="topic">
		<div class="caption-full">

			<a class="list-group-item"
				href="<spring:url value='/topic/${topic.id}.html' />">
				${topic.title} </a>
		</div>
		<br />
	</c:forEach>




	<form action="<c:url value='/category/${category}.html'/>">

		<span class="pull-right"> <select onchange="this.form.submit()"
			name="p">
				<c:forEach var="i" begin="1" end="${totalPageCount}">
					<c:choose>
						<c:when test="${i == param.p}">
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
		<c:if test="${not empty param.p}">
			<input name="p" hidden="true" value="${param.p}" />
		</c:if>
	</form>


	<!-- <select -->
	<!-- 		onchange="this.options[this.selectedIndex].value && (window.location = this.options[this.selectedIndex].value);"> -->

	<%-- 			<c:forEach var="i" begin="1" end="${totalPageCount}"> --%>
	<%-- 				<c:choose> --%>
	<%-- 					<c:when test="${i == requestScope.page}"> --%>
	<!-- 						<option selected="selected" -->
	<%-- 							value="<c:url value="/category/${requestScope.category}/${i}.html"/>"><c:out --%>
	<%-- 								value="${i}" /></option> --%>
	<%-- 					</c:when> --%>
	<%-- 					<c:otherwise> --%>
	<!-- 						<option -->
	<%-- 							value="<c:url value="/category/${requestScope.category}/${i}.html"/>"><c:out --%>
	<%-- 								value="${i}" /></option> --%>
	<%-- 					</c:otherwise> --%>
	<%-- 				</c:choose> --%>
	<%-- 			</c:forEach> --%>
	<!-- 	</select> -->



<!-- 	<select -->
<!-- 		onchange="this.options[this.selectedIndex].value && (window.location = this.options[this.selectedIndex].value);"> -->

<%-- 		<c:forEach var="i" begin="1" end="${totalPageCount}"> --%>
<%-- 			<c:choose> --%>
<%-- 				<c:when test="${i == requestScope.page}"> --%>
<!-- 					<option selected="selected" -->
<%-- 						value="<c:url value="/category/${requestScope.category}/${i}.html"/>"><c:out --%>
<%-- 							value="${i}" /></option> --%>
<%-- 				</c:when> --%>
<%-- 				<c:otherwise> --%>
<!-- 					<option -->
<%-- 						value="<c:url value="/category/${requestScope.category}/${i}.html"/>"><c:out --%>
<%-- 							value="${i}" /></option> --%>
<%-- 				</c:otherwise> --%>
<%-- 			</c:choose> --%>
<%-- 		</c:forEach> --%>
<!-- 	</select> -->



</div>