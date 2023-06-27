// link navbar
const linkAdd = document.getElementById("add");
const linkLogo = document.getElementById("logo");

const btnBackHome = document.getElementById("backHome");
const detailsArea = document.getElementById("details");

const localStorageCard = JSON.parse(localStorage.getItem("cardId"));
const cardId = JSON.parse(localStorage.cardId).cardId;


if (localStorageCard) {

    //------------------------------------------------------------------------------------------------------------------- GET
    async function showDetails() {
        try {
            const response = await fetch("https://striveschool-api.herokuapp.com/api/product/", {
                method: "GET",
                headers: {
                    "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDYwZjU0ZGYzYjY1YzAwMTQ1OTMxYTgiLCJpYXQiOjE2ODQwNzU4NTMsImV4cCI6MTY4NTI4NTQ1M30.zK59BT0v0yTxd3LzjQlmSmaaJsdqJ5Jhc8wHlDTKCSk"
                }
            });

            const products = await response.json();
            // ciclo l'array dei prodotti sull'API per cercare il prodotto con lo stesso ID e recuperarne le info per visualizzarle nel dettaglio
            for (let i = 0; i < products.length; i++) {
                if (cardId === products[i]._id) {
                    console.log(products[i])
                    detailsArea.innerHTML += `<div id="detail" class="col col-md-6 text-center">
                    <h2 class="fw-bold">Good choice!</h2>
                    <br>
                    <img src="${products[i].imageUrl}" alt="">
                    <h3 class="fw-bold mt-3">${products[i].name}</h3>
                    <p id="description">${products[i].description}</p>
                    <p id="brand">-${products[i].brand}-</p>
                    <p id="price">${products[i].price} €</p>
                    <a href="index.html" role="button"><i id="backHome_details" class="bi bi-arrow-left-circle mb-4"></i></a>
                  </div>`;
                }
            }

        } catch (error) {
            console.error("We are sorry, new error verified:", error);
        }
    }
    showDetails();
} else {

}

// funzione che pulisce il local storage al click e ritorno sulla home
function removeLocalStorage() {
    localStorage.removeItem("cardId");
}

linkLogo.addEventListener("click", removeLocalStorage);
linkAdd.addEventListener("click", removeLocalStorage);
btnBackHome.addEventListener("click", removeLocalStorage);
