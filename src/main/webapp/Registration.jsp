<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="ems" tagdir="/WEB-INF/tags"%>

<ems:html title="Register">
<ems:body>
	<ems:form title="New User Registration">
		<ems:formBody action="#" title="Sign up now">
			<ems:formTextInput name="userName" label="User Name" value="Please enter username here"/>
			<ems:formTextInput name="userMail" label="E-Mail" value="Please enter your mail address"/>
			<ems:formTextInput name="userFullName" label="Full Name" value="Please enter your full name"/>
			<ems:formTextInput name="userDOB" label="Date of Birth" value="Please enter your DOB"/>
			<ems:formTextInput name="userPass" label="Password" value="Please enter Password"/>
			<ems:formTextInput name="userConfPass" label="Confirm Password" value="Please confirm password"/>
			<ems:formTextInput name="userPhone" label="Contact Number" value="Please enter your phone number"/>
			<ems:formTextInput name="userAddress" label="Address" value="Please enter your address"/>
			<ems:formTextInput name="userProfile" label="About Me" value="Please enter your profile information"/>
			<ems:formTextInput name="userRole" label="Role" value="Please enter the role you want to register for"/>
			<ems:formFileInput label="Upload Image" name="Upload Image"/>
			<br/>
			<ems:formSubmitInput label="Register"/>
		</ems:formBody>
	</ems:form>
</ems:body>
</ems:html>