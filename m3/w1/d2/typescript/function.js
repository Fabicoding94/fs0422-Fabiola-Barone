/*

*/
var _a;
function prova() {
    //non posso restituire nulla perchè la funzione restituisce void
}
function stringa() {
    return ''; //va bene anche una stringa vuota, purchè il tipo di dato sia rispettato
}
//dati in entrata
function bold(testo) {
    return "<b>".concat(testo, "</b>"); //Il backtick si fa ALT + 9 + 6
}
function $(selettore) {
    return document.querySelector(selettore);
}
function creaHTMLBold(testo) {
    document.write("<b>".concat(testo, "</b>"));
}
(_a = $('.elemento')) === null || _a === void 0 ? void 0 : _a.style.color; //il simbolo ? in questo caso serve a far si che gli attributi vengano letti solo se la funzione $( neìon restituisce null)
var x = function (selettore) { return document.queryselector(selettore); };
