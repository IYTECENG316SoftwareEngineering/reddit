<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- include tag libs files -->
<%@ include file="../layout/taglib.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>


<div class="col-md-9">


	<div class="text-left">
		<h3>${entry.topic.title}</h3>
	</div>


	<div class="thumbnail">
		<div class="caption-full">
			<p>${entry.description}</p>

			<div class="ratings">
				<span class="pull-right"><b>${entry.user.name} </b>${entry.publishedDate}</span>

			</div>
			<br>
		</div>
	</div>




</div>