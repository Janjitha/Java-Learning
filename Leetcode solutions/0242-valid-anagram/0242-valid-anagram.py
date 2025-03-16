class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        a="".join(sorted(s))
        b="".join(sorted(t))
        return a==b
