<%@ tag language="java" pageEncoding="UTF-8" body-content="empty"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="label" required="true"%>
<%@ attribute name="name" required="true"%>

<label class="control-label"><c:out value="${label}"/></label>
<input name="<c:out value="${name}"/>" id="input-1" type="file" class="file">