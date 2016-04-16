<%@ tag language="java" pageEncoding="UTF-8" body-content="empty"%>
<%@ attribute name="label" required="true" rtexprvalue="true"%>
<%@ attribute name="placeholder" required="true" rtexprvalue="true"%>

<div class="form-group">
	<i class="icon-append fa fa-calendar"></i> 
	<label for="form-sdate">${label}</label>
	<input type="text" name="form-sdate" placeholder="${placeholder}" 
		class="form-sdate form-control" id="form-sdate">
</div>