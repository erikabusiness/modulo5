import { Footer } from "../components/Footer.js"
import { Header } from "../components/Header.js"
import { Select } from "../components/Select.js"
import { onScroll } from "./main.js"

const header = document.querySelector("header")
const select =  document.querySelector("#select")
const footer = document.querySelector("footer")

select.innerHTML = Select()

window.addEventListener("scroll", () => {
  onScroll(header);
});

header.innerHTML = Header();

const selectRoutes = document.querySelector("#routes")

selectRoutes.addEventListener("change", () => {
	window.location = `${selectRoutes.value}`
})

footer.innerHTML = Footer()