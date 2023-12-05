var maxCount =40;

const counter = document.querySelector('.cointaner .counter');

const limitedTextarea = document.querySelector('.limited-textarea');

limitedTextarea.addEventListener('keydown', function(e) {
    maxCount = maxCount - 1;
    counter.innerHTML = maxCount;
})
