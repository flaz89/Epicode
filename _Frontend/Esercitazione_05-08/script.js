
// ESERCIZIO #1

//creo una classe User con un metoto di comparazione di etè

class User {
    constructor(_name, _lastName, _age, _location) {
        this.name = _name,
        this.lastName = _lastName,
        this.age = _age,
        this.location = _location
    }

    comparaEta(user) {
        this.age > user.age ? console.log (`${this.name} is older then ${user.name}`) : console.log (`${this.name} is younger then ${user.name}`);
    }
}

// istanzio i due oggetti "utenti"
const u1 = new User("Marco", "Ferro", 17, "Torino");
const u2 = new User("Giovanni", "Mare", 26, "Napoli");

// testo il metoto invocando l'oggetto
u1.comparaEta(u2);
u2.comparaEta(u1);


// ESERCIZIO #2 ----------------------------------------------------------

// ------------------------- creo la classe Pet
class Pet {
    constructor(_petName, _ownerName, _species, _breed) {
        this.name = _petName;
        this.owner = _ownerName;
        this.species = _species;
        this.brees = _breed
    }

    isSameOwner(pet) {
        this.owner === pet.owner ? console.log(true) : console.log(false);
    }
}

const petX = new Pet("Pippo", "Marco", "cane", "labrador");
const petY = new Pet("Pluto", "Giovanni", "gatto", "asiatico");




// ------------------------ seleziono gli elementi del dom per passare i valori al costruttore quando lo andremo a creare
const form = document.querySelector("form");

const nameForm = document.getElementById("name");
const ownerForm = document.getElementById("owner");
const speciesForm = document.getElementById("species");
const breedForm = document.getElementById("breed");

const btnSubmit = document.getElementById("submit");


let petList = [];
let id = 0;


// ------------------------ evento al click del bottone
form.addEventListener("submit", function(event) {
    event.preventDefault();

    const newPet = new Pet(nameForm.value, ownerForm.value, speciesForm.value, breedForm.value);
    petList.push(newPet);

    form.reset();
    id++;

    const info = ` <div class="card">
        <h3>Pet ${id}</h3>
        <p><strong>Name:</strong> ${newPet.name}</p>
        <p><strong>Owner:</strong> ${newPet.owner}</p>
        <p><strong>Species:</strong> ${newPet.species}</p>
        <p><strong>Breed:</strong> ${newPet.brees}</p>
        <button id="btnRemove" type="button">Remove</button>
        </div>`;

    const cardContainer = document.getElementById("cardContainer");
    cardContainer.innerHTML += info;

    console.log(id)
    console.log(petList);
});



