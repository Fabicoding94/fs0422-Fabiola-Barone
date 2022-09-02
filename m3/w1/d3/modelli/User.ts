import {Address} from './Address'

export class User {

    protected id:number|undefined;
    name:string;
    lastname:string;
    address:Address|undefined;
    billingAddress:Address|undefined;
    constructor(name:string, lastname:string){
        this.name = name;
        this.lastname = lastname;
    }

    set setAddress(address:Address){
        this.address = address;
    }
    set setBillingAddress(address:Address){
        this.billingAddress = address;
    }

}

let user:User = new User('mario','rossi');

/////////////////////////////////////
let address:Address = new Address('via roma 1','roma','italia',65455);
user.setAddress = address


/*Terminal -> Git Bush -> "cd mdelli"; -> "tsc --init"

*/


