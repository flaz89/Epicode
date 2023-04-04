/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
function risposta1() {
  let string = "<strong>String:</strong> equivale ad un testo composto da \"n\" caratteri (lettere / numeri / simboli)";
  let num = "<strong>Number:</strong> accetta qualisiasi valore numerico intero o decimale. Per i valori decimali è necessario utilizzare la \",\"."
  let bool = "<strong>Boolean:</strong> accetta un valore \"vero\" o \"falso\""
  let nul = "<strong>Null:</strong> valore che indica l'assenza intenzionale di un dato valore";
  let und = "<strong>Undefined:</strong> valore che identifica la mancanza di un valora ad una determinata variabile nonostante ci si aspetti che ritorni qualcosa";

  document.getElementById("risp1").innerHTML = string + "<br>" + num + "<br>" + bool + "<br>" + nul + "<br>" + und;
  
}

risposta1();

/* ESERCIZIO 2
 Crea una variable chiamata "name" e assegna ad essa il tuo nome, sotto forma di stringa.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

var name = "Flavio";
document.getElementById("risp2").innerHTML = "var name = \"Flavio\";";
document.getElementById("risp2_1").innerHTML = name;


/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

function sum() {
  let a = 12;
  let b = 20;
  return a + b;
}
document.getElementById("risp3").innerHTML = sum;
document.getElementById("risp3_1").innerHTML = sum();


/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

var x = 12;
document.getElementById("risp4").innerHTML = "var x = 12;";


/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "name" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
name = "Mammoliti";
document.getElementById("risp5").innerHTML = "name = \"Mammoliti\";";
document.getElementById("risp5_1").innerHTML = name;


/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

/* SCRIVI QUI LA TUA RISPOSTA */
function subtraction() {
   return 4 - x;
}
document.getElementById("risp6").innerHTML = subtraction;
document.getElementById("risp6_1").innerHTML = subtraction();

/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

/* SCRIVI QUI LA TUA RISPOSTA */

var name1 = "john";
var name2 = "John";

function verifica1() { 
  if (name1 !== name2) { 
    document.getElementById("risp7").innerHTML = "I due valori stringa sono diversi";
  } else {
    document.getElementById("risp7").innerHTML = "I due valori stringa sono identici";
  }

  if (name1.toLowerCase() === name2.toLowerCase()){
    document.getElementById("risp8_1").innerHTML = "I valori delle 2 variabili usando il metodo \".toLowerCase\" assumono lo stesso identico valore";
  }
} 
document.getElementById("risp8").innerHTML = verifica1;
verifica1();
