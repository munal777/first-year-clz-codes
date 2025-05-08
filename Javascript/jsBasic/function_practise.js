// let count_str = 0;
// const vowel_check = (str) => {
//     const vowel_list = ['a','e','i','o','u']

//     for (each of str) 
//     {
//         if (vowel_list.includes(each.toLowerCase()))
//         {
//             count_str++;
//         }
//     }
//     return count_str;
// } 


// //callback function usage
// let str = 'IloveyOu';
// console.log(vowel_check(str));

// str.split('').forEach((element) => {
//     console.log(element);
// });

// let array_str = str.split('')
// console.log(array_str);

// array_str.forEach(
//     (each_value) => 
//     {
//         console.log(each_value);
//     }
// );

// my_arr = [2,3,4,5]

// my_arr.forEach((value,index) =>
// {
//     console.log(`${index+1}. ${value * value}`);
// });


// let nums = [45,21,2]
// const square = (element) => 
// {
//     console.log(element)
// }
// nums.forEach(square);



// const abc = my_arr.map((val) =>
//     {
//        return  val ** 2;
//     });

// console.log(abc)

// nums.forEach((value) =>
// {
//     console.log(value ** 2);
// });

// //===function expression in js===
// //first 3 is argument and last is body always
// const myFunction = new Function("a","c", "b", "return a * b * c");
// console.log(myFunction(2,3,5));

// let arrow_function = (a,b) => 
// {
//     return  a ** b;
// }

// console.log(arrow_function(2,5))

// //----map return new array-----
// const my_arr_ho = [2,4,6,3]
// const new_arr = my_arr_ho.map(function (val)
// {
//     return val *2;;
// });
// console.log(new_arr);

// const even_arr = my_arr_ho.filter(val =>
// {
//     return val  % 2 == 0;
// }
// );

// console.log(even_arr);

// //====reduce method===
// const arr = [2,4,6,5]

// const total_sum = arr.reduce((res, curr) =>
// {
//     return res + curr;
// });

// const max_value = arr.reduce((prev, curr) =>
// {
//     // if (prev < curr)
//     // {
//     //     return curr;
//     // }
//     // return prev;

//     //--shortcut using ternary operator--
//     return prev < curr ? curr : prev;
// });

// console.log(total_sum);
// console.log(max_value);

// const std_mark = [20,42,12,35,45,32]

// let filer_mark = std_mark.filter((val) =>
// {
//     if (val > 30)
//     {
//         return val;
//     }
// });
// console.log(filer_mark);


// // let n = prompt('enter a N: ');
// // let arr_of_n = [];
// // for (let i=1; i <=n; n++)
// // {
// //     arr_of_n[i-1] = i;
// // }
// // console.log(arr_of_n);

// const sum_mul = std_mark.reduce((prev, curr) =>
// {
//     prev.sum += curr;
//     prev.mul *= curr;
//     return prev;
// },{sum: 0, mul: 1});
// console.log(sum_mul.sum, sum_mul.mul);

// const mul = std_mark.reduce((prev, curr) =>
// {
//     return prev * curr;
// });
// console.log(mul)


// //creating sets 
// const sets = new Set([])
// sets.add('a')
// sets.add('b')
// sets.add('c')
// sets.add('a')

// console.log(sets);

// if (sets instanceof Set)
// {
//     console.log(true)
// }

// const myIterator = sets.entries();
// let ourIterator = sets.keys();
// console.log(myIterator);

// for (let i of myIterator)
// {
//     console.log(i);
// }


//----map---
const fruit = new Map();
fruit.set('a',100);
fruit.set('b',200);
fruit.set('c',90);
fruit.set('a',90);

fruit.forEach((val, key) =>
{
    console.log(`${key}: ${val}`);
});

for (let x of fruit.entries())
{
    console.log(x);
}




//--converting into objects----
const obj_fruit = Object.fromEntries(fruit);
let entries = Object.entries(obj_fruit);
console.log(entries);

entries.forEach(([key,val]) =>
{
    console.log(key + ' ' + val);
});

//-- it will be type error by using like this in object it work only in map
// for (let x of obj_fruit.entries())
//     {
//         console.log(x);
//     }

