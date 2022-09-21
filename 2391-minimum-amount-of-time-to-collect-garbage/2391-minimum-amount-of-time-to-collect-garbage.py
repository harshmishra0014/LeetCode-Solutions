class Solution:
    def garbageCollection(self, garbage: List[str], travel: List[int]) -> int:
        pre_travel=[0]
        pre_travel.append(travel[0])
        
        
        for i in range(1,len(travel)):
            pre_travel.append(travel[i]+pre_travel[i])
        
        
        garbageCollect=0
        m,p,g=0,0,0
        
        #gives total amount of garbage and last index of type of garbage
        for i in range(len(garbage)):
            for j in range(len(garbage[i])):
                garbageCollect+=1
                if garbage[i][j]=='M':
                    m=i
                elif garbage[i][j]=='P':
                    p=i
                elif garbage[i][j]=='G':
                    g=i
        
        mtruck=pre_travel[m]
        ptruck=pre_travel[p]
        gtruck=pre_travel[g]
        
       
        garbageCollect+=mtruck+ptruck+gtruck
        
        return garbageCollect
        