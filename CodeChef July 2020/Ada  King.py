for _ in range(int(input())):
    count = 0
    matrix = [['O' , '.' , '.' , '.' , '.' , '.' , '.' , '.'],
    ['.' , '.' , '.' , '.' , '.' , '.' , '.' , '.'],
    ['.' , '.' , '.' , '.' , '.' , '.' , '.' , '.'],
    ['.' , '.' , '.' , '.' , '.' , '.' , '.' , '.'],
    ['.' , '.' , '.' , '.' , '.' , '.' , '.' , '.'],
    ['.' , '.' , '.' , '.' , '.' , '.' , '.' , '.'],
    ['.' , '.' , '.' , '.' , '.' , '.' , '.' , '.'],
    ['.' , '.' , '.' , '.' , '.' , '.' , '.' , '.']]
    k =int(input())
    for i in range(8):
        
        for j in range(8):
            count+=1
            if(count==1):
                continue
            
            if(count<=k):
                continue
            else:
                matrix[i][j]='X'
    for m in range(8):
        for n in range(8):
            print(matrix[m][n] , end = '')
        print('')
