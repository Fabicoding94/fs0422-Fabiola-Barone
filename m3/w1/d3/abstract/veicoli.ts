abstract class Veicolo{
    nRuote:number = 1;
    velMax:number;
    motor:boolean;

    constructor(nRuote:number, velMax:number, motor:boolean){
        this.nRuote = nRuote;
        this.velMax = velMax;
        this.motor = motor;

    }

    fermaveicolo(){
        this.vel = 0
    }

    limiteVelocità(vel:number):boolean{
        return vel <= this.velMax
    }


    abstract accelera(vel:number)
    abstract frena(vel:number):void

    class Automobile extends Veicolo{

        constructor(velMax: nember){
            super()
        }
    }
}