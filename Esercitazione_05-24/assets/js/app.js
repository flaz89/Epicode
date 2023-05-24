"use strict";
// -------------------- risoluzione esercizio con Classe
class Taxes {
    constructor(_professione, _coderedd, _redditoannuolordo) {
        this.tasseinps = 0.2623;
        this.tasseirpef = 0.15;
        this.professione = _professione;
        this.codredd = _coderedd;
        this.redditoannuolordo = _redditoannuolordo;
    }
    getUtileTasse() {
        return this.redditoannuolordo * this.codredd;
    }
    getTasseInps() {
        return this.getUtileTasse() * this.tasseinps;
    }
    getTasseIrpef() {
        return this.getUtileTasse() * this.tasseirpef;
    }
    getRedditoAnnuoNetto() {
        return this.redditoannuolordo - (this.getTasseInps() + this.getTasseIrpef());
    }
    calcTasse() {
        console.log(`Utile tasse ${this.professione}: ${this.getUtileTasse().toFixed(3)} €\nTasse inps ${this.professione}: ${this.getTasseInps().toFixed(3)} €\nTasse irpef ${this.professione}: ${this.getTasseIrpef().toFixed(3)} €\nReddito annuo netto ${this.professione}: ${this.getRedditoAnnuoNetto().toFixed(3)} €`);
    }
}
const artigiano = new Taxes("artigiano", 0.67, 47.000);
artigiano.calcTasse();
console.log();
const venditoreAmbulante = new Taxes("venditoreAmbulante", 0.54, 32.000);
venditoreAmbulante.calcTasse();
console.log();
const commerciante = new Taxes("commerciante", 0.40, 140.000);
commerciante.calcTasse();
