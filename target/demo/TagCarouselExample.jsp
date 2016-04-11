<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="ems" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%
	List<String> images = Arrays.asList("assets/img/portfolio/1.jpg", "assets/img/portfolio/2.jpg",
			"assets/img/portfolio/3.jpg", "assets/img/portfolio/4.jpg");
	List<String> alts = Arrays.asList("image1", "image2", "image3", "image4");
	request.setAttribute("images", images);
	request.setAttribute("alts", alts);
%>

<ems:html title="Carousel Example">
<ems:body>
	<ems:carousel num="${fn:length(images)}">
		<ems:carouselItem alt="${alts[0]}" src="${images[0]}" active="true"/>
		<c:forEach var="i" begin="1" end="${fn:length(images) -1}">
			<ems:carouselItem alt="${alts[i]}" src="${images[i]}" active="false"/>
		</c:forEach>
	</ems:carousel>
</ems:body>
</ems:html>