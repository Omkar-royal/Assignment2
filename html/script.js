let toggleBtn = document.querySelector(".toggleBtn");
let body = document.querySelector("body");



toggleBtn.onclick = function () {
  body.classList.toggle("dark");
};