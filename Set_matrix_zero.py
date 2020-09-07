matrix = [[1,0,1],[1,1,0],[1,1,1]]

row = [False]*3
col = [False]*3

for i in range(len(matrix)):

    for j in range(len(matrix)):

        if(matrix[i][j] == 0):
            row[i] = True
            col[j] = True

for i in range(len(matrix)):

    for j in range(len(matrix)):

        if(row[i] or col[j]):

            matrix[i][j] = 0
        else:

            continue

print(matrix)

#time Complexity = o(2mn)
#space Complexity = O(m+n)