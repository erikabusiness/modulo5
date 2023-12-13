
export function showGif(idNumber, imgName) {
    const img = document.querySelector(`#cardimg${idNumber}`)
    img.src = `../assets/home/gif${imgName}.gif`
}

export function hideGif(idNumber, imgName) {
    const img = document.querySelector(`#cardimg${idNumber}`)
    img.src = `../assets/home/${imgName}Vert.jpg`
}


