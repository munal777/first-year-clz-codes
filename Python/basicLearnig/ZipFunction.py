list1 = [1,2,3,4]
str1 = 'abcd'
tuple1 = (5,7,9)  #the iterables have different lengths, zip() stops at the shortest iterable
zipped = tuple(zip(list1,str1,tuple1))
print(zipped)

#unzipping
list_1, string_1, tuple_1 = zip(*zipped)
print(list(list_1))
print(set(string_1))
print(tuple_1)


list2 = [1,2,3,4]
str2 = 'abcd'
zipped2 = dict(zip(list2, str2))
print(zipped2)