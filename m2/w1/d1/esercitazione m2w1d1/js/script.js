/*

var dataAttuale = new Date(); 
document.write(dataAttuale)

var soloData = new Date ( 2022, 7, 18);
document.write(soloData)  */


//Inizio parte comune

let contenitore = document.querySelector('#container')

let div1 = document.createElement("div")
let div2 = document.createElement("div")
let div3 = document.createElement("div")
let div4 = document.createElement("div")
let div5 = document.createElement("div")
let div6 = document.createElement("div")



let dataOggi = new Date();

//Richiamare la data attuale
div1.innerText = 'Oggi è il giorno: ' + dataOggi;
contenitore.appendChild(div1);

//Mostrare elementi singoli della data
div2.innerText = 'Giorno : ' + dataOggi.getDay() + ', Mese : ' + dataOggi.getMonth() + ', Anno : ' + dataOggi.getFullYear();
contenitore.appendChild(div2);

/* .getDay() attribuisce un numero da 0 a 6 al giorno (0 alla Domenica, 1 Lunedì,.. , 6 al Sabato)
   .getMonth() attribuisce un numero da 0 a 11 ai mesi (0 è Gennaio, 11 Dicembre)
*/

//Creare un sistema per la formattazionein formato europeo
div3.innerText = dataOggi.toLocaleDateString('it-IT')
contenitore.appendChild(div3);

//Scrivere l'ora completa (ore:minuti:sec)
div4.innerText = dataOggi.toLocaleTimeString('it-IT')
contenitore.appendChild(div4);


const options = {
    year: 'numeric',
    month: 'short',
    day:'numeric',
    weekday: 'long',
};

//scrivere la data usando i dati contenuti nella const options
div5.innerText = dataOggi.toLocaleDateString('it-IT', options)
contenitore.appendChild(div5);

div6.innerText = dataOggi.toLocaleTimeString('it-IT', options)
contenitore.appendChild(div6);









