$(document).ready(function() {
    $('#reservationsTable').DataTable();
    $("#checkAvailabilityForm").hide();
    $("#newReservationForm").hide();
    $("#confirmedReservationsTableDiv").hide();
    $("#newReservationButton").click(showChecker);
    $("#addReservationButton").click(addReservation);
    $("#showReservations").click(showReservations);
});

//This function fires up when the "Make New Reservation" button is clicked.
function showChecker() {
    $("#checkAvailabilityForm").show();
    $("#manageTablesTable").hide();
    $("#addTableForm").hide();
    $("#confirmedReservationsTableDiv").hide();
    $("#checkAvailabilityButton").click(function() {
        console.log("button clicked");
        $("#dateInput").val($("#dateInputChecker").val());
        $("#numOfTables").val($("#numOfTablesChecker").val());
        $("#numOfPersons").val($("#numOfPersonsChecker").val());
        $("#newReservationForm").show();
        $("#checkAvailabilityForm").hide();
    });
}


function addReservation() {

    let reservation = {
        numOfTables: $("#numOfTables").val(),
        numOfPersons: $("#numOfPersons").val(),
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

function showReservations() {
    console.log("show reservations clicked");

    $("#newReservationForm").hide();
    $("#addTableForm").hide();
    $("#manageTablesTable").hide();
    $("#checkAvailabilityForm").hide();
    $("#confirmedReservationsTableDiv").show();

    $.get("api/reservation", function(reservations) {
        $("#reservationTableBody").empty();
        for (let i = 0; i < reservations.length; i++) {
            const reservation = reservations[i];
            console.log(reservation);
            $("#reservationTableBody").append(
                '<tr id="row' + reservation.id + '"><td>' + reservation.id + '</td>' +
                '<td>' + reservation.numOfTables + '</td>' +
                '<td>' + reservation.numOfPersons + '</td>' +
                '<td>' + reservation.guestFirstName + '</td>' +
                '<td>' + reservation.guestLastName + '</td>' +
                '<td>' + reservation.dateNtime + '</td>' +
                '<td>' + reservation.telNum + '</td>' +
                '<td>' + reservation.emailAddress + '</td>' +
                '<td><button onclick="deleteReservation(' + reservation.id + ');"> Delete </button></td>' +
                '</tr>');
        }
    });

}

function deleteReservation(id) {
    alert("Are you sure you want to delete this reservation?");

    $.ajax({
        url: "api/reservation/" + id,
        type: "DELETE",
        success: function() {
            alert("Succesfully deleted");
            $("#row" + id).remove();
        },
        error: function() {
            alert("ERROR: Reservation not deleted!");
        }
    });
}