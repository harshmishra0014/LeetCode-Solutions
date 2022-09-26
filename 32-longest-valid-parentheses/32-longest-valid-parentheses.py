class Solution:
    def longestValidParentheses(self, s: str) -> int:
        stack=[(0,-1)]
        ans=0
        if len(s)==0:
            return 0

        for i in range(len(s)):
            if (s[i]==')' and stack[-1][0]=='(') and len(stack)>0:
                stack.pop()
                ans=max(ans,i-stack[-1][1])
            else:
                stack.append((s[i],i))
        return ans