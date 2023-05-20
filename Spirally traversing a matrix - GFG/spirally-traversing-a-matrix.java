//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> list = new ArrayList<>();

        int minRowIndex = 0;
        int maxRowIndex = matrix.length-1;

        int minColIndex = 0;
        int maxColIndex = matrix[0].length-1;

        int countRows = 0;
        int maxCountRows = matrix.length-1;

        int countCols = 0;
        int maxCountCols = matrix[0].length-1;

        while(countRows<=maxCountRows && countCols<=maxCountCols)
        {
            if(countRows%2==0 && countCols%2==0)
            {
                for(int j = minColIndex; j<maxColIndex;j++)
                {
                    list.add(matrix[minRowIndex][j]);
                }

                for(int i=minRowIndex;i<=maxRowIndex;i++)
                {
                    list.add(matrix[i][maxColIndex]);
                }

                countRows++;
                countCols++;
                minRowIndex++;
                maxColIndex--;
            }
            else
            {
                for(int j=maxColIndex;j>minColIndex;j--)
                {
                    list.add(matrix[maxRowIndex][j]);
                }

                for(int i=maxRowIndex;i>=minRowIndex;i--)
                {
                    list.add(matrix[i][minColIndex]);
                }

                countRows++;
                countCols++;
                minColIndex++;
                maxRowIndex--;
            }
        }

        return list;
    }
}
