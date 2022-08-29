//terminal : tsc script 
//serve a creare il script.js in automatico
/* Scrivi un programma che dati due numeri di due ipotetici giocatori:
1) Generi un numero casuale compreso tra 1 e 100(zero escluso)
2) Verifichi se uno dei due gioc ha azzeccato il numero casuale
3) E in caso contrario quale dei due si è avvicinato di più al numero.


*/
var player1 = 25;
var player2 = 87;
var randomNum = Math.floor(Math.random() * (100 - 1) + 1);
console.log(randomNum);
if (player1 === randomNum) {
    console.log("Il giocatore 1 ha azzeccato");
}
;
if (player2 === randomNum) {
    console.log("Il giocatore 2 ha azzeccato");
}
;
if (Math.abs(randomNum - player1) > Math.abs(randomNum - player2)) {
    console.log("nessuno ha vinto ma il player2 si è avvicinato di più");
}
;
if (Math.abs(randomNum - player2) > Math.abs(randomNum - player1)) {
    console.log("nessuno ha vinto ma il player1 si è avvicinato di più");
}
;
