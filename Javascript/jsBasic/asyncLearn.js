// const getData = (dataId, nextData) => {
//     setTimeout(() => {
//        console.log('Data:',dataId);
//     if(nextData) {
//         nextData();
//     }
//     },2000);
// };

// // =======this is called callback hell=======
// getData(12,() => {
//     console.log('data 1')
//     getData(10, () => {
//         getData(4, () => {
//             getData(7);
//         })
//     });
// });


// ========promise=======
// const getName = (firstName,national_id) => {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             console.log('Name:',firstName,'\nId no:',national_id);
//             resolve('successful');
//         },2000);
//     });
// };


// let result = getName('Munal',201);
// result.then((res) => {
//     console.log(res);
//     let result2 = getName('Namita',202);
//     result2.then((res) => {
//         console.log(res);
//     });
// });

//--better way in shortcut--
// getName('Munal',201).then((res) => {
//     getName('Namita',202).then(() => {
//         getName('Gaurab',203).then(() => {
//             console.log(res);
//         })
//     })
// })

//----also next way----
// getName('Gaurab',204)
// .then((res) => {
//     return getName('Munal',201);
// })
// .then((res) => {
//     return getName('Namita',101);
// })
// .then((res) => {
//     console.log(res);
// })

//===now with using async funtion and await===
// (async function myFunc() {
//     await getName('Munal',201);
//     await getName('Suresh',202);
//     await getName('Namita',205);
// })();
// --------------------------------------------------

// //---using promise with having 2 function inside then---
// const getData = (data) => {
//         return new Promise((reslove, reject) => {
//             setTimeout(() => {
//             if (getData > 0 )
//             {
//                 console.log('Data:', data);
//                 reslove('Sucess');
//             }
//             else {
//                 console.log('Data cannot be Negative.')
//                 reject('Error Data');
//             } 
//         },10000);  
//     });
// }

// //--using then with resolve and reject function
// getData(12).then(
//     function(value) {
//         console.log(value);
//     },
//     function(reject) {
//         console.log(reject);
//     }
// )




//====recall====
const users = {
    1: {username: 'Munal Poudel'},
    2: {username: 'suresh Shrestha'},
    3: {username: 'Namita Limbu'},
    4: {username: 'Himali Shrestha'}
}

// //---first with callback---
// function getUserDetails(userId, nextUserId) {
//     setTimeout(() => {
//         console.log(userId);

//         if(nextUserId) {
//             nextUserId();
//         }
//     },2000);
// }

// getUserDetails(users[1], () => {
//     getUserDetails(users[2], () => {
//         getUserDetails(users[3], () => {
//             getUserDetails(users[4]);
//         })
//     })
// })

//---now with promise----
function getUserDetails(userId) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log(userId);
            resolve('Success');
        },2000)    
    })
}

// getUserDetails(users[1]).then(() => {
//     getUserDetails(users[2]).then(() => {
//         getUserDetails(users[3]).then((res) => {
//             getUserDetails(users[4]).then((res) => {
//                 console.log(res);
//             })
//         })
//     })
// })
//---shortcut for these---
// getUserDetails(users[1])
// .then(() => {
//     return getUserDetails(users[2]);
// })
// .then(() => {
//     return getUserDetails(users[3]);
// })
// .then(() => {
//     return getUserDetails(users[4]);
// })
// .then((res) => {
//     return console.log(res);
// })


//--finally now from async function---
(async function passdata() {
    await getUserDetails(users[1]);
    await getUserDetails(users[2]);
    await getUserDetails(users[3]);
    await getUserDetails(users[4]);
})();
