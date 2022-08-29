// alert('Ciao Mondo'); 
var a = 5;
var b = '5';
/* Alt + shift + a = parte il commento su più righe */
var ternario = a < 2 ? true : false;
var bool = true;
if (!bool) {
    console.log('ciao');
}
//Operatore && and
console.log(bool && a < 2);
console.log(bool && a > 2);
console.log(bool && !(a > 2));
//Operatore || or
console.log(bool || a < 2);
console.log(bool || a > 2);
console.log(bool || !(a > 2));
var c = b || [];
var arr = ['ciao']; //Array of strings
var arrMisto; //si usa per debbuggare, quando non so che tipo è
