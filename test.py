import requests

def fetchAPI():
    response = requests.get("https://jsdemo-3f387-default-rtdb.europe-west1.firebasedatabase.app/notifications/new.json")
    data = response.json()
    print(data.get('count'))
    return data


print(fetchAPI())