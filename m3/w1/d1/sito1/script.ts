// alert('Ciao Mondo'); 

var a: number = 5;
var b: string = '5';

/* Alt + shift + a = parte il commento su più righe */

var ternario:boolean = a < 2 ? true : false;

let bool:boolean = true

if(!bool){
    console.log('ciao')
}


//Operatore && and
console.log(bool && a < 2)
console.log(bool && a > 2)
console.log(bool && !(a > 2))

//Operatore || or
console.log(bool || a < 2)
console.log(bool || a > 2)
console.log(bool || !(a > 2))



let c:string|[] = b || [];

let arr:string[] = ['ciao']; //Array of strings

let arrMisto:any[]  //si usa per debbuggare, quando non so che tipo è

