"use strict";
// -------------------------------------------------------------------------- classe principale per le operazioni standard bancarie senza interessi
class BankOp {
    balanceInit = 0;
    deposit1;
    withdraw1;
    deposit2;
    withdraw2;
    constructor(_deposit1, _withdraw1, _deposit2, _withdraw2) {
        this.deposit1 = _deposit1;
        this.withdraw1 = _withdraw1;
        this.deposit2 = _deposit2;
        this.withdraw2 = _withdraw2;
    }
    oneDeposit() {
        return this.balanceInit += this.deposit1;
    }
    oneWithDraw() {
        return this.balanceInit -= this.withdraw1;
    }
    twoDeposit() {
        return this.balanceInit += this.deposit2;
    }
    twoWithDraw() {
        return this.balanceInit -= this.withdraw2;
    }
    totalBalance() {
        this.oneDeposit();
        this.oneWithDraw();
        this.twoDeposit();
        console.log(`L'utente ha fatto il primo deposito di:\n${this.deposit1} €\npoi ha ritirato:\n${this.withdraw1} €\nsuccessivamente ha depositato:\n${this.deposit2} €\nper poi prelevare:\n${this.withdraw2} €.\nIl bilancio totale del conto è: ${this.twoWithDraw()} €`);
    }
}
// ---------------------------------------------------------------------------------- classe per le operazioni bancarie con interessi
class BankOpWithInterest extends BankOp {
    constructor(_deposit1, _withdraw1, _deposit2, _withdraw2) {
        super(_deposit1, _withdraw1, _deposit2, _withdraw2);
    }
    totalBalance() {
        this.oneDeposit();
        this.oneWithDraw();
        this.twoDeposit();
        console.log(`L'utente ha fatto il primo deposito di:\n${this.deposit1} €\npoi ha ritirato:\n${this.withdraw1} €\nsuccessivamente ha depositato:\n${this.deposit2} €\nper poi prelevare:\n${this.withdraw2} €.\nIl bilancio totale del conto è: ${this.twoWithDraw() * 0.9} €`);
    }
}
const son = new BankOp(100, 200, 300, 400);
//son.totalBalance();
console.log(son);
console.log();
const mom = new BankOpWithInterest(1000, 400, 700, 800);
//mom.totalBalance();
console.log(mom);
