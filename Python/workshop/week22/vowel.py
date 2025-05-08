def count_vowel(word):
    vowel = ["a","e","i","o","u"]
    count = 0
    for i in word:
        if i.lower() in vowel:
            count += 1
    return count

print(count_vowel("sajabjj"))  
