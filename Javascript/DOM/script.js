//using innerText it only get or set the text 
// let change_heading = document.querySelector('h1').innerText = 'let not start our journey!';

//innerHTML can change the text and element
let change_heading = document.querySelector('h1').innerHTML = 'let <del style="color: black;"><span style="color: white;">not</del> start our journey!';

let paragraph = () =>
{
    let p = 'hello this the info!';
    document.getElementsByClassName("demo")[0].innerHTML = p;
}
document.getElementById('1').onclick = paragraph;

function alert_fun() 
{
    let age = prompt(('what is your age?'));
    if (age > 18)
{
    alert('You are in..')
}
else
{
    alert('You are out..')
}

let info = `your age is ${age}`;
document.getElementsByClassName('demo')[1].innerHTML = info;
}

function change_bc()
{
    const change_bc = document.getElementsByTagName('body')[0];
    change_bc.style.backgroundColor = 'lightblue';
}

//adding funtion to display the heading 2
function dis_heading() {
    document.getElementsByClassName('heading2')[0].style.display = 'block';
}

//now working with attribute and img to be change when btn clicked 
let imgcounter = 0;
function change_img() {
    const img_arr = ["/DOM/img2.jpg","/DOM/img3.jpg","/DOM/img4.jpg","/DOM/img1.jpg"];
    
    //by attributes
    document.getElementById('img1').src = img_arr[imgcounter];

    imgcounter++;

    if (imgcounter == img_arr.length)
    {
        imgcounter = 0;
    }
}

//changing attribute name 
function change_attribute() {
    let element = document.querySelector('.oldAttribute');
    element.setAttribute('class','newAttribute');
}

//-----adding new element in the page by using js------

//append will be added at last
let newBtn = document.createElement('button');
newBtn.innerText = 'click me!';
let div_ = document.getElementsByClassName('js_div')[0];
div_.append(newBtn);

//prepend will be added at first
let para = document.createElement('p');
para.innerHTML = 'Alternatively, you can move your script tag to the end of the body to ensure the DOM is fully loaded before the script runs';
document.getElementsByClassName('js_div')[0].prepend(para);
para.style.color = 'white';

//before will add before the node
let list = document.createElement('ul');
list.innerHTML = '<li>number 1</li> <li>number 2</li>';

document.getElementsByClassName('js_div')[0].before(list);

//styleing it
document.getElementsByClassName('js_div')[0].style.backgroundColor = 'black';
document.getElementsByClassName('js_div')[0].style.padding = '30px';
document.getElementsByClassName('js_div')[0].style.textAlign = 'center';
