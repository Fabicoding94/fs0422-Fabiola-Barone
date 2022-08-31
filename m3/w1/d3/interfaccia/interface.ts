interface IBook{
    nPagine: number;
    getBook(x:number):string
}

interface IBook2{
    nPagine: number;
    getBook(x:number):string
}

class Book implements IBook, IBook2

