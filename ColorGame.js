          var numSquares=6;
var colors=generateRandomColors(numSquares);
var squares=  document.querySelectorAll(".square");
var pickedColor= pickColor();
var colorDisplay = document.getElementById("colorDisplay");
var messageDisplay = document.querySelector("#message");
var h1 = document.querySelector("h1");
var resetButton = document.querySelector("#reset");
var modeButtons = document.querySelectorAll(".mode");

for(var i=0; i<modeButtons.length; i++){
	modeButtons[i].addEventListener("click", function(){
		modeButtons[0].classList.remove("selected");
		modeButtons[1].classList.remove("selected");
		this.classList.add("selected"); 
		// if(this.textContent="Easy"){
		// 	numSquares=3;
		// }
		// else{
		// 	numSquares=6;
		// }
		this.textContent==="Easy" ? numSquares=3: numSquares=6;
		reset();
		// figure out how many squares to show

		// pick new colors
		// pick a new color
		// update page to reflect changes
	});
}

function reset(){
	colors = generateRandomColors(numSquares);
	// pick a new random color from array
	pickedColor = pickColor();
	// change colorDisplay to match picked color
	colorDisplay.textContent = pickedColor;
	// change colors of the squares
	for(var i=0; i<squares.length; i++){
		if(colors[i]){
			// Add initial colors to squares
			squares[i].style.display="block";
			squares[i].style.backgroundColor=colors[i];
		}
		else{
			squares[i].style.display="none";
		}
	}

	h1.style.backgroundColor="steelblue";
	messageDisplay.textContent="";
	resetButton.textContent="New Colors";
}


// easyBtn.addEventListener("click", function(){
// 	numSquares=3;
// 	easyBtn.classList.add("selected");
// 	hardBtn.classList.remove("selected");
// 	colors = generateRandomColors(numSquares);
// 	pickedColor = pickColor();
// 	colorDisplay.textContent=pickedColor;
// 	for (var i=0; i<squares.length; i++){
// 		if(colors[i]){
// 				squares[i].style.backgroundColor = colors[i];
// 		}
// 		else{
// 			squares[i].style.display="none";
// 		}
// 	}
// });

// hardBtn.addEventListener("click", function(){
// 	numSquares=6;
// 	hardBtn.classList.add("selected");
// 	easyBtn.classList.remove("selected");
// 	colors = generateRandomColors(numSquares);
// 	pickedColor = pickColor();
// 	colorDisplay.textContent=pickedColor;
// 	for (var i=0; i<squares.length; i++){
// 		if(colors[i]){
// 				squares[i].style.display="block";
// 				squares[i].style.backgroundColor = colors[i];
// 		}
// 	}
// });

resetButton.addEventListener("click", function(){
	reset();
});

colorDisplay.textContent=pickedColor;

for(var i=0; i<squares.length; i++){
	// Add initial colors to squares
	squares[i].style.backgroundColor=colors[i];

	// Add click listeners to squares
	squares[i].addEventListener("click", function(){
		// Grab color of clicked square
		var clickedColor=this.style.backgroundColor;
		// Compare color to pickedColor
		if(clickedColor===pickedColor){
			messageDisplay.textContent="Correct";
			changeColors(clickedColor);
			h1.style.backgroundColor = this.style.backgroundColor;
			resetButton.textContent="Play Again?";
		}
		else{
			console.log(this.style.backgroundColor);
			console.log(pickedColor);
			this.style.backgroundColor="#232323";
			messageDisplay.textContent="Try Again";	
		}
	});
}

function changeColors(color){
	// loop through all squares 
	// change each color to match given color
	for(var i=0; i<squares.length;i++){
		// change each color to match given color
		squares[i].style.backgroundColor=color;
	}
}

function pickColor() {
	var random = Math.floor(Math.random() * colors.length);
	return colors[random];
}

function generateRandomColors(num){
	// make an array
	var arr=[];
	// add num random colors to array
	for(var i=0;i<num;i++){
		var red=Math.floor(Math.random()*255+1);
		var green=Math.floor(Math.random()*255+1);
		var blue=Math.floor(Math.random()*255+1);
		arr[i]="rgb("+red+", "+green+", "+blue+")";
	}
	// return array
	return arr;
}



