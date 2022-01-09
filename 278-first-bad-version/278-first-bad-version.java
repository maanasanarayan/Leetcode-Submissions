/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        /*
        int lp = 1;
        int rp = n;
        
        while(lp <= rp) {
            int mid = lp + (rp - lp) / 2;
            
            if(isBadVersion(mid)) {
                rp = mid - 1;
                if((mid-1 > 0 && !isBadVersion(mid - 1)) || mid == 1) {
                    return mid;
                }
            } else {
                lp = mid + 1;
            }
        }
        return -1;           
        */
        
        int lp = 1;
        int rp = n;
        
        while(lp < rp) {
            int mid = lp + (rp - lp) / 2;
            
            if(isBadVersion(mid)) {
                rp = mid;
            } else {
                lp = mid + 1;
            }
        }
        return lp;   
    }
}