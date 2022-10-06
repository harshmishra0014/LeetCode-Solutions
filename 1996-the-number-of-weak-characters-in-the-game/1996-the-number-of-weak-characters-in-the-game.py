class Solution:
    def numberOfWeakCharacters(self, properties: List[List[int]]) -> int:
        c=0
        #doing negative for all first values
        for i in  properties:
            i[0]=-i[0]

        properties.sort()

        #doing back positive
        for i in properties:
            i[0]=-i[0]
        
        temp=0
        for i in range(len(properties)):
            if temp > properties[i][1]:
                c+=1
            else:
                temp=properties[i][1]
        return c
        

        