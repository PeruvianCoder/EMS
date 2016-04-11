<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="title" required="true" rtexprvalue="true"%>
<%@ attribute name="subtitle" required="true" rtexprvalue="true"%>

<div class="col-sm-8">
	<div class="form-box">
		<div class="form-top">
			<div class="form-top-left">
				<h3>${title}</h3>
				<p>${subtitle}</p>
			</div>
			<div class="form-top-right">
				<i class="fa fa-pencil"></i>
			</div>
		</div>
		<div class="form-bottom">
			<form role="form" action="" method="post" class="registration-form">
				<jsp:doBody/>
			</form>
		</div>
	</div>
</div>