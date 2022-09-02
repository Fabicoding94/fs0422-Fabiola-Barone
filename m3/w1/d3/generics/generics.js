function numero(x) {
    return x;
}
numero(5);
function numeroGeneric(x) {
    return x;
}
console.log(numeroGeneric('5'));
console.log(numeroGeneric(5));
console.log(numero(5));
function sommaOConcatena(x, y) {
}
sommaOConcatena(['ciao'], 5);
function prova(carattere1) {
    return typeof carattere1;
}
prova('a'); //string
prova(5); //number
function provaSpread() {
    var caratteri = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        caratteri[_i] = arguments[_i];
    }
    return caratteri;
}
var obj = {
    prop1: 'prova',
    prop2: 5
};
var CustomArray = /** @class */ (function () {
    function CustomArray() {
        this.arr = [];
    }
    CustomArray.prototype.addItem = function (item) {
        this.arr.push(item);
    };
    CustomArray.prototype.getItems = function () {
        return this.arr;
    };
    CustomArray.prototype.removeItem = function (item) {
        var index = this.arr.indexOf(item);
        this.arr.splice(index, 1);
    };
    CustomArray.prototype.removeItemPro = function (item) {
        this.arr = this.arr.filter(function (i) { return i != item; });
    };
    return CustomArray;
}());
var arr = new CustomArray();
console.log(arr.getItems());
arr.addItem('ciao');
arr.addItem('ciao2');
arr.addItem('ciao3');
console.log(arr.getItems());
arr.removeItem('ciao');
console.log(arr.getItems());
