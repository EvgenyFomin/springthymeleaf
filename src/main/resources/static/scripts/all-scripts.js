$(document).ready(function () {
    $("#name").bind("keyup", function () {
        $.ajax ({
            url: "/books-app/ajquery",
            type: "POST",
            data: ({name: $("#name").val()}),
            dataType: "html",
            success: function (data) {
                $("#wrapper").empty().html(data);
            }
        });
    });

    $("#selector").bind("change", function () {
        console.log($(this).val() + " " + $(this).text());
    })
});