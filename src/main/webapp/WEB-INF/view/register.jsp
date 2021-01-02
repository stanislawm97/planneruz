<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    <title>Rejestracja</title>

</head>
<body>

<style>

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


<div class="text-center mt-5">
    <form style="max-width: 450px; margin:auto;">
        <img class="mt-4 mb-4" src="../../resources/img/avatar.png" height="72" alt="Avatar logo"/>
        <h1 class="h3 mb-3 font-weight-normal">Rejestracja</h1>

        <div class="row">
            <div class="col-sm-6">
                <label for="name" class="sr-only">Imię</label>
                <input type="text" id="name" class="form-control" placeholder="Imię" required autofocus>
            </div>
            <div class="col-sm-6">
                <label for="secondName" class="sr-only">Hasło</label>
                <input type="text" id="secondName" placeholder="Nazwisko" class="form-control" required>
            </div>
        </div>

        <div class="row mt-4">
            <div class="col-sm-6">
                <label for="name" class="sr-only">Hasło</label>
                <input type="password" id="password" class="form-control" placeholder="Hasło" required>
            </div>
            <div class="col-sm-6">
                <label for="repeatPassword" class="sr-only">Hasło</label>
                <input type="password" id="repeatPassword" placeholder="Powtórz hasło" class="form-control" required>
            </div>
        </div>


        <div class="row mt-4">
            <div class="col-sm-6">
                <label for="email" class="sr-only">email</label>
                <input type="email" id="email" class="form-control" placeholder="Email" required>
            </div>
            <div class="col-sm-6">
                <label for="field" class="sr-only">Kierunek: </label>
                <select name="field" id="field">
                    <option disabled selected value>Kierunek studiów</option>
                    <option value="Informatyka">Informatyka</option>
                </select>
            </div>
        </div>

        <div class="row mt-4">
            <div class="col-sm-6">
                <label for="group" class="sr-only">Grupa: </label>
                <select name="group" id="group">
                    <option disabled selected value>Grupa</option>
                    <option value="33INF-SSI-SP">33INF-SSI-SP</option>
                </select>
            </div>
            <div class="col-sm-6">
                <label for="secondGroup" class="sr-only">Podgrupa: </label>
                <select name="secondGroup" id="secondGroup">
                    <option disabled selected value>Podgrupa</option>
                    <option value="A">A</option>
                    <option value="B">B</option>
                </select>
            </div>
        </div>

        <div class="mt-4" style="max-width: 300px; margin: auto;">
            <button class="btn btn-lg btn-primary btn-block btn-grad">Rejestracja</button>
        </div>

    </form>
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