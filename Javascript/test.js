// let largest_element = (arr,n) =>
// {
//     let max_value = n
//     for (let each of arr)
//     {
//         if (max_value < each)
//         {
//             max_value = each;
//         }
//     }
//     return max_value;
// }

// const arr = [4, 7, 8, 16, 7, 6];
// let n = 6;
// console.log(largest_element(arr,n));

// const img_arr = ["/DOM/img2.jpg","/DOM/img3.jpg","/DOM/img4.jpg"];

// // for(let i of img_arr)
// // {
// //     console.log(`"${i}"`);
// // }

// img_arr.forEach((current,index) => {
//     console.log(index+1 +". "+ current);
// });

// const arr = [23,21,12,34];


// const comChoice = () => {
//     return Math.floor(Math.random() * 3);
// }

// console.log(comChoice());

// var createCounter = function(n) {
    
//     return function() {
//         const arr = []
//     };
// };

// let n = 10
// let calls = ["call","call","call"]

// const createCounter2 = (n) => {
//     return () => {
//         return n++
        // let l = calls.length
        // const arr = []
        // for (let i = 0; i<l; i++)
        // {
        // arr.push(n++)
        // }
        // return arr;
//     }
// }

// const count = createCounter2(n)
// console.log(count());
// for (let i=0; i<11; i++)
// {
// console.log(count());
// }

// var map = function(arr, fn) {
//     let nums = []
//     arr.forEach((element,index) => {
//         nums.push(fn(element,index))
//         console.log(index)
//     });
//     return nums
// };

const arr = [2,4,54,21]
// const myFunc = function() {
//     const arr_ = arr.filter(value => value > 20)
//     const arr2_ = arr.map(value => value * 2)
//     return arr2_
// }
// console.log(myFunc())

const fn = function(n,i) {
    return n + i
} 

// const filter = function(arr, fn) {
//     let arr_ = []
//     arr.forEach((element) => {
//         if (fn(element)) {
//             arr_.push(element)
//         }
//     });
//     return arr_
// };

// console.log(filter(arr,fn));

// var reduce = function(nums, fn, init) {
//         let result = init
//         for(let i of nums) {
//             result = fn(result,i)
//         }
//         return result
// };

// const nums = [1,2,3,4]
// let init = 0
// console.log(reduce(nums,fn,init))

// const array = [1,2,3,4,5];
// let hello = array.forEach((item) => {
//     return item
// })

// console.log(hello)


// const arrrys = [2,3,4,5,7,8,10];

// arrrys.forEach(lists);

// function lists(eachs) {
//     console.log(eachs);
// };



// const new_list = arrrys.filter(each => each %2 == 0);
// console.log(new_list);





// const random_array = [2,4,6,78,9,19,20,27,8];

// const sumed =  random_array.reduce((pervious, current) => pervious+current, 0);
// console.log(sumed);


// const addNum = function (a,b) {
//     return a + b
// }

// console.log(addNum(2,4))


// const subNum = (a,b) => {
//     return a - b
// }

// console.log(subNum(2,1))

// function mulNum (a,b) {
//     let abc = a*b

//     function squareMul() {
//         return abc*abc
//     }
//     return squareMul();
// }

// console.log(mulNum(2,3))



//destructing = extrating the value of array and objects in variables.

// const x = {
//     a: 1,
//     b: 2,
//     c: 3
// }

// const {a,b,c} = x

// console.log(a)


// const z = [1,2,3,4]

// const [r,s, ...t] = z

// console.log(t)


// const sumNum = (a) => {
//     return () => {
//         return a + 5;
//     }
// } 

// const num = sumNum(2);
// console.log(num())



const names = ['munal', 'namita', 'numa', 'gaurab'];

const new_name = names.map(values => (values))

console.log(new_name)