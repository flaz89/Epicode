// ESERCIZIO 1 --------------------------

const inputName = document.getElementById("name");
const inputLastname = document.getElementById("lastname");
const phone = document.getElementById("phone");
const btnSave = document.getElementById("btnSave");
const btnRemove = document.getElementById("btnRemove");

let contactList = [];

// funzione che scatena l'evento sul BTN-SAVE ---------------- !
btnSave.addEventListener("click", function(event){
    event.preventDefault();

    const inputUser = {
        name: inputName.value,
        lastName: inputLastname.value,
        phone: phone.value
    }

    //rendo stringa l'oggetto da pushare nell'Array
    const userJSON = JSON.stringify(inputUser);
    contactList.push(userJSON);
    console.log(contactList);

    //salvo l'array nel local storage
    localStorage.setItem("name", contactList);

    const result = document.getElementById("result").textContent = inputName.value;
    console.log(result); 

    //cancella gli input
    inputName.value = "";
    inputLastname.value = "";
    phone.value = "";

});

// funzione che scatena l'evento sul BTN-REMOVE ---------------- !
btnRemove.addEventListener("click", function(event){
    event.preventDefault();

    localStorage.removeItem("name");

});







// ESERCIZIO 2 --------------------------

const timer = document.getElementById("timer");

timer.textContent = 0;

setInterval(function() {
    timer.textContent++;
    sessionStorage.getItem("timer");
}, 1000);



