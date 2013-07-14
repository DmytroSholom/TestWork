<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Result Page</title>
</head>
<body>
<%@ page import="edu.test.model.user.StudentManager" %>
<jsp:useBean id="companyBean" class="edu.test.model.user.StudentEntity" />
<%request.setCharacterEncoding("UTF-8"); %>
<jsp:setProperty property="*" name="companyBean"/>
<% StudentManager.addNew(companyBean); %>
<div class="def">
	 <div class="tableRow">
	    <p> Прізвище: </p>
		<p> <jsp:getProperty property="lname" name="companyBean"/> </p>
	    </div>
	    <div class="tableRow">
		<p> Ім'я: </p>
		<p> <jsp:getProperty property="fname" name="companyBean"/> </p>
	    </div>
	     <div class="tableRow">
		<p> Роки навчання: </p>
		<p>  <jsp:getProperty property="startDate" name="companyBean"/> - <jsp:getProperty property="endDate" name="companyBean"/>  </p>
	    </div>
	    <div class="tableRow">
		<p> Пароль: </p>
		<p> <jsp:getProperty property="password" name="companyBean"/> </p>
	    </div>
</div>
</body>
</html>