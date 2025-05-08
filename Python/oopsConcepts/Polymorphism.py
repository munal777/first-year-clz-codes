class Polymorphism:
    def __init__(self,x,y):
        self.x = x
        self.y = y

    def __add__(self, other):
        return Polymorphism(self.x + other.x, self.y + other.y)
    
    def __str__(self):
        return f'{self.x}, {self.y}'

v1 = Polymorphism(1,5)
v2 = Polymorphism(3,5)
v3 = v1 + v2
print(v3)
print(v1.x)
print(v3.x)