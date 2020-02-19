$(document).ready(function() {
    $("#tablesTable").DataTable();
    $("#manageTablesTable").hide();
    $("#addTableForm").hide();

    $("#listTablesButton").click(showTablesManagement);

    $("#addTableButton").click(showAddTableForm);

    $("#saveTableBtn").click(saveTable);

});

function showTablesManagement() {
    $("#checkAvailabilityForm").hide();
    $("#newReservationForm").hide();
    $("#confirmedReservationsTableDiv").hide();
    $("#addTableForm").hide();
    $("#manageTablesTable").show();
    console.log("before the get method");

    $.get("api/restauranttables", function(tables) {
        $("#tablesTableBody").empty();
        console.log(tables);

        for (let i = 0; i < tables.length; i++) {
            const table = tables[i];
            console.log(table);
            $("#tablesTableBody").append(
                '<tr id="row' + table.id + '"><td>' + table.id + '</td>' +
                '<td>' + table.shape + '</td>' +
                '<td>' + table.numOfSeats + '</td>' +
                '<td>' + table.count + '</td>' +
                '<td><button onclick="removeTable(' + table.id + ');"> Remove </button></td>' +
                '</tr>');
        }

    });

}

function showAddTableForm() {
    console.log("add table button clicked");
    $("#addTableForm").show();
    $("#manageTablesTable").hide();
    $("#checkAvailabilityForm").hide();
    $("#newReservationForm").hide();
    $("#confirmedReservationsTableDiv").hide();

}

function saveTable() {
    let table = {
        numOfSeats: $("#numbOfSeatsInput").val(),
        shape: $("#selectShapeInput").val(),
        count: $("#countOfTableTypeInput").val()
    }

    let tableJsonObject = JSON.stringify(table);

    $.ajax({
        url: "api/restauranttables",
        type: "POST",
        contentType: "application/json",
        data: tableJsonObject,
        success: function() {
            alert("Table added to system successflly!");
            $("#numbOfSeatsInput").val(''),
                $("#selectShapeInput").val(''),
                $("#countOfTableTypeInput").val('')
        },
        error: function() {
            alert("ERROR: Tables not added!");
        }
    })

}

function removeTable() {
    console.log("to remove table");
}