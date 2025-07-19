class Solution {
    public int[] sortArray(int[] nums) {
		//base case
		if(nums.length==1){
			return nums;
		}

		//induction step
        int n = nums.length;
		int a[] = new int[n/2];
		int b[] = new int[n-a.length];

		for(int i=0;i<n/2;i++){
			a[i] = nums[i];
		}

		for(int i=n/2;i<n;i++){
			b[i-(n/2)] = nums[i];
		}

		a = sortArray(a);
		b = sortArray(b);		
		return merge2SortedArrays(a,b);        
    }

	public static int[] merge2SortedArrays(int[] a, int[] b){
		
		int n = a.length;
		int m = b.length;
		int i=0,j=0,k=0;
		int[] c = new int[n+m];
		while(i<n && j<m){

			if(a[i]<b[j]){
				c[k] =a[i];
				i++;
				k++;
			}
			else if(a[i]>=b[j]){
				c[k]=b[j];
				j++;
				k++;
			}
		}

		while(i<n){
			c[k] = a[i];
			i++;
			k++;
		}

		while(j<m){
			c[k] = b[j];
			j++;
			k++;
		}

		return c;
	}    
}