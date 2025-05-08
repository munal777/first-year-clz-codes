//========creating new objects=========
// const employee = {
//     emp_name(name) {
//         return name;
//     },
//     company: 'Nepal Co.pvt'
// };

// console.log(employee.emp_name('Munal Poudel'));

// const munalPoudel = {
//     salary: 50000
// }

// const namita = {
//     salary: 10000,
//     company: 'B&C Hospital'
// }

// //adding employee object as a reference or prototype in munalPoudel object
// console.log(munalPoudel.emp_name('munal'), munalPoudel.salary);

// //adding empoloyee as a reference in namita 
// namita.__proto__ = employee;
// console.log(namita.emp_name('Namita'),'salary',namita.salary, 'in', namita.company);

//------------------------------------------------------------------------------

const users = {
    name1: {username: 'Munal Poudel'},
    2: {username: 'suresh Shrestha'},
    3: {username: 'Namita Limbu'},
    4: {username: 'Himali Shrestha'}
}

//way to access the propererties of object
// console.log(users['name1']);
// console.log(users.name1);

// let key = Object.keys(users);
// console.log(key); //return the array of keys
// key.forEach((each) => {
//     console.log(each);
// });

// console.log(Object.entries(users)); //return the nested array of keys & values pairs
// for(let [key,value] of Object.entries(users))
// {
//     console.log(`${key}. ${value.username}`);
// }


// for (let element in users) { //here element will be key
//     console.log(users[element]); //this is the only way to access properties of object while using loop
// }

//===assign method===
const target = {
    firstName: 'Munal',
    lastName: 'Poudel',
    age: 21
}

// Object.assign(target, source1, source2);
Object.assign(target,{firstName: 'Namita', lastName: 'Poudel', nationality: 'Nepal'}); //first parameter is the target and remaining will be the source
console.log(target);

//-------
const obj1 = {};
const sourceObj = {a: {b: 2}}
// console.log(sourceObj.a.b);
Object.assign(obj1,sourceObj);
obj1.a.b = 4; // target.a and source.a now refer to the same object
console.log(obj1.a.b); // This modifies the object that both target.a and source.a point t
console.log(sourceObj.a.b);

