import { onScroll } from "./main.js";
import { Header, Footer, CardsPacotes } from "../components/index.js";
import { pacotes } from "../constants/data.js";

const header = document.querySelector("header");
const footer = document.querySelector("footer");
const divNacionais = document.querySelector("#nacionais");
const divInternacionais = document.querySelector("#internacionais");
window.addEventListener("scroll", () => {
  onScroll(header);
});

header.innerHTML = Header();
pacotes.map((pacote) => {
  if (pacote.type === "nacional") {
    divNacionais.innerHTML += CardsPacotes(pacote);
  } else {
    divInternacionais.innerHTML += CardsPacotes(pacote);
  }
});
footer.innerHTML = Footer();
