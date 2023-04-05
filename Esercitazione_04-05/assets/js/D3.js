/* ESERCIZIO 1
 Scrivi un algoritmo per trovare il più grande tra due numeri interi.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
function bigNum() {
  return Math.max(5, 9);
}
document.getElementById("es1").innerHTML = bigNum;
document.getElementById("es1_1").innerHTML = bigNum();


/* ESERCIZIO 2
  Scrivi un algoritmo che mostri "not equal" in console se un numero intero fornito è diverso da 5.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
function notEqual() {
  let x = 7;
  if (x == 5) {
    return "Numbers are equal";
  } else {
    return "numbers are not equal";
  }
}

document.getElementById("es2").innerHTML = notEqual;
document.getElementById("es2_1").innerHTML = notEqual();

/* ESERCIZIO 3
  Scrivi un algoritmo che mostri "divisibile per 5" in console se un numero fornito è perfettamente divisibile per 5 (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

/* SCRIVI QUI LA TUA RISPOSTA */
var numCheck = 35;
function fractionFive(num) {
  if (num % 5 == 0) {
    return "\"numCheck\" is divisible by 5";
  } else {
    return "\"numCheck\" is not divisible by 5";
  }
}
document.getElementById("es3").innerHTML = "var numCheck = 35;";
document.getElementById("es3_1").innerHTML = fractionFive;
document.getElementById("es3_2").innerHTML = fractionFive(numCheck);

/* ESERCIZIO 4
  Scrivi un algoritmo per verificare che, dati due numeri interi, il valore di uno di essi sia 8 oppure se la loro addizione/sottrazione sia uguale a 8.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
var a = 5;
var b = 3;
function eightCheck() {
  if (a == 8 || b == 8) {
    return "One of them is equal to 8";
  } else if ((a - b) == 8) {
    return `Subtraction between ${a} and ${b} is different to 8`;
  } else if ((a + b) == 8) {
    return `Sum between ${a} and ${b} is equal to 8`;
  }
}
document.getElementById("es4").innerHTML = "var a = 5;<br>var b = 3;";
document.getElementById("es4_1").innerHTML = eightCheck;
document.getElementById("es4_2").innerHTML = eightCheck();


/* ESERCIZIO 5
  Stai lavorando su un sito di e-commerce. Stai salvando il saldo totale del carrello dell'utente in una variabile "totalShoppingCart".
  C'è una promozione in corso: se il totale del carrello supera 50, l'utente ha diritto alla spedizione gratuita (altrimenti la spedizione ha un costo fisso pari a 10).
  Crea un algoritmo che determini l'ammontare totale che deve essere addebitato all'utente per il checkout.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
var totalShoppingCart = 43;
var calendarDay = "Black Friday";

function total() {
  if (totalShoppingCart > 50) {
    if (calendarDay === "Black Friday") {
      return `You are entitled to free shipping cause your checkout is over 50€: ${totalShoppingCart - (totalShoppingCart * 0.2)}€`;
    }
    return `You are entitled to free shipping cause your checkout is over 50€: ${totalShoppingCart}€`;
  } else if (totalShoppingCart < 50) {
    if (calendarDay === "Black Friday") {
      return `You are entitled to free shipping cause your checkout is over 50€: ${totalShoppingCart - (totalShoppingCart * 0.2)}€`;
    }
    return `Your total checkout is under 50€, so your total is: ${totalShoppingCart + 10}€`;
  }
}

document.getElementById("es5").innerHTML = "var totalShoppingCart = 43;<br>var calendarDay = \"Black Friday\";";
document.getElementById("es5_1").innerHTML = total;
document.getElementById("es5_2").innerHTML = total();


/* ESERCIZIO 6
  Stai lavorando su un sito di e-commerce. Oggi è il Black Friday e viene applicato il 20% su ogni prodotto.
  Modifica la risposta precedente includendo questa nuova promozione nell'algoritmo, determinando come prima se le spedizioni sono gratuite oppure no e e calcolando il totale.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 7
  Crea tre variabili, e assegna un valore numerico a ciascuna di esse.
  Utilizzando un blocco condizionale, crea un algoritmo per ordinarle secondo il loro valore, dal più alto al più basso.
  Alla fine mostra il risultato in console.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
var num1 = 3, num2 = 24, num3 = 57;
var arr = [num1, num2, num3];

function sortFromBig() {
  arr.sort();
}

/* ESERCIZIO 8
  Crea un algoritmo per verificare che un valore fornito sia un numero oppure no (suggerimento: cerca su un motore di ricerca "typeof").
*/

/* SCRIVI QUI LA TUA RISPOSTA */
var givenNum = 8;
console.log(typeof givenNum);
document.getElementById("es8").innerHTML = "var givenNum = 8;<br>console.log(typeof givenNum);";
document.getElementById("es8_1").innerHTML = typeof givenNum;

/* ESERCIZIO 9
  Crea un algoritmo per controllare se un numero fornito sia pari o dispari (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

/* SCRIVI QUI LA TUA RISPOSTA */
var evenNum = 17;
function isEven() {
  if (evenNum % 2 == 0) {
    return "number is even";
  } else {
    return "number is odd";
  }
}
document.getElementById("es9").innerHTML = "var evenNum = 17;";
document.getElementById("es9_1").innerHTML = isEven;
document.getElementById("es9_2").innerHTML = isEven();

/* ESERCIZIO 10
  Modifica la logica del seguente algoritmo in modo che mostri in console il messaggio corretto in ogni circostanza.
  let val = 7
  if (val < 10) {
      console.log("Meno di 10");
    } else if (val < 5) {
      console.log("Meno di 5");
    } else {
      console.log("Uguale a 10 o maggiore");
    }
*/

/* SCRIVI QUI LA TUA RISPOSTA */
let val = 7;
function valCorrect() {
  if (val < 5) {
      return("Meno di 5");
    } else if (val < 10) {
      return("Meno di 10");
    } else {
      return("Uguale a 10 o maggiore");
    }
}
console.log(valCorrect());
document.getElementById("es10").innerHTML = "let val = 7;";
document.getElementById("es10_1").innerHTML = valCorrect;
document.getElementById("es10_2").innerHTML = valCorrect();

/* ESERCIZIO 11
  Fornito il seguente oggetto, scrivi del codice per aggiungere una proprietà "city", il cui valore sarà "Toronto".
*/

const me = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css'],
}
me.city = "Toronto";
console.log(me);

document.getElementById("es11").innerHTML = me.name + "<br>" +me.lastName + "<br>" +me.skills;
document.getElementById("es11_1").innerHTML = "me.city = \"Toronto\";";
document.getElementById("es11_2").innerHTML = me.name + "<br>" +me.lastName + "<br>" + me.skills + "<br>" + me.city;


/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 12
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere la proprietà "lastName".
*/

/* SCRIVI QUI LA TUA RISPOSTA */
delete me.lastName;
console.log(me);

document.getElementById("es12").innerHTML = "delete me.lastName;";
document.getElementById("es12_1").innerHTML = me.name + "<br>" + me.skills + "<br>" + me.city;

/* ESERCIZIO 13
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere l'ultimo elemento della proprietà "skills".
*/

/* SCRIVI QUI LA TUA RISPOSTA */
me.skills.splice(2, 1);
console.log(me);

document.getElementById("es13").innerHTML = "me.skills.splice(2, 1);";
document.getElementById("es13_1").innerHTML = me.name + "<br>" + me.skills + "<br>" + me.city;

/* ESERCIZIO 14
  Scrivi del codice per creare un array inizialmente vuoto. Riempilo successivamente con i numeri da 1 a 10.
*/
/* SCRIVI QUI LA TUA RISPOSTA */
var emptyArr = [];
emptyArr.unshift(1,2,3,4,5,6,7,8,9,10);
console.log(emptyArr);

document.getElementById("es14").innerHTML = "var emptyArr = [];";
document.getElementById("es14_1").innerHTML = "emptyArr.unshift(1,2,3,4,5,6,7,8,9,10);";
document.getElementById("es14_2").innerHTML = emptyArr;


/* ESERCIZIO 15
  Scrivi del codice per sostituire l'ultimo elemento dell'array, ovvero il valore 10, con il valore 100.
*/
/* SCRIVI QUI LA TUA RISPOSTA */
emptyArr.splice(emptyArr.length - 1, 1, 100);

document.getElementById("es15").innerHTML = "emptyArr.splice(emptyArr.length - 1, 1, 100);";
document.getElementById("es15_1").innerHTML = emptyArr;
