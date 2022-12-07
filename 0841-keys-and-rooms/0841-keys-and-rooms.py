class Solution:
    def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
        n=len(rooms)
        st=[0]*n
        q=[0]
        st[0]=1
        while(q):
            x=q.pop(0)
            l=rooms[x]
            for i in l:
                if st[i]==0:
                    st[i]=1
                    q.append(i)
        
        if 0 in st:
            return False
        else:
            return True