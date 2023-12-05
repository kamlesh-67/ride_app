<%@ include file="/init.jsp"%>
<portlet:renderURL var="viewRidesURL">
	<portlet:param name="mvcRenderCommandName"
		value="/rideapp/createride/add" />
	<portlet:param name="redirect" value="${param.redirect}" />
	<portlet:param name="ridestId" value="${rides.ridesId}" />
</portlet:renderURL>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Ride App</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<link
	href="https://cdn.jsdelivr.net/npm/remixicon@3.6.0/fonts/remixicon.css"
	rel="stylesheet">
</head>

<body>

	<div class="container">
		<div class="row">
			<div class="col mt-5 mb-5">
				<div class="ms-auto" style="width: fit-content;">
					<a href="#" class="btn btn-outline-primary rounded-circle "><i
						class="ri-search-line "></i></a> <a href="${viewRidesURL }"
						class="btn btn-outline-primary rounded-circle "><i
						class="ri-add-line ""></i></a>
				</div>
			</div>
		</div>
	</div>
	<h1>Hello</h1>
	<c:forEach var="data" items="${r}">
		<!-- Display data from the database -->
		<p>${data.getLeavingLocation()}hello</p>
	</c:forEach>
	<h1>Hello</h1>



	<section>
		<div class=" container">
			<div class="card">
				<div class="row">
					<div class="col-5"></div>
					<div class="col-7">

						<div class="card m-3">
							<div class="row">

								<div class="col-3">
									<div class="card align-items-center p-3">
										<div class="rounded-circle "
											style="height: 80px; width: 80px; overflow: hidden; border: 2px solid #fff; box-shadow: 0px 2px 4px 1px #0000006f;">
											<img style="height: 100%; scale: 1.5; object-fit: cover;"
												src="https://t4.ftcdn.net/jpg/03/64/21/11/360_F_364211147_1qgLVxv1Tcq0Ohz3FawUfrtONzz8nq3e.jpg"
												alt="">
										</div>
										<div class="row">
											<div class="col">
												<I class="ri-verified-badge-fill" style="color: #4b9aff;"></I>Kamlesh
											</div>
										</div>
										<div class="row">
											<div class="col">
												4 <I class="ri-star-fill " style="color: #f58b00;"></I>
											</div>
										</div>

									</div>
								</div>
								<div class="col-9 p-3">
									<div class="row">
										<div class="col-10" style="color: #7E57C2;">
											<b>12 Dec 2023 Tuesday</b>
										</div>
										<div class="col-2" style="color: #7E57C2; font-weight: bold;">
											&#8377; 520/-</div>
									</div>
									<div class="row">
										<div class="col">
											<b>Leaving Location <i class="ri-arrow-right-line"></i>
												Heading Location
											</b>
										</div>
									</div>
									<div class="row">
										<div class="col" style="font-weight: 600;">
											5:15AM <i class="ri-arrow-right-line"></i> 10:30Am <span
												style="color: #7E57C2;">5h15</span>
										</div>
									</div>
									<div class="row">
										<div class="col">
											<i class="ri-user-3-line"></i> 3
										</div>
									</div>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</section>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>

</body>

</html>