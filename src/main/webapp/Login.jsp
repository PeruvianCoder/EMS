<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="ems" tagdir="/WEB-INF/tags"%>

<ems:html title="User Login">
<ems:body>
	<ems:form title="Login">
		<ems:formBody action="#" title="Sign on">
			<ems:formTextInput name="userName" label="User Name" value="Enter username"/>
			<ems:formTextInput name="userPass" label="Password" value="Enter password"/>
			<ems:formTextInput name="" label="Exhibitors" value="Cars and Stuff"/>

			<br/>
			<ems:formSubmitInput label="Create Event"/>
		</ems:formBody>
	</ems:form>
</ems:body>
</ems:html>