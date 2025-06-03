
class Solution:
    def maximumLength(self, s: str) -> int:
        n=len(s)
        substring_count={}
        for i in range(n):
            char=s[i]
            substring=char
            for j in range(i,n):
                if s[j]!=char:
                    break
                substring_count[substring]=substring_count.get(substring,0)+1
                substring+=char

        longest_length=-1
        for substring,count in substring_count.items():
             if count >= 3:
                 longest_length=max(longest_length,len(substring))
        return longest_length
