<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Planneruz</title>
</head>
<body>
<div id="container">
    <div id="header">
        <jsp:include flush="true" page="/WEB-INF/components/navbar.jsp"/>
    </div>

    <div class="text-center mt-5">
        <jsp:include flush="true" page="/WEB-INF/components/calendar.jsp"/>
    </div>
</div>
</body>
</html>
