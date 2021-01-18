<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01"
            aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">

        <a class="navbar-brand" href="${pageContext.request.contextPath}/#">
            <img src="resources/img/note.svg" width="30" height="30" class="d-inline-block align-top" alt=""
                 loading="lazy">
            Planneruz
        </a>

        <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
            <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
            </li>
        </ul>

        <form class="form-inline my-2 my-lg-0" action="<%=request.getContextPath()%>/login" method="get">
            <input class="btn btn-lg btn-outline-secondary btn-block btn-grad" type="submit" value="Zaloguj"/>
        </form>

        <form class="form-inline my-2 my-lg-0" action="<%=request.getContextPath()%>/register" method="get">
            <input class="btn btn-lg btn-outline-secondary btn-block btn-grad" type="submit" value="Zarejestruj"/>
        </form>
    </div>
</nav>