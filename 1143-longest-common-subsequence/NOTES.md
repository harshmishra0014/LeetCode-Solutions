return dp[n][m];
}
public int longestCommonSubsequence(String text1, String text2) {
int n=text1.length();
int m=text2.length();
int dp[][]=new int[n+1][m+1];
return lcs(text1,text2,n,m,dp);
}
/*Recursion -1
public int  lcs(String s1,String s2,int n,int m){
if(m==0 || n==0)return 0;
if(s1.charAt(n-1)==s2.charAt(m-1))
return 1+lcs(s1,s2,n-1,m-1);
else
return Math.max(lcs(s1,s2,n-1,m),lcs(s1,s2,n,m-1));
}
public int longestCommonSubsequence(String text1, String text2) {
int n=text1.length();
int m=text2.length();
//int dp[][]=new int[n+1][m+1];
return lcs(text1,text2,n,m);
}*/
}
```