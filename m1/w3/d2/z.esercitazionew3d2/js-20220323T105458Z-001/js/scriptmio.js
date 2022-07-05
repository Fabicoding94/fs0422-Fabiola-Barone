var nome = 'Fabiola';
var anni = 27;
var luogo = 'Palermo';

//Esempio di concatenazione:

document.write(nome + anni + luogo);
document.write( nome + ' ' + anni + ' ' + luogo); //lo spazio tra le virgolete serve a dare spazio tra le parole. Questa concatenazione compare come testo del sito (come se fosse il testo di html)

console.log(nome + ' ' + anni + ' ' + luogo)//questa concatenazione compare in Console.

window.alert(nome) //all'apertura della pagina, comparirà sulla finestra un popup con il contenuto di questa variabile. Anche ad ogni refresh della pagina compare.



//1 e 2. Uso di VAR, LET, CONST


// VAR, LET e CONST: "let" e "const" sono utili quando vogliamo creare un Block Scope, cioè un blocco che ci isola quelle variabili dal resto del contesto e ci permette di lavorarci solo lì dentro, all'esterno di essco non sono riconosciute. Sia "let" che "const" nono sono riassegnabili all'interno del Block Scope.

var nome = 'Elisa';


let nome2 = 'Laura';



{
    let name = 'Lucia';
    let nome1= 'Gilda';

    console.log(name)

    const anno = 2022;
    const anno1 = 2023;

    console.log(anno)
   
    var anno2 = 2023;   //solo var può essere riassegnato allinterno del Block Scope//
    var anno2 = 2024;

}

console.log(anno2)
//I let e const interni al Block Scope non possono essere manipolati all'esterno di questo; solo Var può esserlo.//



//3. Assegno diversi tipi di dati alle variabili

//Esistono dati di tipo: 'stringa', numerico, booleano(tru o false), null 

var stringa0 = 'Sto facendo l\'esercizio su Js'
console.log(stringa0)

/* il simbolo "\" prima dell'apostrofo serve a distinguere il contenuto della stringa dagli apostrofi che lo delimitano. */

var stringa1 = 'sto studiando js'
document.write(' ' +stringa1)

var numerodecimale = 23.5

var valorebooleano = 'true'



/*
USO di IF, ELSE nel PROMP
*/


{
    
    let oredisonno = prompt('Quante ore al giorno dormi?');
console.log(oredisonno);




   {
    if(oredisonno >= 6 && oredisonno <= 8.5 ){
        document.write('dormi abbastanza')}
        else if(oredisonno > 8.5){
            document.write('sei un ghiro')
        }
        else if(oredisonno < 6){
            document.write('Potresti dormire di più')
            
        }
   } 


}

//

/* 4. OPERAZIONI MATEMATICHE  */

var x = 20
var y = 31
var z = 12

console.log( x + y + z)
document.write( x + y + z)















