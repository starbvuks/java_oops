var button = document.getElementById("buttonpress");
var goback = document.getElementById("goback");
var magic = document.getElementById("magic");
var pic = document.getElementById("pic");
var input = document.getElementById("name");

button.addEventListener("click", function onClick(event) {
  document.body.style.backgroundColor = "salmon";
});

goback.addEventListener("click", function onClick(event) {
  document.body.style.backgroundColor = "white";
});

magic.addEventListener("click", function onClick(event) {
  pic.style.opacity = 0;
});

input.addEventListener("input", getInputValue);
function getInputValue() {
  var inputVal = input.value;
  document.getElementById("thetext").innerHTML = inputVal;
}
