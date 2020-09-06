array = [1, 2, 3, 4, 5, 5, 5, 5, 5, 2, 2, 1, 1]
maxlen = 1 ;
c= 1
x =0

for i in range(1 , len(array)):
    if( array[i]==array[i-1]):

        c+=1
    else:

        c = 1
    

    maxlen = max (maxlen , c)

print(maxlen)
