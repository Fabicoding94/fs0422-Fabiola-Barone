interface ISmartphone {

    carica: number; //soldi disponibili per le chiamate
    numeroChiamate: number; //numero chiamate effettuate
    costoChiamataAlMinuto: number;
    unaRicarica: number;
    minutiDurata: number;

    ricarica(unaRicarica: number): void; //ricarica il tel

    chiamata(minutiDurata: number): void;//effettua una chiamata in minuti

    numero404(): number;

    getNumeroChiamate(): number;

    azzeraChiamate(): void;
}


class FirstUser implements ISmartphone {

    carica: number;
    numeroChiamate: number;
    costoChiamataAlMinuto: number;
    unaRicarica: number;
    minutiDurata: number;


    constructor(carica: number, numeroChiamate: number, costoChiamataAlMinuto: number, unaRicarica: number, minutiDurata: number) {

        this.carica= carica;
        this.numeroChiamate= numeroChiamate ;
        this.costoChiamataAlMinuto= costoChiamataAlMinuto;
        this.unaRicarica= unaRicarica;
        this.minutiDurata= minutiDurata;
    }

    ricarica(unaRicarica: number) : void {
        this.carica += unaRicarica;
        console.log(`Ricarica avvenuta con successo! Credito residuo: ${this.carica}`);
    }

    chiamata(minutiDurata:number ) : void {

        /* let durataChiamata: number = minutiDurata
        let costo: number = durataChiamata*this.costoChiamataAlMinuto */

    

        let costoChiamata:number = minutiDurata*this.costoChiamataAlMinuto;

       


        if(this.carica >= costoChiamata ){
            this.carica -= costoChiamata;
            this.numeroChiamate++;
            console.log(`Il costo della chiamata è ${costoChiamata}. Credito residuo: ${this.carica}.`)

        }else{
            console.log (`Il tuo credito è insufficiente! Costo chiamata: ${costoChiamata}. Credito residuo: ${this.carica}`)
        }


        
    }

    numero404(): number{
        console.log(`Credito residuo: ${this.carica}`)
        return this.carica

    }

    getNumeroChiamate(): number {
        console.log(`Hai effettuato ${this.numeroChiamate} chiamate`);
        return this.numeroChiamate;
    }

    azzeraChiamate(): void {
        console.log(`Chiamate azzerate!`);
        this.numeroChiamate = 0;
    }
}

    let Lucia:FirstUser = new FirstUser(10, 0, 0.20, 5, 23);

Lucia.numero404();
Lucia.ricarica(10);
Lucia.chiamata(15)
Lucia.chiamata(2)
Lucia.ricarica(5)
Lucia.chiamata(105)
Lucia.chiamata(10)
Lucia.ricarica(40)


