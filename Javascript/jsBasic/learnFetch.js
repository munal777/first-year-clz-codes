// const URL = 'https://cat-fact.herokuapp.com/facts';

const btn = document.querySelector('.fact-btn');
const facts = document.querySelector('.facts');

// const getFacts = async () => {
//     let respone = await fetch(URL);
//     let data = await respone.json();
//     let num = Math.floor(Math.random() * 5);
//     facts.innerText = (data[num].text);
// }


//---doing it by promises---
// function getFacts() {
//     fetch(URL)
//     .then((response) => {
//        return response.json();
//     })
//     .then((data) => {
//         let num = Math.floor(Math.random() * 5);
//         facts.innerText = data[num].text;
//     });
// }

// ===== making a post request=====
// const postFacts = async () => {
//     const response = await fetch(URL, {
//         method: 'Post',
//         body: JSON.stringify('datas'),
//         headers: {
//             'Content-Type': 'application/json'
//         }
//     })  
// }


//====using another api====
const URL = 'https://dog.ceo/api/breeds/image/random';

const getPhotos = async () => {
    let response = await fetch(URL);
    let data = await response.json();
    facts.innerHTML = `<img src=${data.message} width="300" height="200" style="border-radius: 10px; box-shadow: 0px 4px 6px rgba(0,0,0,0.1);">`;
    // facts.innerText = (data.message.australian);
}

getPhotos();



// btn.addEventListener('click',getFacts);
btn.addEventListener('click',getPhotos);