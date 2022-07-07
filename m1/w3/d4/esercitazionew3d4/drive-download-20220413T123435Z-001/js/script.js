
/*Metodi delle stringhe: maiuscolo e minuscolo*/

var titolo = 'Esercizio d4 sul Corso Javascript'
console.log(titolo)

var maiuscolo = titolo.toUpperCase();
console.log(maiuscolo)

var minuscolo = titolo.toLowerCase();
console.log(minuscolo)

/*Suddivisione stringa nei suoi elementi, selezione di due e concatenazione in una stringa*/

var elementistringa = titolo.split(' ') //se metti("")divide in lettere, se metti (' ')divide in parole, se metti() divide in frasi
console.log(elementistringa)

var elementiconc = (elementistringa[0])+(elementistringa[4])
console.log(elementiconc)


//Array di persone, poi mostro l'elemento 3 dell'arrey (ricorda che la num parte da 0)

var persone = ["Lucia", "Giulia", "Giovanni" ,"Manuel" ]
console.log(persone[2])

var personaN3 = persone[2]
console.log(personaN3)

//Aggiungo all'array un valore tramite variabile, poi mostro la lunghezza dell'array

var personadaagg = "Dinora"
persone.push(personadaagg)
console.log(persone)
console.log(persone.length)



//Crea una funzione all'interno della quale utilizzare i valori numerici di un array

function differenza(){

    let numbers = [23, 45, 67, 92]
    return numbers[2] - numbers[0] - numbers[1]
}

console.log(differenza())

//Usa push/pop e shift/unshift

let ortaggi = ["pomodori", "zucchine", "melanzane", "lattuga", "broccoli"]

ortaggi.push("cavolo")
console.log(ortaggi)

ortaggi.pop()     //elimina ultimo elemento
console.log(ortaggi)

ortaggi.shift()  //elimina il primo elemento
console.log(ortaggi)

ortaggi.unshift("carote")
console.log(ortaggi)






