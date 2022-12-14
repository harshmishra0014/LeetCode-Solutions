class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        n=numCourses
        adj=[[] for i in range(n)]
        indegree=[0]*n
        
        for i,j in prerequisites:
            adj[j].append(i)
            indegree[i]+=1
        
        q=[]
        ans=[]
        for i in range(n):
            if indegree[i]==0:
                q.append(i)
        
        while(q):
            x=q.pop(0)
            ans.append(x)
            y=adj[x]
            for a in y:
                indegree[a]-=1
                if indegree[a]==0:
                    q.append(a)
        
        if len(ans)==n:
            return ans
        else:
            return ([])