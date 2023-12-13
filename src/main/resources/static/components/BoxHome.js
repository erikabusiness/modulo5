export const BoxHome = ({title, content, name}) => {
    return `
    <div class="card border-black card-transparent m-2" style="max-width: 18rem;">
        <div class="card-header bg-transparent border-success">⭐⭐⭐⭐⭐</div>
            <div class="card-body text-success">
                <h5 class="card-title">${title}</h5>
                <p class="card-text">"${content}"</p>
            </div>
        <div class="card-footer bg-transparent border-success"><strong>${name}</strong></div>
  </div>
    `

}