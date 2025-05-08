const background = document.querySelector('body');
background.style.backgroundColor = 'gray';

const button = document.createElement('button');
button.innerText = 'Click me';
document.body.appendChild(button);


const countryList = ['nepal','india','china','usa','bhutan'];
const select = document.createElement('select');
document.body.appendChild(select);

for (let country in countryList)
{
    const options = document.createElement('option');
    options.innerText = countryList[country];
    options.value = countryList[country];
    if (countryList[country] == 'usa'){
        options.selected = true;
    }
    select.append(options);
}

let para = document.createElement('p');
document.body.appendChild(para);

select.addEventListener('change', () => {
    const selectedCountry = select.value;
    para.innerText = `${selectedCountry} is selected`;
})

window.addEventListener('load', () => {
    const selectedCountry = select.value;
    para.innerText = `${selectedCountry} is selected`;
})

button.addEventListener('click', () => {
    background.style.backgroundColor = 'black';
    background.style.color = 'white';
})