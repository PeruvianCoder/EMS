<%@ tag language="java" pageEncoding="UTF-8" body-content="empty"%>
<%@ attribute name="label" required="true" rtexprvalue="true"%>
<%@ attribute name="placeholder" required="true" rtexprvalue="true"%>

<div class="form-group">
	<label for="form-first-name">${label}</label> <input
		type="text" name="form-first-name" placeholder="${placeholder}"
		class="form-first-name form-control" id="form-first-name">
</div>