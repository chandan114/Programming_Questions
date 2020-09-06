array = [1, 10 ,20 , 3 ,10 , 5]
requireSum = 33
# maxval = array[0] 
sumval = array[0]
start = 0
k = 3
c = 0

for i in range(1 , len(array)+1):

    
    c+=1
    if (c%k!=0):

        # sumval -= array[start]
        # start+=1
        while(sumval>=requireSum and c%k!=0):
            sumval -= array[start]
            start+=1
            c-=1
    
    if(sumval == requireSum and c%k==0):
        print("start :{}  End:{}".format(start, i-1)) ;
        break

    if(i<len(array)):
        sumval+=array[i]