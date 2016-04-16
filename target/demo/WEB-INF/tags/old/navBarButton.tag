<%@ tag language="java" pageEncoding="UTF-8" body-content="empty"%>
<%@ attribute name="name" rtexprvalue="true" required="true"%>
<%@ attribute name="link" rtexprvalue="true" required="true"%>

<li><a href="${link}">${name}</a></li>