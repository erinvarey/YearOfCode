date = new Date();
day_numeric = date.getDay();
hours = date.getHours();
minutes = date.getMinutes();
seconds = date.getSeconds();

var dayofweek=["","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"];

if(hours>=12){
var realhours = hours-12;
var pm = "PM";
}

if(hours<=12){
var pm = "AM";
}
function datetime(){
var showdatetime = document.getElementById('showdatetime');
document.getElementById('showdatetime').innerHTML="Today is "+dayofweek[day_numeric]+" and Time is "+realhours+" : "+minutes+" : "+seconds+" "+pm;
}