type StrNum = number | string;
//il tipo combinable corrisponderà con il tipo number o string

let x:StrNum = '4';
let y:StrNum = 4;

function combina(input1:SVGComponentTransferFunctionElement, input2:StrNum){

    if (typeof input1 === 'string' && typeof input2 === 'string'){
let result:StrNum = input1.toString() + String(input2);
}
