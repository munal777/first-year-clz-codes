class Rectangle:
    def __init__(self,length, breadth):
        self.length = length
        self.breadth = breadth

    def area_of_rect(self):
        return self.length * self.breadth
    
    def perimeter_of_rect(self):
        return 2 *(self.length + self.breadth)

l = int(input('Enter a length: '))
b = int(input('Enter a breadth: '))

obj = Rectangle(l,b)

while True:
    print('1. Area')
    print('2. Perimeter')
    print('3.Exist')
    ch = int(input('Enter your choice: '))
    if ch == 1:
        print('Area of Rectangle is',obj.area_of_rect())

    elif ch == 2:
        print('Perimeter of Rectangle is',obj.perimeter_of_rect())
    
    elif ch == 3:
        print('Program existed.')
        break

    else:
        print('please Enter a vaild number.')
