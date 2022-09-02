function errore(messaggio:string):never{
    throw new Error(messaggio);
}


function checkAccess(access:boolean){

    if(access){
        return 'ok';
    }else{
        return errore('Access denied');
    }

}

checkAccess(true)