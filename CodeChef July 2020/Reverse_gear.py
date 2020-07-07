Testcase = int(input())
for i in range(Testcase):
    forward_count =0
    backward_count =0
    forward_time =0
    backward_time = 0
    rem = 0
    val = True
    x= list(map(int,input().split()))
    forward , backward , time , distance = x
    while(val):
        distance = distance - backward
        if(distance<0):
            rem = distance+backward
            break
        if(distance==0):
            backward_count+=1
            break
        backward_count +=1

        distance = distance + forward
        if(distance<0):
            break
        if(distance==0):
            forward_count+=1
            break
        forward_count +=1

    forward_time = forward*time
    backward_time = backward*time
    print( (forward_count*forward_time) + (backward_count*backward_time) + (rem*time) )

