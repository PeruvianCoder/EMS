<%@ tag language="java" pageEncoding="UTF-8" body-content="empty"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="label" required="true" %>
<%@ attribute name="name" required="true" %>
<%@ attribute name="value" required="true" %>

<div class="form-group">
	<label class="aria-label" for="form-first-name"><c:out value="${label}"/></label> <input
		type="text" name="<c:out value="${name}"/>" class="form-control"
		id="form-first-name" value="<c:out value="${value}"/>">
</div>