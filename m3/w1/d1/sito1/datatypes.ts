let string:string = 'Mario';
let numero:number = 0;
let booleano:boolean = false;
let oggetto:object = {
    nome:'Mario',
    cognome:'Rossi'
}
let array:any[] = [];
let union:(string|number|boolean) = true;

let any:any = {
    nome:'Mario',
    cognome:'Rossi'
}

console.log(any.nome);

let vuoto: string| undefined


let sconosciuto:unknown = {
    nome:'Mario',
    cognome:'Rossi'
}

console.log(sconosciuto.nome);

function saluta():void{ //funzione che non restituisce nulla
    console.log('ciao');
 
}


function saluta2():string{ //funzione che restituisce stringa
    return 'ciao';
 
}

function saluta3(saluto:string):string{ //devee restituire stringa
    return saluto;
 
}

function saluta4( saluto:string|null = null):string|null{ //funzione che restituisce stringa
    return 'ciao';
 
}


/*    ------Tipizzazione oggetti ------*/


let oggetto2:{nome:string, cognome:string} = {
    nome:'Mario',
    cognome: 'Rossi',

}

console.log(oggetto2.nome)

class User{
    nome:string;
    cognome:string;
}

let oggetto3:User = {
    nome:'Mario',
    cognome:'Rossi'
}

let utenti:User[] = [oggetto2, oggetto3]


/* date 
*/

let oggi:Date = new Date()