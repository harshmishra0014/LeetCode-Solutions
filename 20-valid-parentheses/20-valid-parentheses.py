class Solution:
    def isValid(self, s: str) -> bool:
        l=[]
        if len(s)%2!=0:
            return False
        if s[0]==')' or [0]=='}' or s[0]==']':
            return False
        for i in s:
            #print("sym",i)
            if i=='(' or i=='{' or i=='[':
                l.append(i)
                #print(l)
            else:
                if len(l)==0:
                    return False
                elif i==')' :
                    if l[-1]=='(':
                        #print("LIST 1pop",l)
                        l.pop()
                        #print("LIST 1pop",l)
                    else:
                        #print("1F")
                        return False
                elif i=='}':
                    if l[-1]=='{':
                        #print("LIST 2pop",l)
                        l.pop()
                        #print("LIST 2pop",l)
                    else:
                        #print("2F")
                        return False
                elif i==']':
                    if l[-1]=='[':
                        #print("LIST 3pop",l)
                        l.pop()
                        #print("LIST 3pop",l)
                    else:
                        #print("3F")
                        return False
        if len(l)==0:
            #print("0F")
            return True
