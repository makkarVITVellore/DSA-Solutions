//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution

{
    public String removeConsecutiveCharacter(String S)
    {
        String ans="";
		int index=-1;
		int n = S.length();
		for(int i=0;i<n;i++)
		{
			if(ans=="")
			{
				ans=ans+S.charAt(i);
				index++;
			}
			else if(S.charAt(i)!=ans.charAt(index))
			{
				ans = ans + S.charAt(i);
				index++;
			}
		}

		return ans;
    }
}