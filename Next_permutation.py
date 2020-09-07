num = input()
num = list(map(int , num.split()))
# num = [1,3,5,4,2]

def reversenum(l , k , num):
    while(k<l):
        num[l],num[k] = num[k],num[l]
        k+=1
        l-=1





for i in range(len(num)-2, -1 , -1):
    
    if(num[i]<num[i+1]):
            k = i ;
            # print(k)
           
            break;
    
if(k<0):
    print(num.reverse())
else:
    for j in range(len(num)-1 , k , -1):
        if(num[j] > num[k]):
            l = j
            break
    num[l],num[k] = num[k],num[l]
    print(k)
    print(l)
    reversenum(len(num)-1 , k+1 , num)
        


print(num)

