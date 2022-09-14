* in my first submission i simply took out all the words from string and stored there length. when i encountered the last word returned its length.
* first
*  `class Solution {
public int lengthOfLastWord(String s) {
s=s+" ";
String w="";
int ll=0;
int l=s.length();
char ch;
for(int i=0;i<l;i++)
{
ch=s.charAt(i);
if(ch!=' ')
{
w=w+ch;
}
else
{   if (w.length()!=0)
ll=w.length();
w="";
}
}
return ll;
}
}`
* in second submission started ttraversing the string from end  and as soon as a space is encountered after a word then its length is returned  (this approach is 100% fast)