<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="title" required="true"%>
<%@ attribute name="action" required="true"%>

<div class="col-sm-2"></div>

<div class="col-sm-8">

	<div class="form-box">
		<div class="form-top">
			<div class="form-top-left">
				<h3>${title}</h3>
			</div>
			<div class="form-top-right">
				<i class="fa fa-pencil"></i>
			</div>
		</div>
		<div class="form-bottom">
			<form role="form" action="<c:out value="${action}"/>" method="post" class="registration-form">
			<!-- only one of the form* tag elements defined in this directory-->
				<jsp:doBody />
			</form>
		</div>
	</div>

</div>