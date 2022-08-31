
import {User} from './User';
import {Address} from './Address'

class Invoice{
    id:number|undefined;
    date!: Date;
    userId!: number;
    user!: User;
    billingAddress!: Address;
    rows:any[] = [];

    constructor(billingAddress: Address){
        this.billingAddress = billingAddress || this.user?.billingAddress
    }
} 