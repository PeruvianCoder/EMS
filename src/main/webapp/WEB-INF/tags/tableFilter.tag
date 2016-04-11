<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="title" required="true"%>

<div class="dropdown">
	<h1>Filters</h1>
	<div class="btn-group">
		<button class="btn btn-default dropdown-toggle" type="button"
			id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
			aria-expanded="true">
			${title} <span class="caret"></span>
		</button>
		<ul class="dropdown-menu" aria-labelledby="dropdownMenu1" role="menu"
			style="overflow-x: visible; overflow-y: visible;">
			<!-- only tableFilterOption tags should go here -->
			<jsp:doBody />
		</ul>
	</div>
</div>