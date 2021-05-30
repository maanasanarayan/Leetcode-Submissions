class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        x = str(x)
        i, j = 0, len(x)-1
        while i <= j:
            if x[i] == x[j]:
                i+=1
                j-=1
            else:
                if len(x)%2 == 1 and i==j:
                    return True
                else:
                    return False
        return True     