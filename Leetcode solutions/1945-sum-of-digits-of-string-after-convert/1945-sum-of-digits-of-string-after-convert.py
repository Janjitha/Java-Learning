class Solution(object):
    def getLucky(self, s, k):
        num_str = ""
        for c in s:
            num_str += str(ord(c) - ord('a') + 1)
        for _ in range(k):
            t = 0
            for c in num_str:
                t += int(c)  
            num_str = str(t) 
        return int(num_str)
        
