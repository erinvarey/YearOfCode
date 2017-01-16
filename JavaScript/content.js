//reloads source code every 5 seconds to dynamically load
var images = document.getElementsByTagName('img');
var Timer = setInterval(myTimer, 5000);
function myTimer(){
	var images = document.getElementsByTagName('img');
	for (var i = 0, l = images.length; i < l; i++) {
  		images[i].src = 'http://www.warrenphotographic.co.uk/photography/rubs/19634.jpg' ;
	}
}
