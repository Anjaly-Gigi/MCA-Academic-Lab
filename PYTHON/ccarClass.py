class Car:
    def __init__(self, name, price, fuel):
        self.name=name
        self.price=price
        self.fuel = fuel
        
    def __str__(self):
        return f"{self.name}:{self.price}:{self.fuel}"
        
    def printDetails(self):
        print(self.name ,self.price, self.fuel)
        
    def __add__(self,other):
        totalp = self.price + other.price
        return totalp
        
    def __sub__(self,other):
        tsub = self.price - other.price
        return tsub

car1= Car("Audi",2000000,"petrol")
car2 = Car("Thar",2000000,"petrol")
#car1.printDetails()
#car2.printDetails()
print(car1)
print(car2)
totalp = car1 + car2
print(totalp)
tsub = car1 - car2
print(tsub)

