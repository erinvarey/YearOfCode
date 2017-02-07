var images = document.getElementsByTagName('img');
var Timer = setInterval(myTimer, 5000);
var myAudio = new Audio();        // create the audio object
myAudio.src = "cows  cows  cows.mp3"; // assign the audio file to its src
myAudio.play(); 
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
'http://creolened.com/wp-content/uploads/2014/02/funny-cat-pictures-022-033-400.jpg',
'http://tonsofcats.com/wp-content/uploads/2013/08/6de8c930ef4808a5bd0e7ce4962b00ad.jpg',
'http://kittentoob.com/wp-content/uploads/sites/4/2013/05/cat_wearing_hat_1.jpg',
'https://s-media-cache-ak0.pinimg.com/736x/50/3b/61/503b61ddb4623ed5e4ad4ac184d2cb1a.jpg',
'https://s-media-cache-ak0.pinimg.com/736x/12/6d/fb/126dfbe91da2417d44b5b2d60c435c44.jpg',
'http://kittentoob.com/wp-content/uploads/sites/4/2013/05/Cats_in_hats_1.jpg',
'http://1.bp.blogspot.com/_mhN4JyQzA9Y/SuYqMN9oQOI/AAAAAAAAB_g/TJLu1o81VXw/s400/Cats+Wearing+Hats+LIFE+3.jpg',
'http://cdn77.sadanduseless.com/wp-content/uploads/2016/11/hairy9.jpg',
'http://68.media.tumblr.com/tumblr_lmk1xicwOR1qiw8wpo1_500.jpg',
'http://tonsofcats.com/wp-content/uploads/2013/08/b5395fe7d2b60cf67818909986693808.jpg',
'http://img.scoop.it/dsKFMKrSmWJU97HcLQvGpDl72eJkfbmt4t8yenImKBXEejxNn4ZJNZ2ss5Ku7Cxt',
'http://www.threadbombing.com/data/media/19/27883149_d12662ff8b_o.jpg',
'http://images-cdn.9gag.com/photo/a9dnogD_700b.jpg',
'https://i.ytimg.com/vi/gPX3xUsyOAc/hqdefault.jpg',
'http://s2.favim.com/orig/33/cats-floating-funny-photography-weird-Favim.com-260366.jpg',
'https://s-media-cache-ak0.pinimg.com/originals/64/05/70/64057035233af7bc960c89bd440d6291.jpg',
'https://s-media-cache-ak0.pinimg.com/originals/29/21/e1/2921e15516c83637bff59b354c9a0953.jpg',
'http://68.media.tumblr.com/0a7bdbb6c8c5c90e8b74509f26278c93/tumblr_nd4yfaWma01sjxmpeo1_500.jpg',
'https://storage.googleapis.com/imgfave/image_cache/1416892898970435.jpg',
'http://68.media.tumblr.com/tumblr_ma2gu1t5Se1qhv2t7o1_500.jpg',
'https://s-media-cache-ak0.pinimg.com/originals/3c/98/7b/3c987b4a025aade603fdc3352947ee6e.gif',
'https://img.buzzfeed.com/buzzfeed-static/static/enhanced/webdr01/2013/3/2/16/enhanced-buzz-8526-1362260533-1.jpg',
'http://media.tumblr.com/tumblr_maus7qUemY1qcvet1.jpg',
'https://s-media-cache-ak0.pinimg.com/originals/cb/08/aa/cb08aad62999833c3bed8ef5e5e10d03.png',
'http://24.media.tumblr.com/c3762c906d58964fc8774e975744dcd9/tumblr_my1az0m3kd1shf8zxo1_400.gif'];
//
//$(document).on('click','#button_submit',function() {
 //   alert("Hello World");
//});   
//
function init(){
    var elem = document.getElementById('button_submit');
    elem.addEventListener('click',func());
}
function func(){
    alert('button clicked');
}

//	$("#myBtn").click(function() {
  //alert( "Handler for .click() called." );
//});
		//if(bool=true){
		//	bool=false;
		//}
		//else{
		//	bool=true;
		//}
//		alert("yes");
//		alert(bool);

//	});
//});

//document.getElementById("myBtn").onclick = (bool=false);

//function myFunction() {
//    alert("I do the thing");
//}
function myTimer(bool){
//	while(bool){
		var images = document.getElementsByTagName('img');
		for (var i = 0, l = images.length; i < l; i++) {
  			images[i].src =  GetMeCatOptions();
		}
		replace(".*","cat");
	}
//}
//gives a random cat from the array
function GetMeCatOptions(){
	var index= (Math.floor((Math.random()*(catoptions.length))+1));
	return catoptions[index];
}
function replace(block_text, replace_text){
	var block_text = ".*";
	var replace_text = "cat";
    var elements = document.getElementsByTagName('*');
    var block_words = block_text.split(",");;
    var replace_words = replace_text.split(",");
    
    //Parse Reg Exp for all replacements
    var block_regstr = "";
                for (var k=0; k < block_words.length-1; k++){
                    block_regstr += "\\b"+block_words[k].trim() + "\\b" + "|";
                }
                block_regstr+= "\\b"+block_words[block_words.length-1].trim()+"\\b";
    console.log(block_regstr);
    //end parse
    
    for (var i = 0; i < elements.length; i++) {
        var element = elements[i];

        for (var j = 0; j < element.childNodes.length; j++) {
            var node = element.childNodes[j];

            if (node.nodeType === 3) {
                var text = node.nodeValue;
                
                var wordchoice = Math.floor(Math.random()*replace_words.length);
                
                var re = new RegExp(block_regstr,"gi");
                var replacedText = text.replace(re, replace_words[wordchoice]);

                if (replacedText !== text) {
                    element.replaceChild(document.createTextNode(replacedText), node);
                }
            }
        }
    }
    console.log("Successfully Replaced");
    console.log(block_words);
}
console.log("Tested");
replace(".*","cat");
