/*
 * Author : Haoyuan Zhong
 * ASU ID : 1213565598
 * class ID: 70642 Wednesday
 * assignment : assignment 3
 * 
 * DESCRIPTION : This is a simple program for simple calculation
 *
 *URL : https://github.com/hzhong16/AddingMachine/blob/master/CSE360assign2/src/cse360assign2/AddingMachine.java 
 * 
 */
package cse360assign3;

public class Calculator extends AddingMachine
{
	
	/*
	 * class for multiplication function
	 */
		public void multiplication(int value)
		{
			total *= value;
			history += " * " + value;
		}
		
		/*
		 * class for dividsion function
		 */
		public void division(int value)
		{
			if (value == 0)
			{
				total = 0;
			}
			else 
			{
				total = total / value;
			}
			history += " / " + value;
		}
		
		/*
		 * class for power function
		 */
		public void power(int value)
		{
			if ( value < 0)
			{
				total = 0;
			}
			else 
			{
				total = (int) Math.pow(total, value);
			}
			
			history += " ^ " + value;
		}
}
