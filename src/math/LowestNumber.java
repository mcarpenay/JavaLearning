package math;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 */
		int [] array = new int[]{34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
		
		for (int i=0; i<array.length;i++){
			for (int j=i+1;j<array.length;j++){
				int temp = array[i];
			
				if(array[j]<temp){
					
					array[i]=array[j];
					array[j]= temp;
				}//if
			}//inner for	
		}//outer for 
		//for(int i=0; i<array.length;i++){
		//System.out.println(array[i]);}
		System.out.println(array[0]);
		
	}//method
		
}
