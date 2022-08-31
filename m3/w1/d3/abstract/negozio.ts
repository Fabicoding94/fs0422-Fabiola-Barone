abstract class Negozio{

    maglia:string;
    pantalone:string;
    scarpe:string;

    constructor(maglia:string, pantalone:string, scarpe:string){
        this.maglia = maglia;
        this.pantalone = pantalone;
        this.scarpe = scarpe;
    }
}
abstract abbigliamento(
)

let negozio = new Negozio(); 