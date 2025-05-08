const arr = ['a','b','c','d','e']
const person = {fname:"John", lname:"Doe", age:25};

//---use of for of loop---
for (let x of arr)
{
    console.log(x);
}
//--use of for in loop---
for (let x in person)
{
    console.log(person[x])
}


//====object entries====
const entries = Object.entries(person)
console.log(entries)

const map = new Map(Object.entries(person));
console.log(map);

for (const [key, value] of Object.entries(person))
{
    console.log(`${key}: ${value}`);
}

const car = ["BMW", "Volvo", "Saab", "Ford"];
let i = 0;
while (car[i])
{
    console.log(car[i])
    i++;
}

for (let x of car)
{
    if (x == 'BMW')
    {
        console.log('Yes, I am in.');
    }
}
let grow = 0
for (let x in person)
{
    if (person[x] != 'munal')
    {
        grow += 1
        console.log(`${grow}, Bye`)
    }
}

function myFunction(msg,n)
{
    return msg * n;
}

console.log(myFunction('munal',3)); //string and num can not be multiple

const arrow_function_variable = (x,y) =>
{
    return x ** y;
}

console.log(arrow_function_variable(2,3));
console.log(typeof(arrow_function_variable)); //type will be function

