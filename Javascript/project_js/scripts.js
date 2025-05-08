// const myBtn = document.querySelector('#myBtn');
// const myImg = document.querySelector('#myImg');

// myBtn.addEventListener('click', () => {
//     if (myImg.style.visibility == 'hidden') {
//         myImg.style.visibility = 'visible';
//     }
//     else {
//         myImg.style.visibility = 'hidden';
//     }
// })


const people = [
    { name: "Alice", age: 25 },
    { name: "Bob", age: 17 },
    { name: "Charlie", age: 30 }
];


for (let abc of people) {
    console.log(abc.name);
}

const arr = [1,2,3,4]

const sumed = arr.reduce((previousValue, currentValue) => {
    previousValue[currentValue] = (previousValue[currentValue] || 0) + 1;
    return previousValue
}, {} )

console.log(sumed);