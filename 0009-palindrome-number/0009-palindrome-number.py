class Solution:
    def isPalindrome(self, x: int) -> bool:
        reversed_str = str(x)[::-1]
        if str(x) == reversed_str:
            return True
        return False
        