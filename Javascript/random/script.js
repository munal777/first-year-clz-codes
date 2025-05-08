//color changing mode
let color_mode = document.createElement('button');
color_mode.innerText = 'mode change';
document.querySelector('body').prepend(color_mode);
color_mode.setAttribute('id','theme');

document.getElementById('theme').addEventListener('click', () => {
    
    let background = document.querySelector('body');
    let h1 = document.querySelector('h1');

    if (background.style.backgroundColor == 'black') {
        background.style.backgroundColor = 'white';
        h1.style.color = 'black';
    }
    else {
        background.style.backgroundColor = 'black';
        h1.style.color = 'white';
    }
});

//adding heading in the body and styling it
let heading = document.createElement('h1');
let heading_text = heading.innerText = 'Munal Poudel';
heading.setAttribute('id','main-heading');
document.querySelector('body').append(heading);

document.getElementsByTagName('h1')[0].style.textAlign = 'center';

//adding img below heading
let image = document.createElement('img');
image.src = "/DOM/img4.jpg";
image.setAttribute('class','img-1');
document.querySelector('#main-heading').prepend(image);

document.querySelector('.img-1').style.width = '250px';
document.querySelector('.img-1').style.height = '350px';
document.querySelector('.img-1').style.objectFit = 'cover';
document.querySelector('.img-1').style.display = 'block';
document.querySelector('.img-1').style.margin = '0 auto';
document.querySelector('.img-1').style.marginBottom = '20px';

let linebreak = document.createElement('br');
document.querySelector('#main-heading').append(linebreak);

//creating bottom to change the image
let btn_1 = document.createElement('button');
btn_1.innerText = 'change Image';
document.getElementById('main-heading').append(btn_1);

let imgindex = 0;
btn_1.addEventListener('click',function change_img() {
    const arr = ["/DOM/img2.jpg","/DOM/img4.jpg"];

    image.src = arr[imgindex];

    imgindex++;

    if (imgindex == arr.length)
    {
        imgindex = 0;
    }
});

// btn_1.setAttribute('onclick','change_img()');


