const baseUrl = "https://v6.exchangerate-api.com/v6/271e4b1b815589b4da5fd485/latest/";
const fromCurrency = document.querySelector('.from select');
const toCurrency = document.querySelector('.to select');
const dropDown = document.querySelectorAll('.dropdown select');
let btn = document.querySelector('form button');

for (let select of dropDown) {
    for (let currCode in countryList) {
        let newOption = document.createElement('option');
        newOption.innerText = currCode;
        newOption.value = currCode;
        if(select.name === 'from' && currCode === 'USD')
        {
            newOption.selected = 'selected';
        }
        else if (select.name === 'to' && currCode === 'NPR') 
        {
            newOption.selected = 'selected';
        }
        select.append(newOption);
    }
    select.addEventListener('change', (evt) => {
        updateFlag(evt.target);
    })
}


const updateFlag = (element) => {
    let Currcode = element.value;
    let Countrycode = countryList[Currcode];
    let newSrc = `https://flagsapi.com/${Countrycode}/flat/64.png`;
    let img = element.parentElement.querySelector('img');
    img.src = newSrc;
}

const updateExchangeRate = async () => {
    let amount = document.querySelector('#enter-amt');
    let amountValue = amount.value;

    if (amountValue === '' || amountValue < 1)
    {
        amountValue = 1;
        amount.value = '1';
    }

    let response = await fetch(`${baseUrl}${fromCurrency.value}`);
    let data = await response.json();

    let exc_rate = data.conversion_rates[toCurrency.value];
    let final_amt = amountValue * exc_rate;
    let msg = document.querySelector('.msg');
    msg.innerText = `${amountValue} ${fromCurrency.value} = ${final_amt} ${toCurrency.value}`;
}

btn.addEventListener('click', async (evt) => {
    evt.preventDefault();
    updateExchangeRate();
});

window.addEventListener('load', () => {
    updateExchangeRate();
});
