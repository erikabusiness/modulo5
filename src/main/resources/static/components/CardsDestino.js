export const CardsDestino = ({img, title, text}) => {
    return `
    <div class="card mb-3">
            <img src="../assets/destinos/${img}.jpg" class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">${title}</h5>
              <p class="card-text">
                ${text}
              <p class="card-text">
                <small class="text-body-secondary">
                    <a href="#">🛫 Passagens aéreas</a>
                    <a href="#">🏨 Hotéis</a>
                    <a href="#">🚗 Aluguel de carros</a>
                </small>
            </p>
            </div>
          </div>
    `
}