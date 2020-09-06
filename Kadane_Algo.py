array = [-2, -3, 4, -1, -2, 1, 5, -3]
maxval = array[0]
sumval = 0

for i in range(1 ,len(array)):

    sumval+=array[i]
    maxval = max(sumval , maxval)

    if(sumval<0):
        sumval = 0 ;
    
print(maxval)

