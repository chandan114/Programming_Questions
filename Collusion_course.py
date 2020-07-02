
collusions= {}
count = 0
def dist(x,y , velocity):
    return ( (x**2   + y**2) / velocity**2 )

def comb(val):
    return ((val*(val-1))//2)


cars = int(input())
for _ in range(cars):
    l = list(map(int , input().split()))
    x,y,velocity = l
    time = dist(x,y,velocity)
    try:
        collusions[time] = collusions[time] + 1
    except:
        collusions[time] = 1

for i in collusions:
    count = count  + comb(collusions[i])

print(count)
    

