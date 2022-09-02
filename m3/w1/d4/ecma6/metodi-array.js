var prodotti = [
    {
        tipo: 'Maglietta',
        prezzo: 35,
        varianti: [
            {
                taglia: 'xs',
                colore: 'Giallo',
                q: 0,
                disponibile: true
            },
            {
                taglia: 'xs',
                colore: 'Rosso',
                q: 0,
                disponibile: true
            },
            {
                taglia: 'm',
                colore: 'Giallo fosforescente',
                q: 100,
                disponibile: true
            }
        ]
    },
    {
        tipo: 'Cannottiera',
        prezzo: 25,
        varianti: [
            {
                taglia: 'xs',
                colore: 'Giallo',
                q: 15,
                disponibile: true
            },
            {
                taglia: 'm',
                colore: 'Giallo fosforescente',
                q: 100,
                disponibile: true
            }
        ]
    }
];
var taglie = prodotti.map(function (p) { return p.varianti; }); //ottengo gli array delle varianti
console.log(taglie);
var prodottiModificati = prodotti.map(function (p) {
    p.varianti = p.varianti.map(function (v) {
        if (v.q == 0) {
            v.disponibile = false;
        }
        return v;
    });
    return p;
});
console.log(prodottiModificati);
var taglieDisponibili = prodottiModificati[0].varianti.filter(function (v) { return v.disponibile; }); //ottengo tutte le varianti disponibili del primo prodotto
var jeans = prodottiModificati.find(function (p) { return p.tipo == 'Jeans'; }); //non troverà alcun jeans quindi è undefined
