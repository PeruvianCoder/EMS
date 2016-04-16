<%@page import="ems.DataSubsystem.Event"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="ems" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	List<Event> events = new ArrayList<Event>();
	events.add(new Event("Ultra Music Festival1TESTNEW", "3/15/2016", "Biscayne Bay Park", "Trade Show"));
	events.add(new Event("Ultra Music Festival2", "3/15/2016", "Biscayne Bay Park", "Trade Show"));
	events.add(new Event("Ultra Music Festival3", "3/15/2016", "Biscayne Bay Park", "Trade Show"));
	events.add(new Event("Ultra Music Festival4", "3/15/2016", "Biscayne Bay Park", "Trade Show"));
	request.setAttribute("events", events);
%>

<ems:html title="Login &amp; Register">
<ems:body>
	<ems:table title="Events Listing">
		<ems:tableFilter title="Trade Shows">
			<ems:tableFilterOption href="#" label="Trade Show" />
			<ems:tableFilterOption href="#" label="Concert" />
			<ems:tableFilterOption href="#" label="Something else here" />
			<ems:tableFilterOption href="#" label="nothing" />
		</ems:tableFilter>
		<ems:tableBody ths="Event Name,Category,Dates,Location">
			<c:forEach items="${events}" var="item">
				<tr>
					<td><a href=""><c:out value="${item.name}" /></a></td>
					<td><c:out value="${item.category}" /></td>
					<td><c:out value="${item.startDate}" /></td>
					<td><c:out value="${item.location}" /></td>
				</tr>
			</c:forEach>
		</ems:tableBody>
	</ems:table>
</ems:body>
</ems:html>