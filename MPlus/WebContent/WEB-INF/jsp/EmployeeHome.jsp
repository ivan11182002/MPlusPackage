<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath">${pageContext.request.contextPath}</c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="${contextPath}/resources/Scripts/angular1.2.js"></script>
<script src="${contextPath}/resources/Apps/employee/EmployeeApp.js"></script>
<script src="${contextPath}/resources/Apps/employee/EmployeeController.js"></script>
<title>Employee</title>
</head>
<body  ng-app="employeeApp" ng-controller="employeeController">

<table>
	<tr>
		<th>First Name</th>
		<td><input type="text" ng-model="firstName"></td>
	</tr>
	<tr>
		<th>Department Id</th>
		<td><input type="text" ng-model="departmentId"></td>
	</tr>
</table>

<button ng-click="findEmployee()">findEmployee</button>

<table border="1">
	<thead>
		<tr>
			<th>EmployeeId</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>PhoneNumber</th>
			<th>HireDate</th>
			<th>JobId</th>
			<th>Salary</th>
			<th>CommissionPct</th>
			<th>ManagerId</th>
			<th>DepartmentId</th>
		</tr>
	</thead>
	<tbody>
		<tr ng-repeat="emp in employeeList">
			<td>{{emp.employeeId}}</td>
			<td>{{emp.firstName}}</td>
			<td>{{emp.lastName}}</td>
			<td>{{emp.email}}</td>
			<td>{{emp.phoneNumber}}</td>
			<td>{{emp.hireDate}}</td>
			<td>{{emp.jobId}}</td>
			<td>{{emp.salary}}</td>
			<td>{{emp.commissionPct}}</td>
			<td>{{emp.managerId}}</td>
			<td>{{emp.departmentId}}</td>
		</tr>
	</tbody>
</table>


</body>
</html>