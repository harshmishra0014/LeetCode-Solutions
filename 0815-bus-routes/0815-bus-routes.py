class Solution:
    def numBusesToDestination(self, routes: List[List[int]], s: int, destination: int) -> int:
        if s==destination:
            return 0
        stop_vis={}
        node_vis={}
        adj={}
        for i in range(len(routes)):
            for j in routes[i]:
                if j not in adj:
                    adj[j]=[i]
                else:
                    adj[j].append(i)

        q=[s]
        stop_vis[s]=1
        tempq=[s]
        result=0
        while(tempq):
            result+=1
            q=tempq.copy()
            tempq=[]
            while(q):
                x=q.pop(0)
                l=adj[x]
                for y in l:
                    if y not in node_vis:
                        node_vis[y]=1
                        for stop in routes[y]:
                            if stop not in stop_vis:
                                stop_vis[stop]=1
                                if(stop==destination):
                                    return result
                                else:
                                    tempq.append(stop)
        return -1