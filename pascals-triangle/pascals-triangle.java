class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainList = new ArrayList<List<Integer>>();
        
        if(numRows >= 1) {
            List<Integer> subList = new ArrayList<>();
            subList.add(1);
            mainList.add(subList);
        } 
        if(numRows >= 2) {
            List<Integer> subList = new ArrayList<>();
            subList.add(1);
            subList.add(1);
            mainList.add(subList);
        }
        
        for(int i = 2; i < numRows; i++) {
            List<Integer> temp = mainList.get(i-1);
            List<Integer> subList = new ArrayList<>();
            
            for(int j = 0; j < temp.size(); j++) {
                if(j == 0 || j == temp.size()-1) {
                    subList.add(1);
                }
                if(j != temp.size()-1) {
                    subList.add(temp.get(j) + temp.get(j+1));
                }
            }
            mainList.add(subList);
        }
        return mainList;
    }
}