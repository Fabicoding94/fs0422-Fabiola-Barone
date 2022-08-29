interface Iuser{
    nome:string;
    cognome:string;
    email:string;
    password: string;
}


class User implements Iuser{
    nome:string;
    cognome:string;
    email:string;
    password: string;
}

let user:Iuser = new User(); 