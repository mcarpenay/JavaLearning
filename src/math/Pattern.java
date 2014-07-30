package math;

import java.util.ArrayList;
import java.util.List;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32
		 * 
		 */
		int initial =100;
		int decrement=1;
		//int last = 32;
		
		//int j=0;
		//int[] list= new int[100];
		//int counter=0;
		
		System.out.println(initial);
		
		while (initial>0){
			//System.out.println("here");
		    for(int i= 0; i<10;i++){
		    	initial= initial-decrement;
		    	System.out.println(initial);
		   }//for
		    decrement++;     
		}//while
		
		
		

	}

}
