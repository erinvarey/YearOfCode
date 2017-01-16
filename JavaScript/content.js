//reloads source code every 5 seconds to dynamically load
var images = document.getElementsByTagName('img');
var Timer = setInterval(myTimer, 5000);
var catoptions = ['http://www.warrenphotographic.co.uk/photography/rubs/19634.jpg',
'https://s-media-cache-ak0.pinimg.com/originals/0d/94/9b/0d949b3d4c5990223dcfa424aaa0e609.jpg',
'http://www.somuchviral.com/wp-content/uploads/2014/03/sombrero-wearing-cat.jpg',
'http://cutecatsinhats.com/wp-content/uploads/2016/01/gray-sombrero-cat.jpg',
'http://cutecatsinhats.com/wp-content/uploads/2016/01/sombrero-cat-1.jpg',
'http://0.media.collegehumor.cvcdn.com/63/17/f24128c4736ded0d44089144dc4076d8-white-cat-wearing-sombrero.jpg',
'http://cutecatsinhats.com/wp-content/uploads/2016/01/sombrero-cat-e1452401721332.jpg',
'https://s-media-cache-ak0.pinimg.com/originals/72/4e/0a/724e0a45386009d355dd0cccd50b87cb.jpg',
'https://scontent.cdninstagram.com/hphotos-xaf1/t51.2885-15/s320x320/e15/11248908_1867235960169024_720375362_n.jpg',
'https://s-media-cache-ak0.pinimg.com/564x/a6/b2/10/a6b21029d2a7b79727a2cf1cf2b982ba.jpg',
'http://cdn77.sadanduseless.com/wp-content/uploads/2014/04/cat-hat1.jpg',
'http://r.fod4.com/c=sq/s=w1000,pd1/o=85/http://a.fod4.com/images/user_photos/1236179/5084aeb818cfaf4f7ab86883f34f2347_square_fullsize.png',
'http://kittentoob.com/wp-content/uploads/sites/4/2015/08/73.jpg',
'https://s-media-cache-ak0.pinimg.com/236x/62/bb/4d/62bb4d98b8f0b28110b70beac0450abc.jpg',
'http://creolened.com/wp-content/uploads/2014/02/funny-cat-pictures-022-033-400.jpg'
'http://tonsofcats.com/wp-content/uploads/2013/08/6de8c930ef4808a5bd0e7ce4962b00ad.jpg',
'http://kittentoob.com/wp-content/uploads/sites/4/2013/05/cat_wearing_hat_1.jpg',
'https://s-media-cache-ak0.pinimg.com/736x/50/3b/61/503b61ddb4623ed5e4ad4ac184d2cb1a.jpg',
'https://s-media-cache-ak0.pinimg.com/736x/12/6d/fb/126dfbe91da2417d44b5b2d60c435c44.jpg',
'http://kittentoob.com/wp-content/uploads/sites/4/2013/05/Cats_in_hats_1.jpg',
'http://1.bp.blogspot.com/_mhN4JyQzA9Y/SuYqMN9oQOI/AAAAAAAAB_g/TJLu1o81VXw/s400/Cats+Wearing+Hats+LIFE+3.jpg',
'http://cdn77.sadanduseless.com/wp-content/uploads/2016/11/hairy9.jpg',
'http://68.media.tumblr.com/tumblr_lmk1xicwOR1qiw8wpo1_500.jpg',
'http://tonsofcats.com/wp-content/uploads/2013/08/b5395fe7d2b60cf67818909986693808.jpg',
'http://img.scoop.it/dsKFMKrSmWJU97HcLQvGpDl72eJkfbmt4t8yenImKBXEejxNn4ZJNZ2ss5Ku7Cxt'];


function myTimer(){
	var images = document.getElementsByTagName('img');
	for (var i = 0, l = images.length; i < l; i++) {
  		images[i].src = 'http://www.warrenphotographic.co.uk/photography/rubs/19634.jpg' ;
	}
}
