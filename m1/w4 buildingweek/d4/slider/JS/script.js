
/* Per ogni slider scatena la funz 

       variabile leftArrow = cerca dentro a slider il  pulsante left (control left)
        variabile righttArrow = pulsante right

        se clicchi su leftArrow, muovi lo slider verso destra.

        se clicchi su righttArrow, muovi lo slider verso sinistra. 


*/

let left = 0;

function moveLeft(){

    let allSlides = document.querySelectorAll('#slider .wrapper img')
    let firstSlideWidth = allSlides[0].clientWidth
    let sliderWidth = document.querySelector('#slider').clientWidth
    let space = Math.trunc(sliderWidth / firstSlideWidth) * firstSlideWidth

    let wrapper = document.querySelector('#slider .wrapper')

    if(left < allSlides.length * firstSlideWidth - space){
        left += space
    }else{
        left = 0
    }

    wrapper.style.marginLeft = - left + 'px'

}

function moveRight(){

    let allSlides = document.querySelectorAll('#slider .wrapper img')
    let firstSlideWidth = allSlides[0].clientWidth
    let sliderWidth = document.querySelector('#slider').clientWidth
    let space = Math.trunc(sliderWidth / firstSlideWidth) * firstSlideWidth

    let wrapper = document.querySelector('#slider .wrapper')

    if(left > 0){
        left -= space
    }else{
        left = allSlides.length * firstSlideWidth - space
    }

    wrapper.style.marginLeft = - left + 'px'

}