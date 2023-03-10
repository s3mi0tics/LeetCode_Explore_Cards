class Solution(object):
    def backspaceCompare(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        i=0
        j=0
        while i<len(s) or j<len(t):
            if i<len(s) and s[i]=="#":
                if i==0:
                    s=s[0:i]+s[i+1:]
                    i=i-1
                else:
                    s=s[0:i-1]+s[i+1:]
                    i-=2
            if j<len(t) and t[j]=="#":
                if j==0:
                    t=t[0:j]+t[j+1:]
                    j=j-1
                else:
                    t=t[0:j-1]+t[j+1:]
                    j-=2
            i+=1
            j+=1
        if t==s:
            return True
        return False