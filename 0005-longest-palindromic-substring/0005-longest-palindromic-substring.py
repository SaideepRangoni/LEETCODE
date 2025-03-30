class Solution:
    def longestPalindrome(self, s: str) -> str:
        longesr_palindrome=''
        dp=[[0]*len(s) for _ in range(len(s))]
        for i in range(len(s)):
            dp[i][i]=True
            longest_palindrome=s[i]
        for i in range(len(s)-1,-1,-1):
            for j in range (i+1,len(s)):
                 if s[i]==s[j]:
                    if j-i==1 or dp[i+1][j-1] is True:
                        dp[i][j]=True
                        if len(longest_palindrome)<len(s[i:j+1]):
                            longest_palindrome=s[i:j+1]

           
        return longest_palindrome        