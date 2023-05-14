const rowToPopulate = document.getElementById("row");


// funzione del bottone Edit sulla card per indirizzamento pagina back.html e creazione localStorage
function edit(event) {
  const cardId = event.target.getAttribute("data-id");
  const data = {cardId: cardId};
  localStorage.setItem("cardId", JSON.stringify(data));
  window.location.href = "back.html";
}

// funzione del bottone View sulla card per indirizzamento pagina details.html e creazione localStorage
function view(event) {
  const cardId = event.target.getAttribute("data-id");
  const data = {cardId: cardId};
  localStorage.setItem("cardId", JSON.stringify(data));
  window.location.href = "details.html";
}


//------------------------------------------------------------------------------------------------------------------- GET
async function showProducts() {
  const response = await fetch("https://striveschool-api.herokuapp.com/api/product/", {
    method: "GET",
    headers: {
      "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDYwZjU0ZGYzYjY1YzAwMTQ1OTMxYTgiLCJpYXQiOjE2ODQwNzU4NTMsImV4cCI6MTY4NTI4NTQ1M30.zK59BT0v0yTxd3LzjQlmSmaaJsdqJ5Jhc8wHlDTKCSk"
    }
  });

  if (!response.ok) {
    throw new Error(`HTTP error! status: ${response.status}`);
  }

  const products = await response.json();
  console.log(products);

  for (let i = 0; i < products.length; i++) {
    rowToPopulate.innerHTML += `
      <div class="col-md-4 col-lg-3">
        <div class="card mb-4">
          <img src="${products[i].imageUrl}" alt="">
          <div class="card-body">
            <h5 class="card-title overflow-text">${products[i].name}</h5>
            <p class="card-text overflow-text fw-lighter">${products[i].description}</p>
            <p class="card-text overflow-text">${products[i].brand}</p>
            <div class="d-flex justify-content-between align-items-center">
              <div class="btn-group">
                <button data-id="${products[i]._id}" type="button" onclick="view(event)" class="btn btn-sm btn-outline-secondary">View</button>
                <a data-id="${products[i]._id}" type="button" onclick="edit(event)" class="btn btn-sm btn-outline-secondary">Edit</a>
              </div>
              <small>${products[i].price} €</small>
            </div>
          </div>
        </div>
      </div>
    `;
  }
}

// Chiamata alla funzione showProducts() per generare le card
showProducts();
