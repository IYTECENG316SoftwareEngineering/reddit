<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- include tag libs files -->
<%@ include file="../layout/taglib.jsp"%>


<div class="col-md-9">

    <div class="errorMessageText">
        <p>
            <c:out value="${errorMessage}" />
        </p>
        <p>The page you requested is not available.</p>
 
        <p>
            Try returning to the <a href="<c:url value="/"/>">home page</a>.
        </p>
    </div>    
</div>