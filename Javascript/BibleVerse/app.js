const baseURL = "https://cdn.jsdelivr.net/gh/wldeh/bible-api/bibles/";
// ${version}/books/${book}/chapters/${chapter}/verses/${verse}.json
// "https://cdn.jsdelivr.net/gh/wldeh/bible-api/bibles/${version}/books/${book}/chapters/${chapter}.json"

const version = 'en-asv';

function getVerse() {
    fetch(`${baseURL}${version}/books/genesis/chapters/20.json`)
    .then((response) => {
        return response.json()
    })
    .then((data) => {
        console.log(data)
    })
}