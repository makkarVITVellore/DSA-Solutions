//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int l = sc.nextInt();
            int n = sc.nextInt();
            
            int arr[] =  new int[l];
            
            for(int i = 0;i<l;i++)
                arr[i] = sc.nextInt();
            
            Solution ob = new Solution();
                
            if(ob.findPair(arr, l, n)==true)
                System.out.println(1);
                
            else
                System.out.println(-1);    
                
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        /*
        //brute force approach
        
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(Math.abs(arr[i]-arr[j])==n)
                {
                    return true;
                }
            }
        }
        
        return false;
        */
        
        // optimal approach - binary search
        
        Arrays.sort(arr);
        
        int i=0;
        int j = i+1;
        
        while(i<arr.length && j<arr.length)
        {
            int diff = arr[j]-arr[i];
            
            if(j!=i && diff==n)
            {
                return true;
            }
            else if(diff>n)
            {
                i++;
            }
            else
            {
                j++;
            }
          
        }
        
        return false;
    }
}