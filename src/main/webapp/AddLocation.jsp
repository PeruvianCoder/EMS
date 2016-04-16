<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="ems" tagdir="/WEB-INF/tags"%>

<ems:html title="Add Location">
<ems:body>
	<ems:form title="New Location Information">
		<ems:formBody action="#" title="Enter details now">
			<ems:formTextInput name="locName" label="Location Name" value="Please enter location name here"/>
			<ems:formTextInput name="locAddress" label="Location Address" value="Please enter address of the location"/>
			<ems:formTextInput name="boothCountSmall" label="No. of Small booths" value=""/>
			<ems:formTextInput name="boothCountMedium" label="No. of Medium booths" value=""/>
			<ems:formTextInput name="boothCountLarge" label="No. of Large booths" value=""/>
			<br/>
			<ems:formSubmitInput label="Add Location"/>
		</ems:formBody>
	</ems:form>
</ems:body>
</ems:html>