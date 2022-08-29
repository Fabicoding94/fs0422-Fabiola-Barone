let day:number = new Date().getDay()
console.log()

if(day==0){
    console.log('domenica');

}else if(day==1){
    console.log('lunedì')
}

switch(day){
    case 0: day= "Sunday";
    break;

    case 1: day= "Monday";
    break;
}