import {Address as a} from './Address.ts'

class User {

    protected id: number|undefined;
    id:number|undefined;
    name: string;
    lastname:string;
    address:Address|undefined;
    billingAddress:Address;
    constructor(name:string; lastname:string){
        this.name = name;
        this.lastname = lastname;
    }

    set setAddress(address:Address){
        this.address = address;
    }
     
}



/*Terminal -> Git Bush -> "cd mdelli"; -> "tsc --init"

*/

let user:User = ner User('mario', 'rossi')

let address:Address = new Address ('via roma 1', 'roma', 'italia', 00191)
user.setAddress = address
