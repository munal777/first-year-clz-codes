// let text = `I'm "Munal Poudel."`;  //template string
// console.log(text.length);

// let text2 = `
// hello namita
// how are you`;
// console.log(text2)

const fruits = ["Banana", "Orange", "Apple", "Mango"];

let x = fruits.toString();
console.log(x);
// for (let i = 0; i < fruits.length; i++)
// {
//     console.log(fruits[i]);
// }

//adding new element
fruits.push('Mango');

fruits[6]  = 'john'

fruits.forEach(fruits_function)

function fruits_function(value, index)
{
    console.log(`${index + 1}. ${value}`)
}

const points = new Array(29); //return [ <29 empty items> ] when there is single items by this way
console.log(points)

//----array check------
let a = Array.isArray(fruits)
console.log(a)

console.log(points instanceof Array)

const arr = ['apple',22,'banana',21]
let abc = arr.toString(); //converting array to string
let z = arr.join(' * ')
console.log(abc)
console.log(z)


//remove last element
let pop_item = arr.pop() //pop_item will print the remove items
console.log(pop_item);


let length = arr.push(0,'hello'); //push will add item at last index and variable will return new length
console.log(arr);
console.log('len of new arry: ',length)

console.log(`char at: `,arr.at(1)); //using at function

const name = ['munal','suresh','namita','numa'];
let w = name.shift();//removng first element
console.log('remove first element: ',w);
console.log(name.length)

let len = name.unshift('gaurab'); //adding first element
name[name.length] = 'ohhno'
console.log('len of after unshift: ',len,'array: ',name)

const concat_array = name.concat(arr);
console.log(concat_array)

//
// const copy_arr = [1,14,23,21,1]
// copy_arr.copyWithin(1,arr.length-1) //first parameter index value will be change by second inserted indes
// console.log(copy_arr);

// let index = copy_arr.findIndex(23);
// console.log(index)