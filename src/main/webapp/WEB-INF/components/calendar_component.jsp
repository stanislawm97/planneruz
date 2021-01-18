<%@ page contentType="text/html; charset=ISO 8859-2" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Planneruz</title>
    <link href='resources/lib/main.css' rel='stylesheet'/>
    <script src='resources/lib/main.js'></script>
    <script src='resources/lib/locales-all.js'></script>
    <script>
        document.addEventListener('DOMContentLoaded', function () {
            var initialLocaleCode = 'pl';
            var localeSelectorEl = document.getElementById('locale-selector');
            var calendarEl = document.getElementById('calendar');
            var today = new Date();
            var dd = String(today.getDate()).padStart(2, '0');
            var mm = String(today.getMonth() + 1).padStart(2, '0');
            var yyyy = today.getFullYear();

            var queryString = window.location.search;
            var urlParams = new URLSearchParams(queryString);

            var url = ' ';
            if (urlParams.get('studentGroup') === "33INF-SSI-SP") {
                url = 'http://localhost:8080/planneruz/read-from-web';
            } else {
                url = ' ';
            }

            var calendar = new FullCalendar.Calendar(calendarEl, {
                headerToolbar: {
                    left: 'prev,next today',
                    center: 'title',
                    right: 'dayGridMonth,timeGridWeek,timeGridDay,listMonth'
                },
                initialDate: yyyy + '-' + mm + '-' + dd,
                locale: initialLocaleCode,
                buttonIcons: false, // show the prev/next text
                weekNumbers: false,
                navLinks: true, // can click day/week names to navigate views
                editable: false,
                dayMaxEvents: true, // allow "more" link when too many events
                events: url

            });

            calendar.render();

            // build the locale selector's options
            calendar.getAvailableLocaleCodes().forEach(function (localeCode) {
                var optionEl = document.createElement('option');
                optionEl.value = localeCode;
                optionEl.selected = localeCode == initialLocaleCode;
                optionEl.innerText = localeCode;
                localeSelectorEl.appendChild(optionEl);
            });

            // when the selected option changes, dynamically change the calendar option
            localeSelectorEl.addEventListener('change', function () {
                if (this.value) {
                    calendar.setOption('locale', this.value);
                }
            });

        });

    </script>
</head>
<body>

<div id='calendar'></div>

<small class="d-block mt-1">
    <a href="http://www.plan.uz.zgora.pl/grupy_lista_kierunkow.php">Uniwersytet Zielonogorski - Plan zajec</a>
</small>

</body>
</html>