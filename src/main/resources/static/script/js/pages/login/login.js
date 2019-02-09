window.onload = function() {
	const numbers = document.querySelectorAll('.number');
	const inputpas = document.getElementById("pas");
	
	numbers.forEach(number => {
		number.addEventListener("mouseenter", function(){
			if(number.classList.contains("stil")) {
				number.style.background="linear-gradient(60deg, #8F6200 0%, #FFFFFF 100%)";
				const from = document.getElementById("pas").value;
				inputpas.value = from + number.dataset.char;
				number.classList.remove("stil");
				console.log(inputpas.value);
			}
			
		});
	});

	const reset = document.querySelector('.reset');

	reset.addEventListener("click", function(){
		numbers.forEach(number => {
			number.classList.add("stil");
			number.style.background="linear-gradient(60deg, #709dff 0%, #91fdb7 100%)";
		})
		inputpas.value = "";
		console.log(inputpas.value);
	});
}