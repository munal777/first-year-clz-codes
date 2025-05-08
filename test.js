function initBadge() {
    const arr = [];
    fetch("https://jsdemo-3f387-default-rtdb.europe-west1.firebasedatabase.app/notifications/new.json")
    .then((response) => response.json())
    .then(data => 
    {
        arr.push(data);
    })
    console.log(arr)
}

// Sample usage - do not modify
initBadge();