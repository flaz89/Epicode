const displayBooks = document.getElementById("display-book-selected");
const btnScarta = document.querySelectorAll("#btn-scarta");
const bookCard = document.getElementById("card-box");










const url = "https://striveschool-api.herokuapp.com/books";
window.onload = () => {

    fetch(url)
        .then(objBooks => objBooks.json())
        .then((arrayBooks) => {
            for (let i = 0; i < arrayBooks.length; i++) {

                let movieCard = `
                <div id="card-box" class="p-5 col-sm-6 col-md-4 col-lg-3">
                    <div class="card h-100">
                        <img src="${arrayBooks[i].img}" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="movie-title">"${arrayBooks[i].title}"</h5>
                            <p class="movie-price">Price: ${arrayBooks[i].price} €</p>
                            <a href="#" class="btn btn-primary btn-scarta">Scarta</a>
                            <a href="#" class="btn btn-primary">Compra ora</a>
                        </div>
                    </div>
                </div>`
                displayBooks.innerHTML += movieCard;
            }
        })
        .catch(error => console.log(error))
}



btnScarta.addEventListener("click", function(event) {
    event.preventDefault();
    bookCard.classList.toggle("hidden");
})







