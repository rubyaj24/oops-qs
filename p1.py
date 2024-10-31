L=[]
n=int(input("Enter the number of elements in the list..."))
print("Enter the numbers...")
for i in range(n):
    x=int(input())
    L.append(x)
a=int(input("Enter the number to search ..."))
for i in range(n):
    if L[i]==a:
        print("Element found at position ",i+1)
        break
else:
    print("Element not found")