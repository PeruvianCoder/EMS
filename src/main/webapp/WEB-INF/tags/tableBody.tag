<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="ths" required="true" %>

<br>
<div class="col-sm-2"></div>

<div class="col-sm-8">

	<div class="table-responsive">
		<table class="table" style="color: white;">
			<tr style="">
			<c:forTokens items="${ths}" delims="," var="th">
					<th style="text-align: center;"><c:out value="${th}"></c:out></th>
			</c:forTokens>
			</tr>
			<!-- only regular <tr> and <td> elements here, 
			same number of columns as the number of headers provided -->
			<jsp:doBody/>
		</table>
	</div>
</div>