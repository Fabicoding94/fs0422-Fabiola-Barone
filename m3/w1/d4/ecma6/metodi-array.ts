let prodotti = [
    {
        tipo:'Maglietta',
        prezzo:35,
        varianti:[
            {
                taglia:'xs',
                colore:'Giallo',
                q:0,
                disponibile:true
            },
            {
                taglia:'xs',
                colore:'Rosso',
                q:0,
                disponibile:true
            },
            {
                taglia:'m',
                colore:'Giallo fosforescente',
                q:100,
                disponibile:true
            }
        ]
    },
    {
        tipo:'Cannottiera',
        prezzo:25,
        varianti:[
            {
                taglia:'xs',
                colore:'Giallo',
                q:15,
                disponibile:true
            },
            {
                taglia:'m',
                colore:'Giallo fosforescente',
                q:100,
                disponibile:true
            }
        ]
    }
]

let taglie = prodotti.map( p => p.varianti)//ottengo gli array delle varianti

console.log(taglie)

let prodottiModificati = prodotti.map(p => {

    p.varianti = p.varianti.map(v =>{
        if(v.q == 0){
            v.disponibile = false;
        }
        return v
    })

    return p
})

console.log(prodottiModificati)


let taglieDisponibili = prodottiModificati[0].varianti.filter(v => v.disponibile)//ottengo tutte le varianti disponibili del primo prodotto


let jeans = prodottiModificati.find(p => p.tipo == 'Jeans')//non troverà alcun jeans quindi è undefined


