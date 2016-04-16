<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="ems" tagdir="/WEB-INF/tags"%>

<ems:html title="Login &amp; Register">
<ems:body>
	<ems:form title="New Event Registration">
		<ems:formBody action="#" title="Event Details">
			<ems:formTextInput name="eventName" label="Event Name" value="Antique Trade Show"/>
			<ems:formTextInput name="eventCategory" label="Category" value="Trade Show"/>
			<ems:formTextInput name="exhibitors" label="Exhibitors" value="Cars and Stuff"/>
			<ems:formTextInput name="location" label="Location" value="Biscayne Bay Park"/>
			<ems:dropdownMenu>
				<ems:dropdownMenuOption value="one"/>
				<ems:dropdownMenuOption value="twoo"/>
				<ems:dropdownMenuOption value="three"/>
			</ems:dropdownMenu>
			<ems:dateInput label="Start Date" placeholder="Enter Date Here"/>
			<ems:formFileInput label="Upload Logo" name="Upload Logo"/>
			<br/>
			<ems:formSubmitInput label="Create Event"/>
		</ems:formBody>
	</ems:form>
</ems:body>
</ems:html>