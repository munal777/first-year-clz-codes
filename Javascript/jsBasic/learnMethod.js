const list = [2,3,4,3,1,4,23,24,35,36]

// let abc = list.filter(a => a % 2 == 0)
// console.log(abc)

// let xyz = list.map(a => a * 3)
// console.log(xyz)

// let sum = list.reduce((previousVal,currentVal) => previousVal + currentVal,0)
// console.log(sum)

const obj = list.reduce((pre,cur) => {
    pre[cur] = (pre[cur] || 0) + 1;
    return pre;
},{})
console.log(obj)

//----obj----
const fruits = { apple: 3, orange: 2 }
// console.log(Object.entries(fruits)) //return array of key-value pairs

// for (let [key,value] of Object.entries(fruits)) {
//     console.log(`${key}: ${value}`)
// }
// fruits['mango'] = 1
// fruits.kiwi = 1
// delete fruits.apple
// console.log(fruits)
// console.log((fruits.mango || 0))

const sourceFruit = {grapes: 2, banana: {kera: 2}}

Object.assign(fruits,sourceFruit)
fruits.banana.kera = 5
console.log(fruits)
console.log(sourceFruit)
