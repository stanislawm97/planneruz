<form action="<%=request.getContextPath()%>/login" method="post" style="max-width: 350px; margin:auto;">

    <img class="mt-4 mb-4" src="resources/img/avatar.png" height="72" alt="Avatar logo"/>
    <h1 class="h3 mb-3 font-weight-normal">Logowanie</h1>

    <div class="mt-3">
        <label for="emailAddress" class="sr-only">Adres email</label>
        <input type="email" id="emailAddress" name="email" class="form-control" placeholder="Adres email" required
               autofocus>
    </div>

    <div class="mt-3">
        <label for="password" class="sr-only">Hasło</label>
        <input type="password" id="password" name="password" placeholder="Hasło" class="form-control">
    </div>

    <div class="checkbox mt-4">
        <label>
            <input type="checkbox" value="remember-me"> Zapamiętaj mnie
        </label>
    </div>

    <div class="mt-2" style="max-width: 300px; margin: auto;">
        <input class="btn btn-lg btn-outline-secondary btn-block" style="margin: 4px;" type="submit"
               value="Zaloguj się"/>
    </div>

    <div class="mt-2" style="max-width: 300px; margin-bottom: 100px;"></div>

</form>