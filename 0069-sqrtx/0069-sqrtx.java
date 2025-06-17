class Solution {
    public int mySqrt(int x) {
		if(x==0 || x==1){
			return x;
		}
		long lower = 1;
		long upper = x/2;
		while(upper>=lower){
			long mid = (upper+lower)/2;
			long midSquare = mid*mid;
			if(midSquare==(long)x){
				return (int)mid;
			}
			else if(midSquare>(long)x){
				upper = mid-1;
			}
			else{
				lower = mid+1;
			}

		}

		if(lower*lower>(long)x){
			return (int)lower-1;
		}

		return (int)lower;        
    }
}