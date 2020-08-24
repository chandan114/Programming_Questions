for l in range( int(input()) ):
    chef , rick = map(int , input().split())

    if(chef<10 and rick<10):
        print("{} {}".format(1,1))
        continue

  

    if(chef%9!=0):
        c = (chef//9) +1
    else:
        c = chef//9

    
    if(rick%9!=0):
        r = (rick//9) +1
    else:
        r = rick//9

    if(chef==rick):
        print("{} {}".format(1,r))
        continue     
    
    if(c>r):
        print( "{} {}".format(1 , r ))
        continue
    else:
        print( "{} {}".format(0 , c ))
        continue

    print("{} {}".format(1,r))


