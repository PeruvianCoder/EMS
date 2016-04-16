<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="title" required="true" rtexprvalue="true"%>

<div class="top-content">
	<div class="inner-bg">
		<div class="container">
			<div class="row">
				<div class="col-sm-10 col-sm-offset-1 text">
					<h1>
						<strong>EMS</strong> ${title}
					</h1>
					<div class="description">
						<!--<p>This is a free responsive <strong>"login and register forms"</strong> template made with Bootstrap. 
	        Download it on <a href="http://azmind.com" target="_blank"><strong>AZMIND</strong></a>, 
	        customize and use it as you like!
            </p>-->
					</div>
				</div>
			</div>
			<div class="col-sm-2"></div>
			<jsp:doBody />
		</div>
	</div>
</div>