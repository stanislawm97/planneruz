<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pl">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <link href="resources/css/custom.css" rel="stylesheet">

    <title>Planneruz</title>
</head>
<body>

<style>
    input[type="email"] {
        border-bottom-left-radius: 0;;
        border-bottom-right-radius: 0;;
    }

    input[type="password"] {
        border-top-left-radius: 0;;
        border-top-right-radius: 0;;
        border-top: 0;;
    }

    .btn-grad {
        background-image: linear-gradient(to right, #2b5876 0%, #4e4376 51%, #2b5876 100%)
    }

    .btn-grad {

        text-align: center;
        transition: 0.5s;
        background-size: 200% auto;
        color: white;
        box-shadow: 0 0 20px #eee;
        border-radius: 10px;
        display: block;
    }

    .btn-grad:hover {
        background-position: right center; /* change the direction of the change here */
        color: #fff;
        text-decoration: none;
    }

</style>

<div id="header">
    <jsp:include flush="true" page="/WEB-INF/components/navbar.jsp"/>
</div>

<div id="container">
    <div class="text-center mt-5">
        <form action="<%=request.getContextPath()%>/login" method="post" style="max-width: 350px; margin:auto;">
            <img class="mt-4 mb-4" src="resources/img/avatar.png" height="72" alt="Avatar logo"/>
            <h1 class="h3 mb-3 font-weight-normal">Zaloguj się</h1>
            <label for="emailAddress" class="sr-only">Adres email</label>
            <input type="email" id="emailAddress" name="email" class="form-control" placeholder="Adres email" required
                   autofocus>
            <label for="password" class="sr-only">Hasło</label>
            <input type="password" id="password" name="password" placeholder="Hasło" class="form-control">
            <div class="checkbox mt-2">
                <label>
                    <input type="checkbox" value="remember-me"> Zapamiętaj mnie
                </label>
            </div>
            <div>
                <a href="register">Nie masz konta? Zarejestruj się!</a>
            </div>
            <div class="mt-2" style="max-width: 300px; margin: auto;">

                <input class="btn btn-lg btn-primary btn-block btn-grad" type="submit" name="login"
                       value="Zaloguj się"/>

                <!-- <button class="btn btn-lg btn-primary btn-block btn-grad">Zaloguj się</button>-->
            </div>
        </form>
    </div>

</div>

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