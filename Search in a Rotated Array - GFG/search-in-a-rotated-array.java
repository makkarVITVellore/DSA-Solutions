//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int A[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0;i < n;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
            int key = Integer.parseInt(in.readLine().trim());
            
            out.println(new Solution().search(A, 0, n - 1, key));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int A[], int l, int h, int key)
    {
      int si=0;
        int ei=A.length-1;

        int pivot = -1;

        while(si<=ei)
        {
            if(A[si]==key)
            {
                return si;
            }
            if(A[ei]==key)
            {
                return ei;
            }

            if(A[si]<=A[ei])
            {
                if(pivot==-1)
                {
                    pivot = si;
                    si = pivot+1;
                }
                else
                {
                    int mid = (si+ei)/2;

                    if(A[mid]==key)
                    {
                        return mid;
                    }
                    else if(A[mid]>key)
                    {
                        ei = mid-1;
                    }
                    else
                    {
                        si = mid + 1;
                    }
                }   
            }
            else
            {
                si++;
                ei--;
            }
        }

        si = 0;
        
        if(pivot>=1)
        {
            ei = pivot-1;
        }
        else
        {
            ei = pivot;
        }

        while(si<=ei)
        {
            int mid = (si+ei)/2;

            if(A[mid]==key)
            {
                return mid;
            }
            else if(A[mid]>key)
            {
                ei = mid-1;
            }
            else
            {
                si = mid + 1;
            }
        }

        return -1;
    }
}