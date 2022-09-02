function numero(x:number):number{
    return x;
}
numero(5)

function numeroGeneric<T>(x:T):T{
    return x;
}

console.log(numeroGeneric<string>('5'))
console.log(numeroGeneric<number>(5))
console.log(numero(5))


function sommaOConcatena<T,U>(x:T, y:U):any{

}

sommaOConcatena<string[],number>(['ciao'],5);


function prova<T>(carattere1:T):string{
    return typeof carattere1;
}

prova<string>('a');//string
prova<number>(5);//number


function provaSpread<T>(...caratteri:T[]):T[]{
    return caratteri;
}


interface keyValue<T,U>{
    prop1:T,
    prop2:U
}

let obj:keyValue<string,number> = {
    prop1:'prova',
    prop2:5,
}

class CustomArray<T>{

    private arr:T[] = []

    addItem(item:T):void{
        this.arr.push(item)
    }

    getItems():T[]{
        return this.arr
    }

    removeItem(item:T):void{
        let index = this.arr.indexOf(item)
        this.arr.splice(index,1)
    }

    removeItemPro(item:T):void{
        this.arr = this.arr.filter((i:T) => i != item)
    }

}

let arr:CustomArray<string> = new CustomArray()

console.log(arr.getItems())
arr.addItem('ciao')
arr.addItem('ciao2')
arr.addItem('ciao3')
console.log(arr.getItems())
arr.removeItem('ciao')
console.log(arr.getItems())