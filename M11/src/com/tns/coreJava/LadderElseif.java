package com.tns.coreJava;

/**
 * @author Zubair
 *
 */
public class LadderElseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 90;
		
            if(marks<50) {
            	System.out.println("FAIL");
            }
            else if(marks>=50 && marks<60) {
            	System.out.println("D Grade");
            }
            else if(marks>=60 && marks<75) {
            	System.out.println("C Grade");
            }
            else if(marks>=75 && marks<90) {
            	System.out.println("B Grade");
            }
            else if(marks>=90 && marks<100) {
            	System.out.println("A++ Grade");
            }
            else{
            	System.out.println("Invalid!");
            }
            
	}

}
