abstract class Tasse{
    codredd:number;
    redditoAnnuoLordo:number;
    constructor(codredd:number,redditoAnnuoLordo:number){
        this.codredd = codredd;
        this.redditoAnnuoLordo =redditoAnnuoLordo;
       
    }

    getTasseInps():number{

        let impostaInps:number = (this.redditoAnnuoLordo /100*33)
        let InpsPagata = this.redditoAnnuoLordo - impostaInps
        return InpsPagata;

    }

    getTasseIrpef():number|undefined{

        if (this.redditoAnnuoLordo <= 15000) {   
            let IrpefPagata1 = this.redditoAnnuoLordo/100*23;
            let IrpefPagata = IrpefPagata1
            return IrpefPagata;
        }
    
       else if (this.redditoAnnuoLordo >15000 && this.redditoAnnuoLordo <= 28000){
            let IrpefPagata1 = this.redditoAnnuoLordo/100*23;
            let IrpefPagata2 = IrpefPagata1 + ((this.redditoAnnuoLordo - 15000)/100*25);
            let IrpefPagata = IrpefPagata2
            return IrpefPagata;
        }
    

       else if (this.redditoAnnuoLordo >28000 && this.redditoAnnuoLordo <= 50000){
            let IrpefPagata1 = this.redditoAnnuoLordo/100*23;
            let IrpefPagata2 = IrpefPagata1 + ((this.redditoAnnuoLordo - 15000)/100*25);
            let IrpefPagata3 = IrpefPagata2 + ((this.redditoAnnuoLordo - 28000)/100*35); 
            let IrpefPagata = IrpefPagata3
            return IrpefPagata;
        }

        else if (this.redditoAnnuoLordo >50000){
            let IrpefPagata1 = this.redditoAnnuoLordo/100*23;
            let IrpefPagata2 = IrpefPagata1 + ((this.redditoAnnuoLordo - 15000)/100*25);
            let IrpefPagata3 = IrpefPagata2 + ((this.redditoAnnuoLordo - 28000)/100*35); 
            let IrpefPagata4 = IrpefPagata3 + ((this.redditoAnnuoLordo -50000)/100*43);
            let IrpefPagata = IrpefPagata4
            return IrpefPagata;
        }
    }

}

class Lavoratore extends Tasse {
     nome:string;
     cognome:string;
     professione:string;
        constructor(nome:string, cognome:string, professione:string, codredd:number,redditoAnnuoLordo:number){
        super(codredd,redditoAnnuoLordo)
        this.nome = nome;
        this.cognome = cognome;
        this.professione = professione;
    }

getUtileTasse():number{
    
    let tasseInps:number = this.getTasseInps();

    let tasseIrpef:number|undefined = this.getTasseIrpef();

    return tasseInps + tasseIrpef!;

}

getRedditoAnnuoNetto():number{

    
    return this.redditoAnnuoLordo - this.getUtileTasse();
}

}


let Mario = new Lavoratore ('Mario', 'Rossi', 'consulente', 1234, 10000);
console.log(Mario.getRedditoAnnuoNetto());



