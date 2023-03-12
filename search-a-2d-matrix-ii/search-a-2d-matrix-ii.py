class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for array in matrix:
            found = self.binarySearch(array, target)
            if found:
                return True
            
        return False
        
    def binarySearch(self, array, target):
        if len(array) == 0:
            return False
        
        mid = len(array)//2
        mid_ele = array[mid]
        if mid_ele == target:
            return True
        elif mid_ele < target:
            return self.binarySearch(array[mid+1:], target)
        elif mid_ele > target:
            return self.binarySearch(array[:mid], target)
        
        