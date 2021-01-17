<%@ page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/custom.css" rel="stylesheet">
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

    <style>
        body {
            background: #ffffff;
            font-family: 'Encode Sans', sans-serif;
        }

        /* navigation bar */
        #scanfcode {
            border-radius: 0;
            background: #fff;
            padding: 10px;
            font-size: 17px;
        }

        /* logo or main heading */
        #logo {
            font-size: 20px;
            font-weight: bolder;
            color: #00004d;
            letter-spacing: 2px;
        }

        /* navigation links*/
        #link a {
            color: #01325d;
            margin: 0 20px 0 10px;
            letter-spacing: 2px;
        }

        /* navigation link with right border */
        #first-link {
            padding-right: 6px;
            border-right: solid 1px #ccc;
        }

    </style>

    <title>Planneruz</title>
</head>

<body>

<nav id="scanfcode" class="navbar">
    <div class="container-fluid">

        <div class="navbar-header">
            <button type="button" id="toogle-button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#myNavbar">
                <span class="glyphicon glyphicon-menu-hamburger"></span>
            </button>
            <a id="logo" class="navbar-brand" href="${pageContext.request.contextPath}/">Planneruz</a>
        </div>

        <div class="collapse navbar-collapse" id="myNavbar">
            <ul id="link" class="nav navbar-nav navbar-right">
                <li class="dropdown" id="first-link">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Wiecej<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Page 1-1</a></li>
                        <li><a href="#">Page 1-2</a></li>
                        <li><a href="#">Page 1-3</a></li>
                    </ul>
                </li>
                <li><a href='${pageContext.request.contextPath}/login'>Zaloguj</a></li>
            </ul>
        </div>
    </div>
</nav>

<!-- jQuery -->
<script src="resources/js/jquery-1.11.3.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="resources/js/bootstrap.min.js"></script>

<!-- IE10 viewport bug workaround -->
<script src="resources/js/ie10-viewport-bug-workaround.js"></script>

<!-- Placeholder Images -->
<script src="resources/js/holder.min.js"></script>
</body>
</html>
