<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">

    <h5 class="my-0 mr-md-auto font-weight-normal">
        <img src="resources/img/note.svg" width="30" height="30" class="d-inline-block align-top" alt="" loading="lazy">
        Planneruz
    </h5>


    <nav class="my-2 my-md-0 mr-md-3">
        <a class="p-2 text-dark" href="${pageContext.request.contextPath}/">Plan zajęć</a>
    </nav>

    <div class="type-3">
        <div class="type-3-sub">
            <div class="btn btn-3" onclick="changeBackground()">
                <span class="btn-txt">Motyw</span>
                <span class="round"><i class="fa fa-chevron-right"></i></span>
            </div>
        </div>
    </div>

    <%
        Object id = session.getAttribute("id");
        if (id != null) {
    %>

    <a class="btn btn-outline-secondary" style="margin: 4px;"
       href="${pageContext.request.contextPath}/login">Wyloguj</a>

    <%} else {%>

    <a class="btn btn-outline-secondary" style="margin: 4px;"
       href="<%=request.getContextPath()%>/register">Zarejestruj</a>
    <a class="btn btn-outline-secondary" style="margin: 4px;"
       href="${pageContext.request.contextPath}/login">Zaloguj</a>

    <%}%>
</div>

<script>
    var isWhite = true;

    function changeBackground() {
        if (isWhite) {
            $('body').css('background', '#302e2e');

        } else {
            $('body').css('background', '#999696');
        }
        isWhite = !isWhite;
    }
</script>