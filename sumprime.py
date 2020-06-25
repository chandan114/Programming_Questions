sum=0
l=[int(x) for x in input().split()]
print(l)
for i in range(len(l)):
    if l[i]==1:
        continue
    if l[i]%2 != 0:
        sum=sum+l[i]
    else:
        continue
print(sum)
    
