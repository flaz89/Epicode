// -------------------- risoluzione esercizio con Classe

/* class CalcTaxes {
        professione:string;
        codredd:number;
        redditoannuolordo:number;
        tasseinps:number = 0.2623;
        tasseirpef:number = 0.15;

        constructor(_professione:string, _codredd:number, _redditoannuolordo:number){
            this.professione = _professione;
            this.codredd = _codredd;
            this.redditoannuolordo = _redditoannuolordo;
        }

        getUtileTasse():number {
            return (this.redditoannuolordo * this.codredd);
        }

        getTasseInps():number {
            return this.getUtileTasse() * this.tasseinps;
        }

        getTasseIrpef():number {
            return this.getUtileTasse() * this.tasseirpef;
        }

        getRedditoAnnuoNetto():number {
            return this.redditoannuolordo - (this.getTasseInps() + this.getTasseIrpef());
        }

        calcTasse():void {
            console.log(`Utile tasse ${this.professione}: ${this.getUtileTasse().toFixed(3)} €\nTasse inps ${this.professione}: ${this.getTasseInps().toFixed(3)} €\nTasse irpef ${this.professione}: ${this.getTasseIrpef().toFixed(3)} €\nReddito annuo netto ${this.professione}: ${this.getRedditoAnnuoNetto().toFixed(3)} €`);
        }
}

const artigiano = new CalcTaxes("artigiano", 0.67, 47.000 );
artigiano.calcTasse();

console.log();

const venditoreAmbulante = new CalcTaxes("venditoreAmbulante", 0.54, 32.000 );
venditoreAmbulante.calcTasse();

console.log();

const commerciante = new CalcTaxes("commerciante", 0.40, 140.000 );
commerciante.calcTasse(); */


// -------------------- risoluzione esercizio con Interfaccia

interface TaxModels {
        professione:string;
        codredd:number;
        redditoannuolordo:number;
        tasseinps:number;
        tasseirpef:number;

        getUtileTasse():number;
        getTasseInps():number;
        getTasseIrpef():number;
        getRedditoAnnuoNetto():number;
        calcTasse():void;
}

class Taxes implements TaxModels {
    professione: string;
    codredd: number;
    redditoannuolordo: number;
    tasseinps: number = 0.2623;
    tasseirpef: number = 0.15;

    constructor(_professione:string, _coderedd:number, _redditoannuolordo:number) {
        this.professione = _professione;
        this.codredd = _coderedd;
        this.redditoannuolordo = _redditoannuolordo;
    }

    getUtileTasse(): number {
        return this.redditoannuolordo * this.codredd;
    }

    getTasseInps(): number {
        return this.getUtileTasse() * this.tasseinps;
    }

    getTasseIrpef(): number {
        return this.getUtileTasse() * this.tasseirpef;
    }

    getRedditoAnnuoNetto(): number {
        return this.redditoannuolordo - (this.getTasseInps() + this.getTasseIrpef());
    }

    calcTasse(): void {
        console.log(`Utile tasse ${this.professione}: ${this.getUtileTasse().toFixed(3)} €\nTasse inps ${this.professione}: ${this.getTasseInps().toFixed(3)} €\nTasse irpef ${this.professione}: ${this.getTasseIrpef().toFixed(3)} €\nReddito annuo netto ${this.professione}: ${this.getRedditoAnnuoNetto().toFixed(3)} €`);
    }
}

const artigiano = new Taxes("artigiano", 0.67, 47.000 );
artigiano.calcTasse();

console.log();

const venditoreAmbulante = new Taxes("venditoreAmbulante", 0.54, 32.000 );
venditoreAmbulante.calcTasse();

console.log();

const commerciante = new Taxes("commerciante", 0.40, 140.000 );
commerciante.calcTasse();