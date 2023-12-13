
export const CardHome = ({title, imgname, imgnum }) => {
    
    return `
    <div class="gallery-item" aria-label="${imgname}">
        <h5 class="gallery-title">${title}</h5>
        <img src="../assets/home/${imgname}Vert.jpg" alt="Foto ${imgnum}" width="640" height="1080" id="cardimg${imgnum}">
    </div>
    `
}
