class Solution {
    public void setZeroes(int[][] matrix) {
        
        Map<Integer,Boolean> rowMap = new HashMap<>();
        Map<Integer,Boolean> colMap = new HashMap<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rowMap.put(i,true);
                    colMap.put(j,true);
                }
            }
        }

        for(Map.Entry<Integer,Boolean> entry:rowMap.entrySet()){
            int rowIndex = entry.getKey();
            for(int i=0;i<n;i++){
                matrix[rowIndex][i] = 0;
            }
        }

        for(Map.Entry<Integer,Boolean> entry:colMap.entrySet()){
            int colIndex = entry.getKey();
            for(int i=0;i<m;i++){
                matrix[i][colIndex] = 0;
            }
        }
    }
}