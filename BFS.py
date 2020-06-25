import sys
g = [[0,1,0,0,1],
    [1,0,1,1,1],
    [0,1,0,1,0],
    [0,1,1,0,1],
    [1,1,0,1,0]]
VisitedVertex = [False]*(len(g)+1)
VertexQue=[]
VertexQue.append(1)



def bfs(g , VisitedVertex , VertexQue):
    count = 0
    result = []
    while(len(VertexQue) != 0):
        vertex = VertexQue.pop()
        VisitedVertex[vertex]=True
        count += 1
        result.append(vertex)
        if(count==len(g)):
            break
        
        for i in range(len(g)):
            if(g[vertex-1][i]==1 and VisitedVertex[i+1]==False):
                VertexQue.append(i+1)
                 
    return(result)


print(bfs(g,VisitedVertex,VertexQue))

    
