//this works but it crash the page so at least i got something
document.addEventListener('DOMContentLoaded', function() {
    var link = document.getElementById("button_submit");
    // onClick's logic below:
    link.addEventListener('click', function() {
        console.log('I WORKED');
    });
});