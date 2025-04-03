class Solution:
    def valueAfterKSeconds(self, n: int, k: int) -> int:

        res=[1]*n
        mod=10**9+7
        for i in range(k):
            for j in range(1,n):

                res[j]=(res[j-1]+res[j])%mod
        return res[-1]
        