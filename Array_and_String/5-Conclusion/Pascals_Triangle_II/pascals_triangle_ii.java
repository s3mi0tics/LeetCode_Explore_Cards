class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        for (int i = 0; i <= rowIndex; i++){
            row.add(0, 1);
            for(int j = 1; j < i; j++){
                row.set(j, row.get(j) + row.get(j+1));
            }
        }
        return row;
    }
}
//Time complexity: O(n^2)    //as there are 2 loops 
//Space complexity: O(n)
