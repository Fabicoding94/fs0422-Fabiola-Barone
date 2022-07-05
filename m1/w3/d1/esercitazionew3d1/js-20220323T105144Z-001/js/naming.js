//var 1 pet_preferito = 'gatto';
//console.log(1 pet_preferito);

/*var pet = 'gatto';
var Pet = 'cane';*/



var primopet = document.getElementById('criceto')
console.log(primopet) //nella console compare la riga html a cui è collegata la variabile "primopet"
console.log(primopet, primopet) //nella console compare per 2 volte l'intera riga html
console.log(primopet.id)// nella console compare il valore id che ha nell'html l'elemento cui ho associato la variabile "primopet"
console.log(primopet.innerHTML) //nella console compare il contenuto html dell'elemento cui ho associato la var primopet.

primopet.style.color = 'blue'
primopet.style.backgroundColor = 'grey'

var conigliettopink = document.getElementById('coniglio')
console.log(conigliettopink.innerHTML)
conigliettopink.style.backgroundColor = 'pink'


var animaligialli = document.getElementsByClassName('animali-gialli')
console.log(animaligialli)

animaligialli[0].style.backgroundColor = 'yellow'
animaligialli[1].style.backgroundColor = 'yellow'



var div = document.getElementsByTagName('div');
console.log(div)
div[0].style.backgroundColor = 'purple'
div[0].style.color = 'white'




//Numbers

var number1 = document.getElementById('magicnumber1')
console.log(number1.innerHTML)

var number2 = document.getElementById('magicnumber2')
var number3 = document.getElementById('magicnumber3')
var number4 = document.getElementById('magicnumber4')
var number5 = document.getElementById('magicnumber5')




//function saluta(){
 //   alert('ciao');
 //   bloccoRosso.style.backgroundColor = 'red'


 var a = 13458
 var b = 23456

 console.log(a + b)
 console.log(a * b)
 console.log( (a+b)*(b*b)+(a+a))

 


