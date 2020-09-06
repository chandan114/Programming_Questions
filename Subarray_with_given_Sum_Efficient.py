array = [1, 20 ,20 , 3 ,10 , 5]
requireSum = 23
# maxval = array[0] 
sumval = array[0]
start = 0

for i in range(1 , len(array)+1):
    
    while(sumval>requireSum and start < i-1):
        sumval -= array[start]
        start+=1
    
    if(sumval == requireSum):
        print("start :{}  End:{}".format(start, i-1)) ;

    if(i<len(array)):
        sumval+=array[i]