<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="ems" tagdir="/WEB-INF/tags"%>

<ems:html title="Add User">
<ems:body>
	<ems:form title="New User Information">
		<ems:formBody action="#" title="Enter details">
			<ems:formTextInput name="userName" label="User Name" value="Please enter username here"/>
			<ems:formTextInput name="userMail" label="E-Mail" value="Please enter mail address"/>
			<ems:formTextInput name="userFullName" label="Full Name" value="Please enter full name"/>
			<ems:formTextInput name="userDOB" label="Date of Birth" value="Please enter DOB"/>
			<ems:formTextInput name="userPhone" label="Contact Number" value="Please enter phone number"/>
			<ems:formTextInput name="userAddress" label="Address" value="Please enter address"/>
			<ems:formTextInput name="userProfile" label="About Me" value="Please enter profile information"/>
			<ems:formTextInput name="userRole" label="Role" value="Please enter the required role"/>
			<ems:formTextInput name="eventName" label="Event Name" value="Please enter the event for which user is being added"/>
			<ems:formFileInput label="Upload Image" name="Upload Image"/>
			<br/>
			<ems:formSubmitInput label="Register"/>
		</ems:formBody>
	</ems:form>
</ems:body>
</ems:html>