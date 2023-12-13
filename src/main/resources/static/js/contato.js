import { onScroll } from "./main.js";
import { Footer, Header } from "../components/index.js";

const header = document.querySelector("header");
const footer = document.querySelector("footer");
window.addEventListener("scroll", () => {
  onScroll(header);
});

header.innerHTML = Header();
footer.innerHTML = Footer();
