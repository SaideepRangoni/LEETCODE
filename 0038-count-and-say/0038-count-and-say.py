class Solution:
    def countAndSay(self, n: int) -> str:
        if n == 1:
            return "1"
        
        result = "1"
        for _ in range(n - 1):  # Generate next sequence n-1 times
            current = ""
            i = 0
            while i < len(result):
                count = 1  # Count occurrences of the same digit
                while i + 1 < len(result) and result[i] == result[i + 1]:
                    i += 1
                    count += 1
                current += str(count) + result[i]  # Append count and digit
                i += 1
            result = current  # Update result with the new sequence
        
        return result
