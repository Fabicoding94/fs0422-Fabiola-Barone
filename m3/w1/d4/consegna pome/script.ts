
class AEBG {
    id:number
    codprod:number
     collezione:string
      capo:string
       modello:number
        quantita:number
         colore:string
          prezzoivaesclusa:number
           prezzoivainclusa:number
            disponibile:string
             saldo:number

constructor(id:number, codprod:number, collezione:string, capo:string, modello:number, quantita:number, colore:string, prezzoivaesclusa:number, prezzoivainclusa:number, disponibile:string, saldo:number){
    this.id=id;
    this.codprod = codprod;
    this.collezione = collezione;
    this.capo = capo;
    this.modello = modello;
    this.quantita = quantita;
    this.colore = colore;
    this.prezzoivaesclusa = prezzoivaesclusa;
    this.prezzoivainclusa = prezzoivainclusa;
    this.disponibile = disponibile;
    this.saldo = saldo;
}

getSaldoCapo():number{
   return this.prezzoivainclusa * this.saldo /100
    
}

getAcquistoCapo():number{
    return this.prezzoivainclusa - this.getSaldoCapo();

}


}


fetch("Abbigliamento.json")
.then(res => res.json())
.then(vestiti=>{

    console.log(vestiti);

    vestiti.forEach( (x:AEBG) => {

        let capoAbbigliamento = new AEBG (x.id, x.codprod, x.collezione, x.capo, x.modello, x.quantita, x.colore, x.prezzoivaesclusa, x.prezzoivainclusa, x.disponibile, x.saldo) 

        console.log(capoAbbigliamento)
        console.log(capoAbbigliamento.getSaldoCapo())
        console.log(capoAbbigliamento.getAcquistoCapo())
    } 
        
    )

    
})