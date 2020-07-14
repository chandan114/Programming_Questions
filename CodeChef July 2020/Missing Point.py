a = {}
b = {}
for _ in range(int(input())):
    for __ in range( (4*(int(input())) )-1):
        x,y = map(int, input().split())
        try:
            a[x] = a[x]+1
        except:
            a[x]=1
        try:
            b[y] = b[y]+1
        except:
            b[y]=1
    
    for k in a:
        if(a[k]%2!=0):
            print(k , end = " ")
            break
    for k in b:
        if(b[k]%2!=0):
            print(k , end = " ")
            break
    