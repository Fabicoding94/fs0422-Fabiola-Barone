var FirstUser = /** @class */ (function () {
    function FirstUser(carica, numeroChiamate, costoChiamataAlMinuto, unaRicarica, minutiDurata) {
        this.carica = carica;
        this.numeroChiamate = numeroChiamate;
        this.costoChiamataAlMinuto = costoChiamataAlMinuto;
        this.unaRicarica = unaRicarica;
        this.minutiDurata = minutiDurata;
    }
    FirstUser.prototype.ricarica = function (unaRicarica) {
        this.carica += unaRicarica;
        console.log("Ricarica avvenuta con successo! Credito residuo: ".concat(this.carica));
    };
    FirstUser.prototype.chiamata = function (minutiDurata) {
        /* let durataChiamata: number = minutiDurata
        let costo: number = durataChiamata*this.costoChiamataAlMinuto */
        var costoChiamata = minutiDurata * this.costoChiamataAlMinuto;
        if (this.carica >= costoChiamata) {
            this.carica -= costoChiamata;
            this.numeroChiamate++;
            console.log("Il costo della chiamata \u00E8 ".concat(costoChiamata, ". Credito residuo: ").concat(this.carica, "."));
        }
        else {
            console.log("Il tuo credito \u00E8 insufficiente! Costo chiamata: ".concat(costoChiamata, ". Credito residuo: ").concat(this.carica));
        }
    };
    FirstUser.prototype.numero404 = function () {
        console.log("Credito residuo: ".concat(this.carica));
        return this.carica;
    };
    FirstUser.prototype.getNumeroChiamate = function () {
        console.log("Hai effettuato ".concat(this.numeroChiamate, " chiamate"));
        return this.numeroChiamate;
    };
    FirstUser.prototype.azzeraChiamate = function () {
        console.log("Chiamate azzerate!");
        this.numeroChiamate = 0;
    };
    return FirstUser;
}());
var Lucia = new FirstUser(10, 0, 0.20, 5, 23);
Lucia.numero404();
Lucia.ricarica(10);
Lucia.chiamata(15);
Lucia.chiamata(2);
Lucia.ricarica(5);
Lucia.chiamata(105);
Lucia.chiamata(10);
Lucia.ricarica(40);
