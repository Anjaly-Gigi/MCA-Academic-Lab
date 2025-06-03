#basic amstrong number

n = int(input("enter a number"))
power = len(str(n))
power_digits_sum = sum(int(digit)**power for digit in str(n)) 
if n == power_digits_sum:
    print(n,"is equals to",power_digits_sum,"amstrong")
else:
    print("not amstrong")

#amstrong number in a range

start = int(input("enter the starting number"))
end = int(input("enter the ending number"))

for i in range(start, end+1):
    power = len(str(i))
    sum_no = sum(int(digit)**power for digit in str(i))
    if i == sum_no:
        print(i, end=" ")

#amstrong number in functions

def is_amstrong(n):
    digits = str(n)
    power = len(digits)
    total = sum(int(digit)**power for digit in digits)
    return total == n

n = int(input())
if is_amstrong(n):
    print("amstrong")
else:
    print("not amstrong")


