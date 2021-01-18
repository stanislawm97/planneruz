<form action="<%=request.getContextPath()%>/register" method="post" style="max-width: 450px; margin:auto;"
      oninput='repeatPassword.setCustomValidity(repeatPassword.value !== password.value ? "Hasła nie są takie same" : "")'>

    <img class="mt-4 mb-4" src="resources/img/avatar.png" height="72" alt="Avatar logo"/>
    <h1 class="h3 mb-3 font-weight-normal">Rejestracja</h1>

    <div class="row mt-4">
        <div class="col-sm-6">
            <label for="name" class="sr-only">Imię</label>
            <input type="text" id="name" name="name" class="form-control" placeholder="Imię"
                   pattern="[A-Za-z0-9]{3,}"
                   title="Tylko znaki A-Z i 0-9, minimum 3 znaki" required autofocus>
        </div>
        <div class="col-sm-6">
            <label for="lastName" class="sr-only">Nazwisko</label>
            <input type="text" id="lastName" name="lastName" placeholder="Nazwisko" class="form-control"
                   pattern="[A-Za-z0-9]{3,}"
                   title="Tylko znaki A-Z i 0-9, minimum 3 znaki" required>
        </div>
    </div>

    <div class="row mt-4">
        <div class="col-sm-6">
            <label for="name" class="sr-only">Hasło</label>
            <input type="password" id="password" name="password" class="form-control" placeholder="Hasło"
                   pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
                   title="Musi posiadać co najmniej jedną wielką literę, jedną cyfrę i 8 znaków" required>
        </div>
        <div class="col-sm-6">
            <label for="repeatPassword" class="sr-only">Hasło</label>
            <input type="password" id="repeatPassword" name="repeatPassword" placeholder="Powtórz hasło"
                   pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
                   title="Musi posiadać co najmniej jedną wielką literę, jedną cyfrę i 8 znaków"
                   class="form-control" required>
        </div>
    </div>


    <div class="row mt-4">
        <div class="col-sm-6">
            <label for="login" class="sr-only">email</label>
            <input type="text" id="login" name="login" class="form-control" placeholder="Login"
                   pattern="[A-Za-z0-9]{3,}"
                   title="Tylko znaki A-Z i 0-9, minimum 3 znaki" required>
        </div>
        <div class="col-sm-6">
            <label for="login" class="sr-only">login</label>
            <input type="email" id="email" name="email" class="form-control" placeholder="Email" required>
        </div>
    </div>

    <div class="card-deck mt-4 mb-3 text-center">

        <div class="card mb-4 shadow-sm">
            <label for="field" class="sr-only">Kierunek: </label>
            <select name="field" id="field">
                <option disabled selected value>Kierunek studiów</option>
                <option value="Informatyka">Informatyka</option>
            </select>
        </div>

        <div class="card mb-4 shadow-sm">
            <label for="groupCode" class="sr-only">Grupa: </label>
            <select name="groupCode" id="groupCode">
                <option disabled selected value>Grupa</option>
                <option value="33INF-SSI-SP">33INF-SSI-SP</option>
            </select>
        </div>

        <div class="card mb-4 shadow-sm">
            <label for="subGroup" class="sr-only">Podgrupa: </label>
            <select name="subGroup" id="subGroup">
                <option disabled selected value>Podgrupa</option>
                <option value="A">A</option>
                <option value="B">B</option>
            </select>
        </div>

    </div>

    <div class="mt-4" style="max-width: 300px; margin: auto;">
        <input class="btn btn-lg btn-outline-secondary btn-block" style="margin: 4px;" type="submit" name="login"
               value="Rejestracja"/>
    </div>

    <div class="mt-2" style="max-width: 300px; margin-bottom: 100px;"></div>

</form>