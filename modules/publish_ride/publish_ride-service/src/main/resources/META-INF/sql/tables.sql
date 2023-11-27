create table Rideapp_bookings (
	bookingsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	bookingDate DATE null,
	bookedSeats INTEGER,
	totalPrice DOUBLE,
	ridesId LONG
);

create table Rideapp_locations (
	locationsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	latitude DOUBLE,
	longitude DOUBLE
);

create table Rideapp_returnRide (
	returnRideId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	returnDate DATE null,
	availableSeats INTEGER,
	price DOUBLE,
	ridesId LONG
);

create table Rideapp_rides (
	ridesId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	leavingLocation VARCHAR(75) null,
	headingLocation VARCHAR(75) null,
	arivalDate DATE null,
	availableSeats INTEGER,
	comfortLevel VARCHAR(75) null,
	price DOUBLE
);

create table Rideapp_stopovers (
	stopoversId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	location VARCHAR(75) null,
	arrivalTime DATE null,
	departureTime DATE null,
	ridesId LONG
);

create table Rideapp_vehicals (
	vehicalsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	carModel VARCHAR(75) null,
	plateNumber VARCHAR(75) null,
	capacity INTEGER,
	comfortLevel VARCHAR(75) null
);