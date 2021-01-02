/**
 * 
 */

var el = document.getElementById("erase");

el.addEventListener("click", function(){
	document.getElementById("title").value = '';
	document.getElementById("manager").value = '';
	document.getElementById("radio1").checked = false;
	document.getElementById("radio2").checked = false;
	document.getElementById("radio3").checked = false;
	
	console.log("clicked");
}, false);


/*
var back = document.getElementById("back");

back.addEventListener("click", function(){
	location.href("/main.jsp");
}, false);*/