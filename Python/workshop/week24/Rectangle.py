class Rectangle():

    def __init__(self, l, b):
        self.len = l
        self.brt = b

    def get_area(self):
        return self.len * self.brt
    
    def get_perimeter(self):
        return 2*(self.len + self.brt)
    

x = Rectangle(2,3)
print(x.get_area())
print(x.get_perimeter())