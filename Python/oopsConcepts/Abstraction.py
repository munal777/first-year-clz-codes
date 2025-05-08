from abc import ABC, abstractmethod

class Shape(ABC):
    @abstractmethod
    def area(self):
        pass

    @abstractmethod
    def perimeter(self):
        pass

class Rectangle(Shape):
    l = int(input('Enter length: '))
    b = int(input('Enter breadth: '))
    def area(self):
        return self.l * Rectangle.b
    
    def perimeter(self):
        return 2 * (self.l + self.b)
        
    
obj = Rectangle()
print(obj.area())
print(obj.perimeter())
