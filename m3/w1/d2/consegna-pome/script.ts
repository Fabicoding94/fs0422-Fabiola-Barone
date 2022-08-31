var deposit:number = 10000;

var addInterest:number = deposit/100*10;

class SonAccount {

    public name: string;
    public surname: string;
    public balanceInit: number;

    constructor(name: string, surname: string, accountBalance: number) {
        this.name = name; 
        this.surname = surname; 
        this.balanceInit = accountBalance;

}

oneDeposit():any {


    let newBalanceInit:number = this.balanceInit + deposit;
    console.log(newBalanceInit);
   
}

oneWhitDraw():any {

    let newBalanceInit:number = this.balanceInit + deposit;
    let whitdraw:number = 5000;
    let SecondBalanceInit:number = newBalanceInit - whitdraw;
    console.log(SecondBalanceInit);
}

}

let son = new SonAccount('Edoardo', 'Trovarelli', 0)

son.oneDeposit();

son.oneWhitDraw();

class MotherAccount extends SonAccount {

   public addInterest: number; 
    constructor(name: string, surname: string, accountBalance: number, addInterest:number ) {
       
super(name, surname, accountBalance)

this.addInterest = addInterest;
}

oneMotherDeposit():any {


    let newMotherBalanceInit:number = this.balanceInit + deposit - this.addInterest ;
    console.log(newMotherBalanceInit);
   
}

oneMotherWhitDraw():any {

    let newBalanceInit:number = this.balanceInit + deposit;
    let whitdraw:number = 5000;
    let SecondMotherBalanceInit:number = newBalanceInit - whitdraw -this.addInterest;
    console.log(SecondMotherBalanceInit);
}

}

let mother = new MotherAccount('Maria', 'Rossi', 0, addInterest)

mother.oneMotherDeposit();

mother.oneMotherWhitDraw();