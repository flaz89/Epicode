// -------------------------------------------------------------------------- classe principale per le operazioni standard bancarie senza interessi

class BankOp {
    balanceInit:number = 0;

    deposit1:number;
    withdraw1:number;
    deposit2:number;
    withdraw2:number;

    constructor(_deposit1:number, _withdraw1:number, _deposit2:number, _withdraw2:number) {
        this.deposit1 = _deposit1;
        this.withdraw1 = _withdraw1;
        this.deposit2 = _deposit2;
        this.withdraw2 = _withdraw2;
    }

    oneDeposit():number {
        return this.balanceInit += this.deposit1;
    }

    oneWithDraw():number {
        return this.balanceInit -= this.withdraw1;
    }

    twoDeposit():number {
        return this.balanceInit += this.deposit2;
    }

    twoWithDraw():number {
        return this.balanceInit -= this.withdraw2;
    }

    totalBalance():void {
        this.oneDeposit();
        this.oneWithDraw();
        this.twoDeposit();

        console.log(`L'utente ha fatto il primo deposito di:\n${this.deposit1} €\npoi ha ritirato:\n${this.withdraw1} €\nsuccessivamente ha depositato:\n${this.deposit2} €\nper poi prelevare:\n${this.withdraw2} €.\nIl bilancio totale del conto è: ${this.twoWithDraw()} €`);
    }
}

// ---------------------------------------------------------------------------------- classe per le operazioni bancarie con interessi

class BankOpWithInterest extends BankOp {
    constructor(_deposit1:number, _withdraw1:number, _deposit2:number, _withdraw2:number) {
        super(_deposit1, _withdraw1, _deposit2, _withdraw2);
    }

    totalBalance():void {
        this.oneDeposit();
        this.oneWithDraw();
        this.twoDeposit();

        console.log(`L'utente ha fatto il primo deposito di:\n${this.deposit1} €\npoi ha ritirato:\n${this.withdraw1} €\nsuccessivamente ha depositato:\n${this.deposit2} €\nper poi prelevare:\n${this.withdraw2} €.\nIl bilancio totale del conto è: ${this.twoWithDraw() * 0.9} €`);
    }
}



const son = new BankOp(100, 200, 300, 400);
son.totalBalance();

console.log();

const mom = new BankOpWithInterest(1000, 400, 700, 800);
mom.totalBalance();

