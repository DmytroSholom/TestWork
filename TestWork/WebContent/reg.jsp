<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Реєстрація студента</title>
<link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
	<form action="InputStudents" name="student" class="def" enctype="application/x-www-form-urlencoded">
	    <div class="tableRow">
	    <p> Прізвище: </p>
		<p> <input type="text" name="lname" > </p>
	    </div>
	    <div class="tableRow">
		<p> Ім'я: </p>
		<p> <input type="text" name="fname" > </p>
	    </div>
	     <div class="tableRow">
		<p> Роки навчання: </p>
		<p>  <input type="date" name="startDate"> - <input type="date" name="endDate">  </p>
	    </div>
	    <div class="tableRow">
		<p> Пароль: </p>
		<p> <input type="password" name="password" > </p>
	    </div>
	 <input type="submit" name="action" value="Підтвердити" align="middle">
	</form>
</body>
</html>