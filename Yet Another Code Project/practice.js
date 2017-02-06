//this works but it crash the page so at least i got something. it only wokrs for an alert
document.addEventListener('DOMContentLoaded', function() {
    var link = document.getElementById("button_submit");
    // onClick's logic below:
    link.addEventListener('click', function() {
        console.log('I WORKED');
    });
});


function replace(block_text, replace_text){
	var block_text = "*";
	var replace_text = "cat";
    var elements = document.getElementsByTagName('*');
    var block_words = block_text;
    var replace_words = replace_text;
    
    //Parse Reg Exp for all replacements
    var block_regstr = "";
                for (var k=0; k < block_words.length-1; k++){
                    block_regstr += block_words[k].trim() + "|";
                }
                block_regstr+= +block_words[block_words.length-1].trim();
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
}
console.log("Tested");
replace("*","cat");