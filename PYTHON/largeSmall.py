def largest_smalest(a):
    if not arr:
        return None
    largest=smallest=arr[0]
    for num in arr:
        if num < smallest:
            smallest=num
        if num > largest:
            largest=num
    return smallest, largest



arr=list(map(int,input().split(",")))
print(arr)
smallest,largest=largest_smalest(arr)
print(f"smallest : {smallest} \n largest : {largest}")