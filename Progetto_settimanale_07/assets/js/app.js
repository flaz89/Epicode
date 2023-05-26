"use strict";
// interface Smarthphone --> numberCarica:number = €€€€€€ per chiamate
//                          numeroChiamate:number = numero chiamate effettuate
class User {
    user;
    carica;
    numChiamate;
    constructor(_user, _carica, _numChiamate) {
        this.user = _user;
        this.carica = _carica;
        this.numChiamate = _numChiamate;
    }
    ricarica(num) {
        if (num)
            console.log(`Ciao ${this.user}, hai ricaricato il tuo numero di ${num.toFixed(2)} €.`);
        this.carica += num;
    }
    chiamata(min) {
        if (!this.carica)
            console.log(`Ciao ${this.user}, la tua carica è insufficiente per effettuare le chiamate`);
        if (this.carica) {
            this.carica -= min * 0.2;
            this.numChiamate += 1;
            this.carica <= 0 ? console.log("Spiacenti, hai esaurito il credito") :
                console.log(`La tua carica totale è scesa a ${this.carica.toFixed(2)} € dopo la chiamata di ${min} min`);
        }
    }
    numero404() {
        this.carica > 0 ? console.log(`Messaggio: Il tuo saldo attuale è di ${this.carica.toFixed(2)} €`) : console.log(`Messaggio: Il tuo credito è esaurito, devi ricaricare il tuo numero`);
        return this.carica;
    }
    getNumeroChiamate() {
        console.log(`Il totale delle tue chiamate è di: ${this.numChiamate}`);
        return this.numChiamate;
    }
    azzeraChiamate() {
        this.numChiamate = 0;
        console.log(`Le chiamate sono state azzerate : ${this.numChiamate}`);
    }
}
// es1. -- utente che ricarica ma effettua una chiamata di troppi minuti
const firstUser = new User("Marco", 10, 3);
firstUser.ricarica(10);
firstUser.chiamata(200);
firstUser.numero404();
firstUser.getNumeroChiamate();
firstUser.azzeraChiamate();
console.log();
// es2. -- utente che prova a chiamare senza effettuare una ricarica e con credito esaurito
const secondUser = new User("Paolo", 0, 0);
secondUser.ricarica(0);
secondUser.chiamata(1);
secondUser.numero404();
secondUser.getNumeroChiamate();
secondUser.azzeraChiamate();
console.log();
// es3. -- utente che ricarica e fa più chiamate con credito disponibile
const thirtUser = new User("Luca", 20, 2);
thirtUser.ricarica(17);
thirtUser.chiamata(20);
thirtUser.chiamata(5);
thirtUser.chiamata(13);
thirtUser.numero404();
thirtUser.getNumeroChiamate();
thirtUser.azzeraChiamate();
