array = [ 1 , 20 , 3 , 5 , 10 , 5 , 3 , 4] 
req = 23
sum = array[0]
start = 0
maxlen = 0

for i in range(1 ,len(array)):

    sum = sum+array[i]
    while(sum > req and start<i-1):
        sum-= array[start]
        start+=1

    if(sum==req):
        maxlen = max(maxlen , (i+1) - start)
    
print(maxlen)
        

