// var myName = "Munal";
// var yourName = prompt("what is your name?");
// console.log(yourName);
// function test() {
//     //swaping value of a & b
//     var a = "3";
//     var b = "8";
//     var c = a;
//     a = b;
//     b = c;
//     console.log("a is "+a);
//     console.log("b is "+b);
// }

// test()

// let a,b,c;
// a = 5;
// b = 5;
// c = a+b;
// console.log('The sum of two numbers: '+c);

// let x;
// var y;
// x = 10;
// y = 20;
// z = x + y
// console.log(z);
// console.log('hello'+5); //print: hello5

// //automatically declared variables
// num1 = 2;
// num2 = 3;
// console.log(num1 + num2);


// const s = 12;  //const value cannot be changed
// // s = 23;  //type error
// let z = s; //but can be changed like this
// z = 23
// console.log(z);
// console.log('The value of const s: '+s)

// //------variable scope--------
// const t = 8;
// let r = s + t;
// console.log(r)

// // let carName = 'volvo';
// // let carName; //redeclare cannot be done.

// var carBrand = 'BMW';
// var carBrand = 1; //redeclare can be done
// console.log(carBrand);

// let num = 10;
// {
//     let num = 5; //it is block scope variable it cannot be access outside the block
//     var str = 'hi'; // it is global variable it can be access outside the block
// }
// console.log(num);
// console.log(str);

// // var name_ = "munal";
// // let name_ = "namita"; //not allowed syntaxError on runtime

// // college =  'IIC';
// // let college = 'IIC'; //Using a let variable before it is declared will result in a ReferenceError:
// // console.log(college)

// let numa = 'namita';
// numa = 'yogesh';
// console.log(numa);

// const pi = 3.14; // it should be initialized during declearing const
// // pi = 2;
// // console.log(pi)

// console.log(2**3);

// console.log(typeof(numa));


//---------Object Practice---------

// const std_details = {name:'Munal',age:21,collage:'IIC'};
// std_details.location = 'Dharan';

// console.log(std_details);

// console.log(std_details.name);

// let clz = {name:'IIc',location:'Itahari'};
// let x = clz.location;
// console.log(x);

// const namita = {};
// namita.mother = 'nisha';
// namita.father = 'nabin';

// console.log(namita)

// const person = new Object();
// person.name = function()
// {
//     firstname = 'munal';
//     lastname = 'poudel';
//     return firstname + " " + lastname;
// }
// person.age = 20;
// person.clz = 'Sion';

// // call the function
// console.log(person.name());

// const IIC = {};
// IIC.teacher = function()
// {
//     return 'munal poudel' + ", Namita Limbu."
// }
// console.log(IIC.teacher())
// // console.log(IIC)

// // var f_name = prompt('Enter your first name: ')
// // var l_name = prompt('Enter your last nameL: ')
// const std = {
//     firstname: 'munal',
//     lastname: 'poudel',
//     fullname: function()
//     {
//         return this.firstname + ' ' + this.lastname;
//     }
// }

// const c = std;

// console.log(c.fullname())


// Accessing a Property with an Expression
// const xyz = {age: 25}
// xyz.name = 'Munal'; 
// let a = 'age'
// let abc = xyz[a];
// console.log(abc)

// //using delete keyword to delete age properties from an objects
// delete xyz.age;  
// // delete xyz['name'];
// console.log(xyz);

// //nested objects
// const myobj = {
//     name: 'munal',
//     myCar: {
//         car1: 'ford',
//         car2: 'BMW',
//         car3: function()
//         {
//             return (this.car1 + " " + this.car2).toUpperCase()
//         }
//     }
// }
// console.log(myobj.myCar);
// //return the car 3 function
// console.log(myobj.myCar.car3())

// let text = "";

// for (let x in myobj)
// {
//     // text += x + " "; //return properties not values name & myCar
//     text += myobj[x] + ' '; //return values
// }
// console.log(text);

const person = {
    name: "John",
    age: 30,
    city: "New York"
  };

// creating a array from objects
const arr = Object.values(person)
const arr2 = Object.keys(person)

console.log(arr,arr2);

const entries = Object.entries(person); //return arrays of arrays

for (let x in entries)
{
    console.log(entries[x]); //return arrays by index
}

// lists = ""
// for (let [fruit, value] of entries)
// {
//     lists += fruit + ": " +  value + "\n";
// }
// console.log(lists);
 
        //----or-----
for (const [key, value] of Object.entries(person))
{
    console.log(`${key}: ${value}`);
}

// to convert a JavaScript object or value into a JSON string
const jsonString = JSON.stringify(person);
console.log(typeof(jsonString));
console.log(jsonString);

// console.log(JSON.stringify(null,true,'munal'));
console.log(JSON.stringify([true,'apple',null,undefined])); ///return array

//handling undefined,functionsand symbols
const obj = {1: undefined, 2: function(){}, 3:'Namita'}; 
console.log(JSON.stringify(obj)); //return only values

//using replacer 
const jsonstr = JSON.stringify(person, (key, value) => 
{
    if (key == 'age')
    {
        return undefined;
    }
    return value;
}
);
