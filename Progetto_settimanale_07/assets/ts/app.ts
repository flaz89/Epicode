// interface Smarthphone --> numberCarica:number = €€€€€€ per chiamate
//                          numeroChiamate:number = numero chiamate effettuate


// classi User ----> estende l'interfaccia Smarthphone e implementare i metodi:
//                           - public void ricarica() --> per caricare il telefono
//                           - public void chiamata() --> aggiorna la carica del tel in base ai minuti della chiamata e aggiorna il numero delle chiamate - 0,20€/min
//                           - public number numero404() --> ti dice quanta carica hai 
//                           - public number getNumeroChiamate() --> ti dice quante chiamate hai fatto
//                           - public void azzeraChiamate() --> azzera il valore di numeroChiamate



interface Smarthphone {
    user:string;
    carica:number;
    numChiamate:number;
}

class User implements Smarthphone {
    user:string;
    carica:number;
    numChiamate:number;
    constructor(_user:string, _carica:number, _numChiamate:number){
        this.user = _user;
        this.carica = _carica;
        this.numChiamate = _numChiamate;
    }

    public ricarica(num:number):void {
        if (num) console.log(`Ciao ${this.user}, hai ricaricato il tuo numero di ${num.toFixed(2)} €.`);
        this.carica += num;
    }

    public chiamata(min:number):void {
        if (!this.carica) console.log(`Ciao ${this.user}, la tua carica è insufficiente per effettuare le chiamate`);

        if (this.carica) {
            this.carica -= min * 0.2;
            this.numChiamate += 1;

            this.carica <= 0 ? console.log("Spiacenti, hai esaurito il credito") :
            console.log(`La tua carica totale è scesa a ${this.carica.toFixed(2)} € dopo la chiamata di ${min} min`);
        }
    }

    public numero404():number {
        this.carica > 0 ? console.log(`Messaggio: Il tuo saldo attuale è di ${this.carica.toFixed(2)} €`) : console.log(`Messaggio: Il tuo credito è esaurito, devi ricaricare il tuo numero`);
        return this.carica;
    }

    public getNumeroChiamate():number {
        console.log(`Il totale delle tue chiamate è di: ${this.numChiamate}`);
        return this.numChiamate;
    }

    public azzeraChiamate():void {
        this.numChiamate = 0;
        console.log(`Le chiamate sono state azzerate : ${this.numChiamate}`);
    }

}
// es1. -- utente che ricarica ma effettua una chiamata di troppi minuti
const firstUser = new User("Marco",10, 3);
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




