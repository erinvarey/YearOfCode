//$(document).ready(function() {
  $.simpleWeather({
    location: 'Austin, TX',
    woeid: '',
    unit: 'f',
    success: function(weather) {
      html = '<h2><i class="icon-'+weather.code+'"></i> '+weather.temp+'&deg;'+weather.units.temp+'</h2>';
      html += '<ul><li>'+weather.city+', '+weather.region+'</li>';
      html += '<li class="currently">'+weather.currently+'</li>';
      html += '<li>'+weather.wind.direction+' '+weather.wind.speed+' '+weather.units.speed+'</li></ul>';
  
      $("#weather").html(html);
    },
    error: function(error) {
      $("#weather").html('<p>'+error+'</p>');
    }
  });
//});

//
//I want this to let me know what weather will actually feel like based on the number
//below 0 will need winter coat
//below -15 will need extra layers and coat
//between 0-5 jacket still
//5-10 light jacket
//10-15 sweater
//anything above your good
//
//Also want it to account for rain and windchill if possible
//