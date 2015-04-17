<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="col-md-3">
	<p class="lead">Populars</p>
	<ul id="leftFrame" class="list-group">

	</ul>
</div>

<script type="text/javascript">
$( document ).ready(function() {
	searchAjax();
});
</script>

<script type="text/javascript">
	function searchAjax() {
		$.ajax({ 
			url : "/topic/populars.html",
			type : "GET",
			dataType : "json",
			success : function(responce) {
				/* what  i have to put here to updte my table <table id="table_grid"> */
				$.each(responce, function(key, topic) {
					var htmlrow = "<a class='list-group-item' href='/topic/"+topic.id+".html'> <span class='badge'>12</span>"+topic.title+"</a>";
					$("#leftFrame").append(htmlrow);
				})
			},
			error : function() {
				alert("error");
			}

		});
	}
</script>
