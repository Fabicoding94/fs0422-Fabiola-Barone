document.write('Hello World!');   //stai comandando di andare nel documento e scrivere questa stringa compresa tra gli apostrofi//
document.write('Hello World!');

document.getElementById('test').innerHTML = 'Ciao';  //nel documento, prendi l'elemento con id 'test', dentro html e gli metti 'ciao'//
document.getElementById('test').style.backgroundColor = 'red';


//console.log('%c ciao','color: red')
console.log('posso scrivere quello che voglio');  //scrivo nella console: se scrivo una stringa tra virgolette o apostrofi compare scritta letterale completa//
console.log(3 + 4);  //se invece scrivo un operazione matematica senza le virgolette, la console svolge l'operazione e mi fornisce il risultato//

console.log('3 + 4') //ecco, in questo caso non svolgel'operazione//


//commento ad un sola riga
/*
Commento su
più righe
*/

/**
 * Variabili
 */

var nomeVariabile = 'ciao';


var a = 4;
var b = 5;

console.log(a, b);
console.log(a + b);

console.log(c);
var c = 5;
console.log(c);

a = 1;
console.log(a);


/**
 * tipi di dato
 * 
    number
    string
    boolean
    array
    object
 */

var x = 5;//variabile numerica
var y = '5';//variabile stringa
console.log(y + y);
console.log(x + x);

var nome = 'Mario';
var nome2 = nome;//mario
var saluto = 'Ciao';

console.log(saluto + ' ' + nome + ', sono già le ' + y);

var b = true;//variabile booleana

var h = [1,2,3,4,40,'ciao']; //variabile array
console.log( h[5] )

var o = {//variabile oggetto
    nome: "edoardo",
    eta: 27,
    sposato: false
}

console.log( o.nome, o.sposato )
console.table(o)
console.log(o)


/*
conversioni e operazioni
operatori
* = moltiplicazione
+ = somma
/ = divisione
- = sottrazione
*/
a = 2;
b = 2;

console.log(a / b)

c = '2';
d = b + c;//string

console.log(d)//la variabile numerica ha subito una conversione in string

console.log(b * c)//conversione di c in numero

e = '2a';
console.log(a * e);//Not a Number(NaN) 

//casting

console.log(typeof(a), typeof c)

console.log(typeof String(a) )//conversione in stringa usando String()

/*
funzioni
*/


function saluta(){//la funzione è stata definita, ma non verrà eseguita se non sarà invocata in maniera diretta
    console.log('Ciao!');
}

saluta();
saluta();
saluta();