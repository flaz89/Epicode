// link navbar
const linkAdd = document.getElementById("add");
const linkLogo = document.getElementById("logo");

//form
const form = document.getElementById("registrazione-form");

// campi del form
const prodName = document.getElementById("name").value;
const prodDescription = document.getElementById("description").value;
const prodBrand = document.getElementById("brand").value;
const prodImg = document.getElementById("imageUrl").value;
const prodPrice = document.getElementById("price").value;

// buttons
const btnUpdate = document.getElementById("editCard");
const btnDelete = document.getElementById("deleteCard");
const btnSubmit = document.getElementById("submitCard");
const btnBackHome = document.getElementById("backHome");

//modal
const modalText = document.getElementById("text-modal");
const modalResult = document.getElementById("result-modal");
const closeModal = document.getElementById("closeModal");


// trasformo la stringa del localStorage in un oggetto e recupero il valore che contiene l'id del dato
const localStorageCard = JSON.parse(localStorage.getItem("cardId"));
const cardId = localStorageCard ? localStorageCard.cardId : null;
//const cardId = JSON.parse(localStorage.cardId).cardId;







//------------------------------------------------------------------------------------------------------------------- GET
// funzione al win.onload, se è presente il locaStorage crea una get request sull'oggetto selzionato dalla home
window.onload = (event) => {

    if (localStorageCard) {
        btnDelete.classList.toggle("hidden");
        btnUpdate.classList.toggle("hidden");
        btnSubmit.classList.toggle("hidden");

        async function populateForm() {
            try {
                const response = await fetch("https://striveschool-api.herokuapp.com/api/product/", {
                    method: "GET",
                    headers: {
                        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDYwZjU0ZGYzYjY1YzAwMTQ1OTMxYTgiLCJpYXQiOjE2ODQwNzU4NTMsImV4cCI6MTY4NTI4NTQ1M30.zK59BT0v0yTxd3LzjQlmSmaaJsdqJ5Jhc8wHlDTKCSk"
                    }
                });

                const products = await response.json();
                // ciclo l'array dei prodotti sull'API per cercare il prodotto con lo stesso ID e recuperarne le info per visualizzarle nei campi del form
                for (let i = 0; i < products.length; i++) {
                    if (cardId === products[i]._id) {
                        document.getElementById("name").value = `${products[i].name}`;
                        document.getElementById("description").value = `${products[i].description}`;
                        document.getElementById("brand").value = `${products[i].brand}`;
                        document.getElementById("imageUrl").value = `${products[i].imageUrl}`;
                        document.getElementById("price").value = `${products[i].price}`;
                    }
                }

            } catch (error) {
                console.error("We are sorry, new error verified:", error);
            }
        }
        populateForm();
    }
}




//------------------------------------------------------------------------------------------------------------------- PUT

// al click del bottone Update viene fatta una richiesta PUT dell'oggetto "payload" modificato (payloadUpdated) e se la risposta dell'API è ok faccio apparire l'alert di conferma, rimando alla pagina home e rimovo il localStorage
btnUpdate.addEventListener("click", async function () {

    const payloadUpdated = {
        name: document.getElementById("name").value,
        description: document.getElementById("description").value,
        brand: document.getElementById("brand").value,
        imageUrl: document.getElementById("imageUrl").value,
        price: document.getElementById("price").value
    }

    //const cardId = JSON.parse(localStorage.cardId).cardId;

    const response = await fetch(`https://striveschool-api.herokuapp.com/api/product/${cardId}`, {
        method: "PUT",
        headers: {
            "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDYwZjU0ZGYzYjY1YzAwMTQ1OTMxYTgiLCJpYXQiOjE2ODQwNzU4NTMsImV4cCI6MTY4NTI4NTQ1M30.zK59BT0v0yTxd3LzjQlmSmaaJsdqJ5Jhc8wHlDTKCSk",
            "Content-Type": "application/json"
        },
        body: JSON.stringify(payloadUpdated)
    });

    if (response.ok) {
        modalText.textContent = "Updated successfully!!!";
        modalResult.classList.add("bi", "bi-check2-circle");
        closeModal.addEventListener("click", function() {
            window.location.href = "index.html";
        })
        localStorage.removeItem("cardId");
    } else {
        modalText.textContent = "Something went wrong.";
        modalResult.classList.add("bi", "bi-x-octagon-fill");
    }
});


//------------------------------------------------------------------------------------------------------------------- DELETE

// al click del bottone Update viene fatta una richiesta PUT dell'oggetto "payload" modificato (payloadUpdated) e se la risposta dell'API è ok faccio apparire l'alert di conferma, rimando alla pagina home e rimovo il localStorage
btnDelete.addEventListener("click", async function () {

    const payloadDelete = {
        name: document.getElementById("name").value,
        description: document.getElementById("description").value,
        brand: document.getElementById("brand").value,
        imageUrl: document.getElementById("imageUrl").value,
        price: document.getElementById("price").value
    }

    //const cardId = JSON.parse(localStorage.cardId).cardId;

    const response = await fetch(`https://striveschool-api.herokuapp.com/api/product/${cardId}`, {
        method: "DELETE",
        headers: {
            "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDYwZjU0ZGYzYjY1YzAwMTQ1OTMxYTgiLCJpYXQiOjE2ODQwNzU4NTMsImV4cCI6MTY4NTI4NTQ1M30.zK59BT0v0yTxd3LzjQlmSmaaJsdqJ5Jhc8wHlDTKCSk",
            "Content-Type": "application/json"
        },
        body: JSON.stringify(payloadDelete)
    });

    if (response.ok) {
        modalText.textContent = "Product deleted!!!";
        modalResult.classList.add("bi", "bi-check2-circle");
        closeModal.addEventListener("click", function() {
            window.location.href = "index.html";
        })
        localStorage.removeItem("cardId");
    } else {
        alert("Request ERROR:", response.status);
    }
});





//------------------------------------------------------------------------------------------------------------------- POST
async function postProduct(event) {
    event.preventDefault();

    const payload = {
        name: document.getElementById("name").value,
        description: document.getElementById("description").value,
        brand: document.getElementById("brand").value,
        imageUrl: document.getElementById("imageUrl").value,
        price: document.getElementById("price").value
    }


    try {
        const response = await fetch("https://striveschool-api.herokuapp.com/api/product/", {
            method: "POST",
            headers: {
                "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDYwZjU0ZGYzYjY1YzAwMTQ1OTMxYTgiLCJpYXQiOjE2ODQwNzU4NTMsImV4cCI6MTY4NTI4NTQ1M30.zK59BT0v0yTxd3LzjQlmSmaaJsdqJ5Jhc8wHlDTKCSk",
                "Content-Type": "application/json"
            },
            body: JSON.stringify(payload)
        });

        console.log(payload)




        if (response.ok) {
            const newProduct = await response.json();
            console.log(newProduct);
            form.reset();
            modalText.textContent = "Uploaded successfully!!!";
            modalResult.classList.add("bi", "bi-check2-circle");
        } else {
            // Gestisci il caso in cui la risposta non sia ok
            console.log("Request ERROR:", response.status);
            form.reset();
            modalText.textContent = "Something went wrong.";
            modalResult.classList.add("bi", "bi-x-octagon-fill");

        }
    } catch (error) {
        console.error("We are sorry, new error verified:", error);
    }
}


// funzione che pulisce il local storage al click e ritorno sulla home
function removeLocalStorage() {
    localStorage.removeItem("cardId");
}

linkLogo.addEventListener("click", removeLocalStorage);
linkAdd.addEventListener("click", removeLocalStorage);
btnBackHome.addEventListener("click", removeLocalStorage);










