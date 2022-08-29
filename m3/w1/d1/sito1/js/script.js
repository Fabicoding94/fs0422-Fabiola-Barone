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
var string = 'Mario';
var numero = 0;
var booleano = false;
var oggetto = {
    nome: 'Mario',
    cognome: 'Rossi'
};
var array = [];
var union = true;
var any = {
    nome: 'Mario',
    cognome: 'Rossi'
};
console.log(any.nome);
var vuoto;
var sconosciuto = {
    nome: 'Mario',
    cognome: 'Rossi'
};
console.log(sconosciuto.nome);
function saluta() {
    console.log('ciao');
}
function saluta2() {
    return 'ciao';
}
function saluta3(saluto) {
    return saluto;
}
function saluta4(saluto) {
    if (saluto === void 0) { saluto = null; }
    return 'ciao';
}
/*    ------Tipizzazione oggetti ------*/
var oggetto2 = {
    nome: 'Mario',
    cognome: 'Rossi'
};
console.log(oggetto2.nome);
var User = /** @class */ (function () {
    function User() {
    }
    return User;
}());
var oggetto3 = {
    nome: 'Mario',
    cognome: 'Rossi'
};
var utenti = [oggetto2, oggetto3];
/* date
*/
var oggi = new Date();
