<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="ths" required="true" rtexprvalue="true"%>

<div class="col-sm-8">
	<div class="table-responsive">
		<table class="table" style="color: white;">
			<tr style="">
				<c:forTokens items="${ths}" delims="," var="th">
					<th style="text-align: center;"><c:out value="${th}"/></th>
				</c:forTokens>
			</tr>
			<jsp:doBody />
		</table>
	</div>
</div>