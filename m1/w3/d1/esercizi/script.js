var bloccoRosso = document.getElementById('blocco-rosso') //HTML element, ricevo un solo elemento
console.log(bloccoRosso)
console.log(bloccoRosso.id)

console.log(bloccoRosso.innerHTML)//innerHTML è una prpr degli oggetti HTML, che comprende il contenuto dell'elemento preso in causa
bloccoRosso.style.backgroundColor = 'red'



// creo la variabile "bloccorosso"

var div = document.getElementByTagName('div')
console.log(div)
console.log(div[1].innerHTML)

div[1].style.backgroundColor = 'blue'
div[2].style.backgroundColor = 'blue'
div[3].style.backgroundColor = 'blue'

var blocchiGialli = document.getElementsByClassName('blocchi-gialli')
//array

var primoBlocco = document.getElementsByClassName('blocchi-gialli')[0]//1 solo elemento

primoBlocco.style.backgroundColor = 'yellow';
blocchiGialli[1].style.backgroundColor = 'yellow';
blocchiGialli[2].style.backgroundColor = 'yellow';

var bloccoRossoNew = document.querySelector('#blocco-rosso')

var primoBloccoNew = document.querySelector('.blocchi-gialli')

var blocchiGialliNew = document.querySelectorAll('.blocchi-gialli')

var tutto = document.querySelectorAll ('#blocco-rosso', '.blocchi')