abstract class Veicolo{

    nRuote:number = 1;
    vel:number = 0
    velMAx:number;
    motor:boolean;

    constructor(nRuote:number,velMAx:number,motor:boolean){
        this.nRuote = nRuote;
        this.velMAx = velMAx;
        this.motor = motor;
    }

    fermaVeicolo(){
        this.vel = 0;
    }

    limiteVelocità(vel:number):boolean{
        return vel <= this.velMAx
    }

    abstract accelera(vel:number):void
    abstract frena(vel:number):void

}

class Automobile extends Veicolo{

    constructor(velMAx:number){
        super(4,velMAx,true)
    }

    accelera(vel: number) {
        this.vel += vel
    }
    frena(vel: number) {
        this.vel -= vel
    }
}

let auto = new Automobile(280);


class Bicicletta extends Veicolo{

    constructor(velMAx:number){
        super(2,velMAx,false)
    }

    accelera(vel: number):void {
        this.vel++
    }
    frena(vel: number):void {
        this.vel--
    }
}