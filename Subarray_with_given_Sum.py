array = [1, 20 ,20 , 3 ,10 , 5]
requireSum = 33
maxval = array[0] 
sumval = 0
c = 0

for i in range(len(array)):
    sumval = 0 
    if(c == 1):
        break
    for j in range(i ,len(array)):
        sumval += array[j]
        # maxval = max(sum , maxval)

        if(sumval == requireSum):
            print("{} {}".format(i, j))
            c = 1
            break