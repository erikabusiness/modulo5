import { navLinks } from "../constants/data.js";

export const Header = () => {
  let btns = "";
  navLinks.map(({ text, page }) => {
    btns += `
      <li class="nav-item"> 
        <a class="nav-link active" href="${page}">${text}</a> 
      </li>`;
  });

  return `
    <h1>The <span>Discoverer</span> Experience</h1>
    <p>Start exploring the best places in the entire world!</p>
    
    <nav>
      <ul class="nav nav-pills justify-content-center">
        ${btns}
        <li class="nav-item"> 
          <a class="nav-link active" href="/reserva">Cadastros</a> 
        </li>
      </ul>
    </nav>
  `;
};
