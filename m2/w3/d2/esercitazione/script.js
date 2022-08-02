class Person {
    constructor(nome, cognome, eta) 
    {
       this.nome = nome;
       this.cognome = cognome;
       this.eta = eta;
   }
   
   
   
   confrontaEtaUtenti ( a,b){
   
       if (this.eta > a.eta & this.eta > b.eta){
           console.log ("il più vecchio è : " + this.nome)}
             
             else if(a.eta > this.eta & a.eta > b.eta){ 
                     console.log ("il più vecchio è : " + a.nome)
             }else if 
         
             (b.eta > this.eta & b.eta > a.eta) {
             console.log ("il più vecchio è : " + b.nome)}
                   
       
   }
   
   }
   
   
   
   let p1 = new Person('Giulia', 'Chittaro', 30)
   
   let p2 = new Person('Mario', 'Rossi', 32)
   
   let p3 = new Person('Juan', 'Caracas', 23)
   
   
   
   p1.confrontaEtaUtenti( p2, p3);
   
           
   
   
   
   
   
       // class Paginazione {
   
       //     constructor(items, pageSize)
       //     {
       //         this.items = [];
       //     }
   
       // }