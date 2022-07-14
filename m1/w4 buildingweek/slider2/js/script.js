let sliders = document.querySelectorAll('.slider')

sliders.forEach(function(slider){

    let leftArrow = slider.querySelector('.control-left')
    let rightArrow = slider.querySelector('.control-right')

    leftArrow.addEventListener('click', function(){
        moveRight(slider)
    })
    rightArrow.addEventListener('click', function(){
        moveLeft(slider)
    })

})




function moveLeft(slider){
    
    let left = parseInt(slider.getAttribute('data-left'));
    let allSlides = slider.querySelectorAll('.wrapper img')
    let firstSlideWidth = allSlides[0].clientWidth//larghezza
    let sliderWidth = slider.clientWidth
    let space = Math.trunc(sliderWidth / firstSlideWidth) * firstSlideWidth
    
    let wrapper = slider.querySelector('.wrapper')
    
    if(left < allSlides.length * firstSlideWidth - space){
        left += space
    }else{
        left = 0
    }
    
    wrapper.style.marginLeft = - left + 'px'
    slider.setAttribute('data-left', left)
    
}

function moveRight(slider){
    
    let left = parseInt(slider.getAttribute('data-left'));
    let allSlides = slider.querySelectorAll('.wrapper img')
    let firstSlideWidth = allSlides[0].clientWidth
    let sliderWidth = slider.clientWidth
    let space = Math.trunc(sliderWidth / firstSlideWidth) * firstSlideWidth

    let wrapper = slider.querySelector('.wrapper')

    if(left > 0){
        left -= space
    }else{
        left = allSlides.length * firstSlideWidth - space
    }

    wrapper.style.marginLeft = - left + 'px'
    slider.setAttribute('data-left', left)

}