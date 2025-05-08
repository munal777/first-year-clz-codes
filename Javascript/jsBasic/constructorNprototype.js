
//-------constructor function------
function People(first,last,age)
{
    this.firstName  = first;
    this.lastName = last;
    this.age = age;
}

//-----with including topics like prototype----
//it is used for adding properties or method to objects

// console.log(typeof(Math()));


//-------RegExp()-------
// creating Using literal notation
let reg1 = /hello/;
console.log(typeof(reg1)); //return object
console.log(reg1);

// creating using RegExp constructor
const regex2 = new RegExp('Hello');
console.log(regex2);

const abc = 'hello world';
//test() which returns true or false based on whether the pattern matches.
console.log(reg1.test(abc));  //to check string contain match with regex or not

// exec() method searches for a match in a string 
console.log(reg1.exec(abc))

const myMother = new People('Himali','Shrestha',25);
myMother.Nation = 'Nepal'; //adding property to the object
console.log(myMother); 

// People.Language = 'English'; //adding properties to constructor cannot be done
console.log(new People('Munal','Poudel',21));

People.prototype.Language = 'English'; //we can add by using prototype function
console.log(myMother.Language);

const brother = new People('suresh','shrestha',21);
brother.hobby = 'football';

console.log('adding language by using prototype: ',brother.Language);

brother.Language = 'Nepali'; //changing language to nepali
People.prototype.phone = 'hello';
console.log(brother.phone);
People.prototype.display = function()
{
    return `I'm ${this.firstName} ${this.lastName} and age ${this.age}, ${this.Language}`;
}

console.log(brother.display());

console.log(brother.constructor); //return as [Function: People]

console.log(typeof(new Array())); // array are type of object
// new Object()   // A new Object object
// new Array()    // A new Array object
// new Map()      // A new Map object
// new Set()      // A new Set object
// new Date()     // A new Date object
// new RegExp()   // A new RegExp object
console.log(typeof(new Function())); // A new Function is type of functions
