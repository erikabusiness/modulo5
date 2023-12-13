import { onScroll } from "./main.js";
import { BtnsHome, CardHome, BoxHome, Footer, Header } from "../components/index.js";
import { btnsHome, cardHome, boxHome } from "../constants/data.js";

const header = document.querySelector("header")
const divCardHome = document.querySelector("#cardsHome")
const divBtnsHome = document.querySelector("#btnsHome")
const footer = document.querySelector("footer")



//alternar entre jpg e gifs
window.addEventListener("scroll", () => {
  onScroll(header);
});

header.innerHTML = Header();

cardHome.map((destino) => {
  divCardHome.innerHTML += CardHome(destino)     
})

btnsHome.map((botao) => {
  divBtnsHome.innerHTML += BtnsHome(botao)
})

//cards da home
const cards = document.querySelectorAll(".gallery-item")
cards.forEach((card, i) => {
  const imgName = card.ariaLabel
  const img = card.querySelector(`#cardimg${i + 1}`)

  img.addEventListener("mouseover", () => {
    img.src = `../assets/home/gif${imgName}.gif`
  })

  img.addEventListener("mouseout", () => {
    img.src = `../assets/home/${imgName}Vert.jpg`
  })
})

//data atual home
export function atualizarData() {
  const dataAtual = new Date();
  const elementoData = document.getElementById('atualdate');
  elementoData.textContent = dataAtual.toLocaleString();
}
window.addEventListener('load', atualizarData);

//boxes do banner home
const boxesHome = document.querySelector('.boxes-container')
boxHome.map((box) => {
  boxesHome.innerHTML += BoxHome(box)
})

// footer
footer.innerHTML = Footer()