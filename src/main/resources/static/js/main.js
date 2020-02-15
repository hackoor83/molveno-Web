$(document).ready(function() {
    $("#checkAvailabilityForm").hide();
    $("#newReservationButton").click(showChecker);
    $("#addReservationButton").click(addReservation);
});


function showChecker() {
    $("#checkAvailabilityForm").show();
    alert("checker shown");
}

function showInfoForm() {

}

function addReservation() {
    let reservation = {
        numOfTables: $("#numOfTables").val(),
        guestFirstName: $("#fnameInput").val(),
        guestLastName: $("#lnameInput").val(),
        dateNtime: $("#dateInput").val(),
        telNum: $("#telInput").val(),
        emailAddress: $("#emailInput").val()
    }

    let jsonObject = JSON.stringify(reservation);

    $.ajax({
        url: "api/reservation",
        type: "POST",
        contentType: "application/json",
        data: jsonObject,
        success: function() {
            console.log("success");
            alert("Reservation added successfully!");
            $("#numOfTables").val(''),
                $("#fnameInput").val(''),
                $("#lnameInput").val(''),
                $("#dateInput").val(''),
                $("#telInput").val(''),
                $("#emailInput").val('')
        },
        error: function() {
            alert("Please enter valid data!!");
        }

    })

}