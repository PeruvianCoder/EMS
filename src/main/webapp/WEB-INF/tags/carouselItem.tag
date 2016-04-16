<%@ tag language="java" pageEncoding="UTF-8" body-content="empty"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="src" required="true"%>
<%@ attribute name="alt" required="true"%>
<%@ attribute name="active" required="true"%>

<c:choose>
	<c:when test="${active== true}">
		<div class="item active">
	</c:when>
	<c:otherwise>
		<div class="item">
	</c:otherwise>
</c:choose>
<img class="img-responsive center-block" src="<c:out value="${src}"/>"
	alt="<c:out value="${alt}"/>">
</div>