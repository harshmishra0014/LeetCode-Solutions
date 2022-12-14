class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        
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
        c=0
        while(q):
            x=q.pop(0)
            c+=1
            y=adj[x]
            for a in y:
                indegree[a]-=1
                if indegree[a]==0:
                    q.append(a)
        
        if c==n:
            return True
        else:
            return False
        