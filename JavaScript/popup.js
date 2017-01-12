//this is where the javascript application goes
 

/*document.addEventListener('DOMContentLoaded', function()){
	var link = document.getElementByID("checkPage");
	link.addEventListener('click', function()){
		alert("HI ERIN");
		replaceImg();
	});
});
*/

function pop(e){
	var link = document.URL;
	alert("HI");
}

var butt = document.querySelector('.checkPage');
butt.addEventListener('click', pop);

function replaceImg {
 var images = document.getElementsByTagName('img');

    for(var i = 0; i < images.length; i++)
    {
        var img = images[i];

        if(img.src.length == 0)
        {
            img.src = 'icon.png';
        }
    }
}