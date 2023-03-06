class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        if len(nums) <= 1:
            return nums
        mid = len(nums) // 2
        
        left = self.sortArray(nums[0:mid])
        right = self.sortArray(nums[mid:])
        merged_array = self.merge(left, right)
        return merged_array

    def merge(self, left, right):
        lp = 0
        rp = 0
        result = []
        while lp < len(left) and rp < len(right):
            if left[lp] < right[rp]:
                result.append(left[lp])
                lp += 1
            else:
                result.append(right[rp])
                rp += 1
        
        result.extend(left[lp:])
        result.extend(right[rp:])
        return result