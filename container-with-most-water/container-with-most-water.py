class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height)-1
        max_height = 0
        max_width = 0
        max_area = 0
        while left<right:
            max_height = min(height[left],height[right])
            max_width  = (right+1)-(left+1)
            if max_area < max_height * max_width:
                max_area = max_height * max_width
                
            if height[left]<height[right]:                
                left +=1 
            elif height[left]>height[right]:               
                right -=1 
            else:                
                left +=1 
                right -=1
        return max_area
