const countryList = {
    "AFN": "AF",
    "ALL": "AL",
    "DZD": "DZ",
    "EUR": "AD",
    "AOA": "AO",
    "ARS": "AR",
    "AMD": "AM",
    "AUD": "AU",
    "AZN": "AZ",
    "BSD": "BS",
    "BHD": "BH",
    "BDT": "BD"
}

let countryLi = document.querySelectorAll('.country');
let para = document.querySelector('.para');


for (let select of countryLi)
{
    for (let currency in countryList)
    {
        let newOption = document.createElement('option');
        newOption.innerText = currency;
        newOption.value = currency;
        if (select.name === 'country' && currency === 'DZD')
        {
            newOption.selected = true;
        }
        select.append(newOption);
    }
    select.addEventListener('change',(event) => {
        para.textContent = `Currency Name:, ${event.target.value}`;
    })
}


// for input
const inputFunction = () => {
    let input = document.querySelector('.container input');
    let inputPara = document.querySelector('.inputpara');
    let inputValue = input.value;
    inputPara.textContent = `You entered: ${inputValue}`;
}

let btn = document.querySelector('.btn');
btn.addEventListener('click',()=> {
    inputFunction();
})



