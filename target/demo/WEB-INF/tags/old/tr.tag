<%@ tag language="java" pageEncoding="UTF-8" body-content="empty"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="link" required="true" rtexprvalue="true"%>
<%@ attribute name="link_name" required="true" rtexprvalue="true"%>
<%@ attribute name="tds" required="true" rtexprvalue="true" type="java.util.List"%>

<tr>
	<td><a href="${link}">${link_name}</a></td>
	<c:forEach items="${tds}" var="value">
		  <td><c:out value="${value}"/></td>
	</c:forEach>
</tr>