let lista:number[] = [1,2,3,8]

let [n1,n2,n3,n4] = lista

console.log(n4)//8

let [num1,,,num4] = lista
let [nm1,...n] = lista

//destrutturazione oggetti
let res = {
    gusto:"Margherita",
    tipo:"Napoletana",
    prezzo:"5"
}

let {gusto, tipo, prezzo} = res;