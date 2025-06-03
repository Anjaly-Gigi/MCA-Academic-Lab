import time
timestamp = time.strftime('%H:%M:%S')
print(timestamp)
hour = int(time.strftime('%H'))
if (hour>4 and hour<12):
    print("GOOD MORNING")
elif(hour>12 and hour<14):
    print("GOOD AFTERNOON")
elif(hour>14 and hour<17):
    print("GOOD EVENING")
else:
    print("GOOD NIGHT")