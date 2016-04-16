<%@ tag language="java" pageEncoding="UTF-8" body-content="empty"%>
<%@ attribute name="label" required="true" rtexprvalue="true"%>
<%@ attribute name="placeholder" required="true" rtexprvalue="true"%>

<div class="form-group">
	<label for="InputMessage">${label}</label>
	<div class="input-group">
		<textarea name="InputMessage" id="InputMessage" class="form-control"
			rows="5" required placeholder="${placeholder}"></textarea>
		<span class="input-group-addon"><span
			class="glyphicon glyphicon-asterisk"></span></span>
	</div>
</div>