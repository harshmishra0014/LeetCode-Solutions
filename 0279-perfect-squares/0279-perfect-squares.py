class Solution:
    def numSquares(self, n: int) -> int:
        l=sqrt(n)
        visited=[0]*(n+1)
        q=[(0,0)]
        while(q):
            s,l1=q.pop(0)
            if(s==n): return l1

            for i in range(1,int(l)+1):
                if(s+i**2 <=n):
                    if(visited[s+i**2]==0):
                        q.append((s+i**2 , l1+1))
                        visited[s+i**2]=1
    
### using dp ####
# class Solution1:
#     def numSquares(self, n: int) -> int:
        
