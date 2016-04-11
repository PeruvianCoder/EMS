<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="title" required="true"%>

<div class="top-content">

	<div class="inner-bg">
		<div class="container">

			<div class="row">
				<div class="col-sm-8 col-sm-offset-2 text">
					<h1>
						<strong>EMS</strong> ${title}
					</h1>
					<div class="description"></div>
				</div>
			</div>
			
			<!-- only formBody tag should go here-->
			<jsp:doBody/>
		</div>
	</div>
</div>