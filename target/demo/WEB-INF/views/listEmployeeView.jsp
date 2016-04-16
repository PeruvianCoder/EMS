<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
<head>
    <title>Employee Management</title>
    <style>
    .error 
    {
        color: #ff0000;
        font-weight: bold;
    }
    #listOfEmployees tr:first-child{
        font-weight: bold;
    }
    </style>
</head>
 
<body>
     
    <h2><spring:message code="lbl.page.list" text="lbl.page.list" /></h2>
    <br/>
     
    <table id="listOfEmployees" border="1">
    <tr>
        <td>ID</td>
        <td>First Name</td>
        <td>Last Name</td>
        <td>Email</td>
        <td>Department</td>
      </tr>
    <c:forEach items="${allEmployees}" var="employee">    
      <tr>
        <td>${employee.id}</td>
        <td>${employee.firstName}</td>
        <td>${employee.lastName}</td>
        <td>${employee.email}</td>
        <td>${employee.department.name}</td>
      </tr>
    </c:forEach>
    </table>
 
    <h2><spring:message code="lbl.page" text="Add New Employee" /></h2>
    <br/>
    <form:form method="post" modelAttribute="employee">
        <table>
            <tr>
                <td><spring:message code="lbl.firstName" text="First Name" /></td>
                <td><form:input path="firstName" /></td>
                <td><form:errors path="firstName" cssClass="error" /></td>
            </tr>
            <tr>
                <td><spring:message code="lbl.lastName" text="Last Name" /></td>
                <td><form:input path="lastName" /></td>
                <td><form:errors path="lastName" cssClass="error" /></td>
            </tr>
            <tr>
                <td><spring:message code="lbl.email" text="Email Id" /></td>
                <td><form:input path="email" /></td>
                <td><form:errors path="email" cssClass="error" /></td>
            </tr>
            <tr>
                <td><spring:message code="lbl.department" text="Department" /></td>
                <td><form:select path="department" items="${allDepartments}" itemValue="id" itemLabel="name" /></td>
                <td><form:errors path="department" cssClass="error" /></td>
            </tr>
            <tr>
                <td colspan="3"><input type="submit" value="Add Employee"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>