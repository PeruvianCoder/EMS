<%@ tag language="java" pageEncoding="UTF-8" body-content="empty"%>
<%@ attribute name="image" rtexprvalue="true" required="true"%>
<%@ attribute name="title" rtexprvalue="true" required="true"%>
<%@ attribute name="subtitle" rtexprvalue="true" required="true"%>

<div class="col-lg-4 col-sm-6">
	<a href="#" class="portfolio-box"> <img src="${image}" class="img-responsive" alt="" />
		<div class="portfolio-box-caption">
			<div class="portfolio-box-caption-content">
				<div class="project-category text-faded">${title}</div>
				<div class="project-name">${subtitle}</div>
			</div>
		</div>
	</a>
</div>