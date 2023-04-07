/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

/* ESERCIZIO 1
    Dato il seguente array, scrivi del codice per stampare ogni elemento dell'array in console.
*/
const pets = ['dog', 'cat', 'hamster', 'redfish'];

for (let pet in pets) {
    console.log(pets[pet]);
}

/* ESERCIZIO 2
    Scrivi del codice per ordinare alfabeticamente gli elementi dell'array "pets" e stampa l'array ordinato in console.
*/
var sortedPets = pets.sort();
console.log(sortedPets);

/* ESERCIZIO 3
    Scrivi del codice per stampare nuovamente in console gli elementi dell'array "pets", questa volta in ordine invertito.
*/
for (let i = sortedPets.length - 1; i >= 0; i--) {
    console.log(sortedPets[i]);
}

/* ESERCIZIO 4
    Scrivi del codice per spostare il primo elemento dall'array "pets" in ultima posizione e stampa l'array in console.
*/
var firstPet = pets[0];

pets.splice(firstPet, 1);
pets.push(firstPet);
console.log(pets);

/* ESERCIZIO 5
    Dato il seguente array di oggetti, scrivi del codice per aggiungere ad ognuno di essi una proprietà "licensePlate" con valore a tua scelta e stampa l'array in console.
*/
const cars = [
    {
        brand: 'Ford',
        model: 'Fiesta',
        color: 'red',
        trims: ['titanium', 'st', 'active'],
    },
    {
        brand: 'Peugeot',
        model: '208',
        color: 'blue',
        trims: ['allure', 'GT'],
    },
    {
        brand: 'Volkswagen',
        model: 'Polo',
        color: 'black',
        trims: ['life', 'style', 'r-line'],
    },
]

function randomPlate() {
    let plate = [];

    for (let i = 0; i < 5; i++) {
        plate.push(Math.floor(Math.random() * 10));
    }
    return plate;
}

for (let i = 0; i < cars.length; i++) {
    cars[i].licensePlate = randomPlate().toString().replaceAll(",", ""); //il metodo ".replaceAll()" sono andato a cercarlo su MDN anche se non l'abbiamo mai visto"
}

console.log(cars);

/* ESERCIZIO 6
    Scrivi del codice per aggiungere un nuovo oggetto in ultima posizione nell'array "cars", rispettando la struttura degli altri elementi.
    Successivamente, rimuovi l'ultimo elemento della proprietà "trims" da ogni auto e stampa l'array in console.
*/
cars.push({ brand: 'Lamborghini', model: 'Revuelto', color: 'Black-Anubi', trims: ['carbon', 'sport', 'r-line'], licensePlate: randomPlate().toString().replaceAll(",", "") });

for (let i = 0; i < cars.length; i++) {
    let trimLastIndex = cars[i].trims.length - 1;
    cars[i].trims.splice(trimLastIndex, 1);
}

console.log(cars);

/* ESERCIZIO 7
    Scrivi del codice per salvare il primo elemento della proprietà "trims" di ogni auto nel nuovo array "justTrims", sotto definito e stampa in console l'array justTrims così popolato.
*/
const justTrims = []

for (let i = 0; i < cars.length; i++) {
    justTrims.push(cars[i].trims[0]);
}

console.log(justTrims);

/* ESERCIZIO 8
    Cicla l'array "cars" e costruisci un if/else statament per mostrare due diversi messaggi in console. Se la prima lettera della proprietà
    "color" ha valore "b", mostra in console "Fizz". Altrimenti, mostra in console "Buzz".
*/

for (let i = 0; i < cars.length; i++) {
    if (cars[i].color[0] === "b") {
        console.log("Fizz");
    } else {
        console.log("Buzz");
    }
}

/* ESERCIZIO 9
    Utilizza un ciclo while per stampare in console i valori del seguente array numerico fino al raggiungimento del numero 32 escluso.
*/
const numericArray = [
    6, 90, 45, 75, 84, 98, 35, 74, 31, 2, 8, 23, 100, 32, 66, 313, 321, 105,
]

let i = 0;
while (i < numericArray.length) {
    if (numericArray[i] == 32) {
        break;
    } else {
        console.log(numericArray[i])
    }
    i++;
}

/* ESERCIZIO 10
    Partendo dall'array fornito e utilizzando un costrutto switch, genera un nuovo array composto dalle posizioni di ogni carattere all'interno
    dell'alfabeto italiano.
    es. [f, b, e] --> [6, 2, 5]
*/

const charactersArray = ["g", "n", "u", "z", "d"];
const newArr = [];

for (let i = 0; i < charactersArray.length; i++) {
    let char = charactersArray[i];
    switch (char) {
        case "a":
            newArr.push(1);
            break;
        case "b":
            newArr.push(2);
            break;
        case "c":
            newArr.push(3);
            break;
        case "d":
            newArr.push(4);
            break;
        case "e":
            newArr.push(5);
            break;
        case "f":
            newArr.push(6);
            break;
        case "g":
            newArr.push(7);
            break;
        case "h":
            newArr.push(8);
            break;
        case "i":
            newArr.push(9);
            break;
        case "l":
            newArr.push(10);
            break;
        case "m":
            newArr.push(11);
            break;
        case "n":
            newArr.push(12);
            break;
        case "o":
            newArr.push(13);
            break;
        case "p":
            newArr.push(14);
            break;
        case "q":
            newArr.push(15);
            break;
        case "r":
            newArr.push(16);
            break;
        case "s":
            newArr.push(17);
            break;
        case "t":
            newArr.push(18);
            break;
        case "u":
            newArr.push(19);
            break;
        case "v":
            newArr.push(20);
            break;
        case "z":
            newArr.push(21);
            break;
    }
}

console.log(newArr);

