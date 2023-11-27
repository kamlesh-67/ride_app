<%@ include file="/init.jsp" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ride App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>

<body>
    <div class="container">
        <div class="row">
            <center>
                <h1>Create Ride</h1>
            </center>
            <form>
                <div class="col-md-6 col-sm-3 offset-md-3">
                    <!-- Ride Details -->
                    <div class="card p-3 mb-2">
                        <div class="card-header mb-2">
                            <h5>Ride Details</h5>
                        </div>
                        <div class="mb-3">
                            <input type="text" class="form-control" id="leavingLoc"
                                placeholder="Enter starting location"">
                            <div class=" form-text">Location where you leaving from.
                        </div>
                    </div>

                    <div class="mb-3">
                        <input type="text" class="form-control" id="headingLoc" placeholder="Enter destination">
                        <div class="form-text">Where are you heading to?</div>
                    </div>

                    <div class="container p-0">
                        <div class="row">
                            <div class="mb-3 col-6">
                                <input type="date" class="form-control" id="date">
                                <div class="form-text">When is the ride?</div>
                            </div>
                            <div class="mb-3 col-6">
                                <input type="time" class="form-control" id="time">
                                <div class="form-text">What time will the ride start?</div>
                            </div>
                        </div>
                    </div>

                    <div class="mb-3">
                        <input type="number" max="4" min="1" maxlength="1" minlength="1" class="form-control"
                            id="availableSeats" placeholder="Enter available seats">
                        <div class="form-text">How many seats are available?</div>
                    </div>

                    <div class="mb-3">
                        <textarea type="number" class="form-control" id="availableSeats"
                            placeholder="Describe the comfort level of your ride"></textarea>
                        <div class="form-text">You can add (Vehicle Condition, Amenities, Space, Additional Services
                            )
                        </div>
                    </div>

                    <div class="mb-3">
                        <input type="number" min="400" max="600" step="20" class="form-control"
                            placeholder="Enter price per seat">
                        <div class="form-text">Set the price per seat</div>
                    </div>

                </div>
        </div>
        <div class="col-md-6 col-sm-3 offset-md-3">
            <!-- Stopover details -->
            <div class="card p-3 mb-2">
                <div class="card-header mb-2">
                    <h5>Add Stopovers</h5>
                </div>
                <div id="stopovers">
                    <div class="mb-3">
                        <input type="text" class="form-control" id="leavingLoc" placeholder="Enter stopover location">
                        <div class=" form-text">Location where you leaving from.
                        </div>
                    </div>
                    <div class="container p-0">
                        <div class="row">
                            <div class="mb-3 col-6">
                                <input type="time" class="form-control" id="time">
                                <div class="form-text">When will you arrive at this stopover?</div>
                            </div>
                            <div class="mb-3 col-6">
                                <input type="time" class="form-control" id="time">
                                <div class="form-text">When will you depart from this stopover?</div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- <div class="stopovers">
                        <hr>
                        <div class="mb-3">
                            <input type="text" class="form-control" id="leavingLoc" placeholder="Enter stopover location">
                            <div class=" form-text">Location where you leaving from.
                            </div>
                        </div>
                        <div class="container p-0">
                            <div class="row">
                                <div class="mb-3 col-6">
                                    <input type="time" class="form-control" id="time">
                                    <div class="form-text">When will you arrive at this stopover?</div>
                                </div>
                                <div class="mb-3 col-6">
                                    <input type="time" class="form-control" id="time">
                                    <div class="form-text">When will you depart from this stopover?</div>
                                </div>
                            </div>
                        </div>
                    </div> -->
                <a class="btn btn-outline-success" id="addStopover">Add more</a>
            </div>
        </div>
        <div class="col-md-6 col-sm-3 offset-md-3">
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="true" id="addRide">
                <label class="form-check-label" for="addRide">
                    Add return ride
                </label>
            </div>
        </div>

        <div class="col-md-6 col-sm-3 offset-md-3 " style="display: none;" id="addRideForm">
            <!-- Ride Details -->
            <div class="card p-3 mb-2">
                <div class="card-header mb-2">
                    <h5>Return Ride Details</h5>
                </div>
                <!-- <div class="mb-3">
                            <input type="text" class="form-control" id="leavingLoc" placeholder="Enter starting location"">
                                            <div class=" form-text">Location where you leaving from.
                        </div>
                    </div> -->

                <!-- <div class="mb-3">
                        <input type="text" class="form-control" id="headingLoc" placeholder="Enter destination">
                        <div class="form-text">Where are you heading to?</div>
                    </div> -->

                <div class="container p-0">
                    <div class="row">
                        <div class="mb-3 col-6">
                            <input type="date" class="form-control" id="date">
                            <div class="form-text">When is the ride?</div>
                        </div>
                        <div class="mb-3 col-6">
                            <input type="time" class="form-control" id="time">
                            <div class="form-text">What time will the ride start?</div>
                        </div>
                    </div>
                </div>

                <div class="mb-3">
                    <input type="number" max="4" min="1" maxlength="1" minlength="1" class="form-control"
                        id="availableSeats" placeholder="Enter available seats">
                    <div class="form-text">How many seats are available?</div>
                </div>



                <div class="mb-3">
                    <input type="number" min="400" max="600" step="20" class="form-control"
                        placeholder="Enter price per seat">
                    <div class="form-text">Set the price per seat</div>
                </div>

            </div>
        </div>


        <div class="col-md-6 col-sm-3 offset-md-3">
            <!-- Vehicle details -->
            <div class="card p-3 mb-2">
                <div class="card-header mb-2">
                    <h5>Vehicle Info</h5>
                </div>


                <div class="mb-3">
                    <select class="form-select" aria-label="Default select example">
                        <option selected>Enter vehicle model</option>
                        <option value="1">Maruti Swift</option>
                        <option value="2">Tata Punch</option>
                        <option value="3">Maruti Brezza</option>
                    </select>
                    <div class=" form-text">What is the model of your vehicle?
                    </div>
                </div>



                <div class="mb-3">
                    <input type="text" class="form-control" id="leavingLoc" placeholder="Enter plate number">
                    <div class=" form-text">What is the license plate number of your vehicle?
                    </div>
                </div>



                <div class="mb-3">
                    <input type="number" min="1" class="form-control" id="availableSeats"
                        placeholder="Enter available seats">
                    <div class=" form-text">How many people can your vehicle accommodate?
                    </div>
                </div>


                <div class="mb-3">
                    <textarea type="number" class="form-control" id="availableSeats"
                        placeholder="Describe the comfort level of your ride"></textarea>
                    <div class="form-text">You can add (Vehicle Condition, Amenities, Space, Additional Services
                        )
                    </div>
                </div>

            </div>
        </div>

        <div class="container text-center">
            <button type="submit" class="btn btn-outline-primary ">Submit</button>
        </div>
        </form>
    </div>
    </div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>

    <script>

        const addRideBtn = document.querySelector("#addRide");
        const addRideForm = document.querySelector("#addRideForm");
        let flag = 0;
        const addRide = () => {
            if (flag == 0) {
                addRideForm.style.display = "block";
                flag = 1;
            } else {
                addRideForm.style.display = "none";
                flag = 0;
            }

        }
        addRideBtn.addEventListener("click", addRide);

        const stopovers = document.querySelector("#stopovers");
        const addStopoverBtn = document.querySelector("#addStopover");

        let stopoverForm = stopovers.innerHTML;
        stopoverForm = "<hr>" + stopoverForm
        // console.log(stopoverForm);

        addStopoverBtn.addEventListener("click", () => {
            stopovers.innerHTML += stopoverForm;
        })





    </script>
</body>

</html>