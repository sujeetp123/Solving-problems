
class MaxMin {
	
	static class Pair {
		
		int Max;
		int Min;
		
	}
	
	static Pair getMinMax( int arr[], int n) {
		
		Pair MX = new Pair();
		
		// when array contain one element
		if ( n==1) {
			MX.Max=arr[0];
			MX.Min=arr[0];
			return MX;
		}
		
		
		// when array contain more than one lements

		if (arr[0] > arr[1] ) {
			
			MX.Max =arr[0];
			MX.Min = arr[1];
			
		}
		else {
			
			MX.Max = arr[1];
			MX.Min = arr[0];
			
		}
		
		for ( int i =2 ; i< n;i++) {
			
			if (arr[i] > MX.Max) {
				MX.Max=arr[i];
			}
			
			else if (arr[i] < MX.Min) {
				
				MX.Min=arr[i];
			}
		}
		
		return MX;
		
		
		
	}
	
	
	
	
	
	public static void main(String args[]) {
		 int array [] =  {1,2,3,5,8,34};
		
		 int size =6;
		
		 Pair MX = getMinMax(array,size);
		 System.out.println(" The maximum elemnts in the Array :" + MX.Max);
		 
		 System.out.println(" The minimum elemnts in the Array :" + MX.Min);
		 
	}
	
	
}
