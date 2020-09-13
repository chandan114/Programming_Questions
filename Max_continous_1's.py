a = [1,0,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1]
c = 0
val = 0
for i in a:
    if(i!=1):
        c = 0
    else:
        c+=1
        val = max(val , c)

print(val)