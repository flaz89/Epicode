const randomNum = () => {
    return Math.floor(Math.random() * 100) + 1;
};
const result = (desk, player1, player2) => {
    const difference1 = Math.abs(desk - player1);
    const difference2 = Math.abs(desk - player2);
    if (player1 === desk && player2 === desk) {
        console.log(`Entrambi i giocatori hanno indovinato con il numero ${desk}`);
    }
    else if (player1 === desk) {
        console.log(`Il giocatore 1 ha indovinato il numero ${player1}`);
    }
    else if (player2 === desk) {
        console.log(`Il giocatore 2 ha indovinato il numero ${player2}`);
    }
    else if (difference1 > difference2) {
        console.log(`Il giocatore 2 si è avvicinato di più con il numero ${player2}`);
    }
    else if (difference1 < difference2) {
        console.log(`Il giocatore 1 si è avvicinato di più con il numero ${player1}`);
    }
};
console.log();
const deskNumber = randomNum();
console.log(`Il banco gira ${deskNumber}, il player1: ${33} e il player1: ${77}`);
result(deskNumber, 33, 77);
