class Rectangle:
    def __init__(self,length,breadth):
        self.length = length
        self.breadth = breadth
        
    def __str__(self):
        return f"Rectangle({self.length}:{self.breadth})"
        
    def area(self):
        return self.length * self.breadth
        
    def perimeter(self):
        return 2 * (self.length + self.breadth)
        
class Square(Rectangle):
    def __init__(self, length):
        super().__init__(length,length)
        
    def __str__(self):
       return f"Square({self.length})"
        
s1 = Square(10)
print(s1.area())
print(s1.perimeter())
        
    
