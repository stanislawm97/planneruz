<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Planneruz</title>
</head>
<body>
<div id="container">
    <div id="header">
        <jsp:include flush="true" page="/WEB-INF/view/navbar.jsp"/>
    </div>

    <!-- Center Column -->
    <div class="col-sm-10">
        <jsp:include flush="true" page="/WEB-INF/view/calendar.jsp"/>
    </div>

    <footer>
        <div class="small-print">
            <div class="container">
                <p><a href="#">Terms &amp; Conditions</a> | <a href="#">Privacy Policy</a> | <a href="#">Contact</a></p>
                <p>Copyright &copy; Example.com 2015 </p>
            </div>
        </div>
    </footer>
</div>
</body>
</html>
