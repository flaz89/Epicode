/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato..
*/

/* SCRIVI QUI LA TUA RISPOSTA */
function area(l1, l2) {
    console.log(l1 * l2);
}
area(3, 4);

/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare
 la loro somma moltiplicata per tre.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

function crazySum(num1, num2) {
    let sum = num1 + num2;
    if (num1 === num2) {
        return sum * 3;
    } else {
        return sum;
    }
}

console.log(crazySum(4, 4));

/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia maggiore di 19.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
function crazyDiff(num3) {
    if (num3 < 0) {
        return Math.abs(num3 - 19);
    } else if (num3 > 19) {
        return (num3 - 19) * 3;
    }
}

console.log(crazyDiff(-10));


/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro, e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
function boundary(n) {
    if (n >= 20 && n <= 100) {
        return true;
    } else if (n > 100 && n <= 400) {
        return false;
    } else {
        return "Not accepted!";
    }
}

console.log(boundary(100));

/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
var nom = "Epicode";
function epify(string) {
    if (string.includes("Epicode")) {
        return string;
    } else {
        return `${nom} ${string}`;
    }
}

console.log(epify("ciao coe stai?"));

/* ESERCIZIO 6
 Scrivi una funzione di nome "check3and7" che accetta un numero positivo come parametro. La funzione deve controllare che il parametro sia un multiplo
 di 3 o di 7. (Suggerimento: usa l'operatore modulo) TRUE / FALSE
*/

/* SCRIVI QUI LA TUA RISPOSTA */
function check3and7(numAbs) {
    if ((numAbs % 3 === 0) || (numAbs % 7 === 0)) {
        return true;
    } else {
        return false;
    }
}

console.log(check3and7(6));

/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/

function reverseString(reverse) {
    const newString = [];
    if (typeof reverse === "string") {
        for(let i = reverse.length - 1; i >= 0; i--) {
            newString.push(reverse[i]);
        }
    }
    console.log(newString.toString().replaceAll(",", ""));
}

reverseString("ciao");

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 8
 Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa formata da diverse parole.
 La funzione deve rendere maiuscola la prima lettera di ogni parola contenuta nella stringa.
*/
function upperFirst(str) {
    str = str.split(' ');
    let newStr = [];
    for (let word in str) {
        newStr.push(str[word[0]].toLowerCase());
    }
    console.log(newStr.join().replaceAll(",", " "));

}

upperFirst("Ciao! Come Stai Oggi?");


/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro una stringa. La funzione deve creare una nuova stringa senza il primo e l'ultimo carattere
 della stringa originale.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
function cutString(stringX) {
    stringX = stringX.replace(stringX[0],"" ).replace(stringX[stringX.length - 1],"" );
    return stringX;
}

console.log(cutString("ciao"));
/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come parametro un numero n e ritorna un'array contenente n numeri casuali inclusi tra 0 e 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
function giveMeRandom(numX) {
    let randomArr = [];

    for (let i = 0; i <= numX; i++) {
        let randomNum = Math.floor(Math.random() * 11);
        randomArr.push(randomNum);
    }
    return randomArr;
}

console.log(giveMeRandom(8));


