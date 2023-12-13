export const CardsPacotes = ({img, title, days, services, numOfPeople, text, oldPrice, newPrice}) => {
 return `
 <div class="col">
              <div class="card">
                <img src="../assets/promoções/${img}.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">${title}</h5>
                  <li>${days}</li>
                  <li>${services}</li>
                  <li>${numOfPeople}</li>
                  <p class="card-text">${text}</p>
                  <div class="promo-badge">PROMOÇÃO</div>
                  <div class="price">
                    <span class="old-price">R$ ${oldPrice}</span> <!-- Preço antigo (antes da promoção) -->
                    Preço: <span class="final-price">R$ ${newPrice}</span> <!-- Preço final (em promoção) -->
                    </div>
                </div>
              </div>
            </div>
`
}