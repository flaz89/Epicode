// Con il bottone TOGGLE mostro e nascondo le sezioni

const toggleBtn = document.querySelectorAll(".toggle-button");
const sectionContainer = document.querySelectorAll(".section-container");
const divFlexRow = document.querySelectorAll("div.flex-row");



    for (let i = 0; i < toggleBtn.length; i++){

        toggleBtn[i].addEventListener("click", function() {

            sectionContainer[i].classList.toggle("d-none");

        if (sectionContainer[i].classList.contains("d-none")) {
            toggleBtn[i].textContent = "Mostra";
            toggleBtn[i].classList.add("bg-agency", "border-0");
            divFlexRow[i].classList.add("border-bottom");
        } else {
            toggleBtn[i].textContent = "Nascondi";
            toggleBtn[i].classList.remove("bg-agency", "border-0");
            divFlexRow[i].classList.remove("border-bottom");
        }
        })
    }
    

// ALERT che avverte quanti viaggi sono disponibili

const numViaggi = document.getElementsByClassName("card");

alert(`Sono rimasti disponibili ${numViaggi.length} viaggi! AFFRETTATI!`);


// aggiunta delle patch/CUORI alle card

const cardWelcomeSummer = document.getElementsByClassName("heart");
const heart = document.createElement(`svg`)
heart.innerHTML = `<svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" fill="red"
class="bi bi-heart-fill " viewBox="0 0 16 16">
<path fill-rule="evenodd"
    d="M8 1.314C12.438-3.248 23.534 4.735 8 15-7.534 4.736 3.562-3.248 8 1.314z" />
</svg>`;
console.log(heart);

for (let i = 0; i < cardWelcomeSummer.length; i++) {
    cardWelcomeSummer[i].appendChild(heart);
}
