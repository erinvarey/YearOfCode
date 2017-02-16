var images = document.getElementsByTagName('img');
var Timer = setInterval(myTimer, 5000);
//Can't use background audio in chrome extensions :(
//var myAudio = new Audio();        // create the audio object
//myAudio.src = "cows  cows  cows.mp3"; // assign the audio file to its src
//myAudio.play(); 
var capitalnounlist = "Dog,Puppy,Canine,Doggo,Josh,Nicholas,Allie,Donald,Trump,Republican,Right,Spider,Centipede,Joel,Phillip,Phil,Tadeo,Food";
var lowernounlist = "dog,puppy,canine,doggo,doge,josh,nicholas,nick,allie,donald,trump,republican,right,spider,centipede,Joel,phil,phillip,food"
var catoptions = ['https://www.warrenphotographic.co.uk/photography/rubs/19634.jpg',
'https://s-media-cache-ak0.pinimg.com/originals/0d/94/9b/0d949b3d4c5990223dcfa424aaa0e609.jpg',
'https://cutecatsinhats.com/wp-content/uploads/2016/01/gray-sombrero-cat.jpg',
'https://cutecatsinhats.com/wp-content/uploads/2016/01/sombrero-cat-1.jpg',
'https://cutecatsinhats.com/wp-content/uploads/2016/01/sombrero-cat-e1452401721332.jpg',
'https://s-media-cache-ak0.pinimg.com/originals/72/4e/0a/724e0a45386009d355dd0cccd50b87cb.jpg',
'https://scontent.cdninstagram.com/hphotos-xaf1/t51.2885-15/s320x320/e15/11248908_1867235960169024_720375362_n.jpg',
'https://s-media-cache-ak0.pinimg.com/564x/a6/b2/10/a6b21029d2a7b79727a2cf1cf2b982ba.jpg',
'https://r.fod4.com/c=sq/s=w1000,pd1/o=85/http://a.fod4.com/images/user_photos/1236179/5084aeb818cfaf4f7ab86883f34f2347_square_fullsize.png',
'https://s-media-cache-ak0.pinimg.com/236x/62/bb/4d/62bb4d98b8f0b28110b70beac0450abc.jpg',
'https://creolened.com/wp-content/uploads/2014/02/funny-cat-pictures-022-033-400.jpg',
'https://tonsofcats.com/wp-content/uploads/2013/08/6de8c930ef4808a5bd0e7ce4962b00ad.jpg',
'https://s-media-cache-ak0.pinimg.com/736x/50/3b/61/503b61ddb4623ed5e4ad4ac184d2cb1a.jpg',
'https://s-media-cache-ak0.pinimg.com/736x/12/6d/fb/126dfbe91da2417d44b5b2d60c435c44.jpg',
'https://1.bp.blogspot.com/_mhN4JyQzA9Y/SuYqMN9oQOI/AAAAAAAAB_g/TJLu1o81VXw/s400/Cats+Wearing+Hats+LIFE+3.jpg',
'https://68.media.tumblr.com/tumblr_lmk1xicwOR1qiw8wpo1_500.jpg',
'https://tonsofcats.com/wp-content/uploads/2013/08/b5395fe7d2b60cf67818909986693808.jpg',
'https://img.scoop.it/dsKFMKrSmWJU97HcLQvGpDl72eJkfbmt4t8yenImKBXEejxNn4ZJNZ2ss5Ku7Cxt',
'https://www.threadbombing.com/data/media/19/27883149_d12662ff8b_o.jpg',
'https://images-cdn.9gag.com/photo/a9dnogD_700b.jpg',
'https://i.ytimg.com/vi/gPX3xUsyOAc/hqdefault.jpg',
'https://s-media-cache-ak0.pinimg.com/originals/64/05/70/64057035233af7bc960c89bd440d6291.jpg',
'https://s-media-cache-ak0.pinimg.com/originals/29/21/e1/2921e15516c83637bff59b354c9a0953.jpg',
'https://68.media.tumblr.com/0a7bdbb6c8c5c90e8b74509f26278c93/tumblr_nd4yfaWma01sjxmpeo1_500.jpg',
'https://storage.googleapis.com/imgfave/image_cache/1416892898970435.jpg',
'https://68.media.tumblr.com/tumblr_ma2gu1t5Se1qhv2t7o1_500.jpg',
'https://s-media-cache-ak0.pinimg.com/originals/3c/98/7b/3c987b4a025aade603fdc3352947ee6e.gif',
'https://img.buzzfeed.com/buzzfeed-static/static/enhanced/webdr01/2013/3/2/16/enhanced-buzz-8526-1362260533-1.jpg',
'https://media.tumblr.com/tumblr_maus7qUemY1qcvet1.jpg',
'https://s-media-cache-ak0.pinimg.com/originals/cb/08/aa/cb08aad62999833c3bed8ef5e5e10d03.png',
'https://24.media.tumblr.com/c3762c906d58964fc8774e975744dcd9/tumblr_my1az0m3kd1shf8zxo1_400.gif',
'https://i.imgur.com/7aiJjM7.jpg',
'https://68.media.tumblr.com/46a2073766822817b3e07cbb5239b626/tumblr_nbwahtsahy1qh66wqo5_1280.jpg',
'https://i.imgur.com/qU3fgww.jpg',
'https://thoughtcatalog.files.wordpress.com/2014/12/b2ppbhwcyaajujt.jpg',
'https://i.imgur.com/vNy2uKf.jpg',
'https://pp.vk.me/c628126/v628126208/197f7/MAOU1MbzDqs.jpg',
'https://i.imgur.com/vzN2av5.jpg',
'https://68.media.tumblr.com/01657c70073d7d85e3a8854358e04b4c/tumblr_nbwahtsahy1qh66wqo4_1280.jpg',
'https://68.media.tumblr.com/63ba1c82f2d13f10e5fb294d4203e258/tumblr_nyou40vQLL1ul9402o1_500.jpg',
'https://i.imgur.com/2X33xv9.jpg',
'https://68.media.tumblr.com/35f901247dde2fdf27553b5148bdee16/tumblr_nxkhj0Yp5l1ul9402o1_500.jpg',
'https://i.imgur.com/K3jOLGu.jpg',
'https://i.imgur.com/nXvKUfq.jpg',
'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSDfLrjkDZlOy0BIcjKc3Alw9wLoMRTigzIpx298Y757SUkonm2CQ',
'https://68.media.tumblr.com/39a8bd68ccf11333571e5497445f6fda/tumblr_nbwahtsahy1qh66wqo2_500.jpg',
'https://i.imgur.com/E6V2oOb.jpg',
'https://s-media-cache-ak0.pinimg.com/236x/ee/c2/88/eec2883ef4832c2aa80dcd118b721307.jpg',
'https://i.imgur.com/AGkon08.jpg',
'https://media2.giphy.com/media/lFpvlU0or3SHC/200_s.gif',
'https://s-media-cache-ak0.pinimg.com/236x/f8/93/b2/f893b23eaffac078d529989aad2c714c.jpg',
'https://s-media-cache-ak0.pinimg.com/originals/4c/4a/c3/4c4ac35c2e0f83da252ce697d7ac539c.jpg',
'https://s-media-cache-ak0.pinimg.com/236x/0b/71/39/0b7139a743ec652fc7a3da3fa9f38a36.jpg',
'https://i.imgur.com/eIUg2uN.jpg',
'https://s-media-cache-ak0.pinimg.com/236x/e0/1d/91/e01d9181b6b1de5d035538c175e7c2be.jpg',
'https://68.media.tumblr.com/30fc42bb8de9ff38a5800740d8ea0878/tumblr_ny8b8bkmvJ1ul9402o1_500.jpg',
'https://img1.rnkr-static.com/user_node_img/50048/1000949276/870/1-photo-u1.jpg',
'https://i.imgur.com/Jvh1OQmb.jpg',
'https://i.imgur.com/JOKsNeTb.jpg'];

function myTimer(bool){
//	while(bool){
		var images = document.getElementsByTagName('img');
		for (var i = 0, l = images.length; i < l; i++) {
  			images[i].src =  GetMeCatOptions();
		}
		replace(nounlist,"cat");
	}
//}
//gives a random cat from the array
function GetMeCatOptions(){
	var index= (Math.floor((Math.random()*(catoptions.length))+1));
	return catoptions[index];
}
function replace(block_text, replace_text){
	//var block_text = nounlist;
	//var replace_text = "cat";
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
replace("capitalnounlist","Cat");
replace("lowernounlist","cat");
