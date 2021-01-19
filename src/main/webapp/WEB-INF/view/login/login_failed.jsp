<%@ page contentType="text/html; charset=ISO 8859-2" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pl">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <link href="resources/css/login_custom.css" rel="stylesheet">


    <title>Planneruz</title>
</head>

<body style="background-color:grey;">

<main role="main" class="container">
    <div class="my-3 p-3 bg-white rounded shadow-sm">

        <div id="header">
            <jsp:include flush="true" page="/WEB-INF/components/navbar_component.jsp"/>
        </div>

        <div class="alert alert-danger alert-dismissible fade show" role="alert">
            Niepoprawny login lub haslo!
            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
        </div>

        <div class="text-center mt-5 border-bottom border-gray">
            <jsp:include flush="true" page="/WEB-INF/components/login_component.jsp"/>
        </div>

        <footer class="container py-5">
            <jsp:include flush="true" page="/WEB-INF/components/footer_component.jsp"/>
        </footer>

    </div>
</main>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
        integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
        crossorigin="anonymous"></script>

</body>

</html>