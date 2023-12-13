import { onScroll } from "./main.js";
import { CardsDestino, Footer, Header } from "../components/index.js";
import { cardsDestinos } from "../constants/data.js";

const header = document.querySelector("header");
const cardsContainer = document.querySelector("#cardsContainer");
const footer = document.querySelector("footer");

window.addEventListener("scroll", () => {
  onScroll(header);
});

header.innerHTML = Header();
cardsDestinos.map((destino) => {
  cardsContainer.innerHTML += CardsDestino(destino);
});

footer.innerHTML = Footer();
