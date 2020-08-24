for _ in range(int(input())):
    Health , power  = map(int , input().split())
    strike = power
    val = power
    while(True):
        if( power <= 0 ):
            break
        strike += power//2
        power = power//2
        
    
    if(strike>=Health):
        print(1)
    else:
        print(0)