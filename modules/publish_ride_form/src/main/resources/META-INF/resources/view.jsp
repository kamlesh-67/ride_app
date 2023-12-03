<%@ include file="/init.jsp" %>
<portlet:renderURL var="viewRidesURL">
	<portlet:param name="mvcRenderCommandName" value="/rideapp/createride/add" />
	<portlet:param name="redirect" value="${param.redirect}" />
	<portlet:param name="ridestId" value="${rides.ridesId}" />
</portlet:renderURL>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ride App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/remixicon@3.6.0/fonts/remixicon.css" rel="stylesheet">
</head>

<body>

    <div class="container">
        <div class="row">
            <div class="col mt-5 mb-5">
                <div class="ms-auto" style="width: fit-content;">
                    <a href="#" class="btn btn-outline-primary rounded-circle "><i class="ri-search-line "></i></a>
                    <a href="${viewRidesURL }" class="btn btn-outline-primary rounded-circle "><i class="ri-add-line ""></i></a>
                </div>
            </div>
        </div>
        <!-- <div class="card" style="height: 250px;">
            <div class="row ">
                <div class="col col-2">
                    <div class="card" style="height: 248px;">
                        <img src="#" alt="profile">
                    </div>
                </div>
                <div class="col">
                    information
                </div>
            </div>
        </div> -->
    </div>



    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>

</body>

</html>