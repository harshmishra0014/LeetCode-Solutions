first submission was done by using stack
```
class Solution {
public String reverseWords(String s) {
s=s+" ";
String ans="";
Stack<String> st = new Stack<String>();
String temp="";
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
if(temp.length()!=0)
st.push(temp);
temp="";
}
else
temp+=s.charAt(i);
}
while(!st.empty())
{
ans=ans+st.peek()+" ";
st.pop();
}
ans=ans.trim();
return ans;
}
}
```