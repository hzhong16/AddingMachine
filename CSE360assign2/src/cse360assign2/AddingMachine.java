/*
 * Author : Haoyuan Zhong
 * ASU ID : 1213565598
 * class ID: 70642 Wednesday
 * assignment : assignment 2
 * 
 * DESCRIPTION : This is a simple program for simple calculation
 *
 *URL : https://github.com/hzhong16/AddingMachine/blob/master/CSE360assign2/src/cse360assign2/AddingMachine.java 
 * 
 */
package cse360assign2;

/*
 * class for adding function
 */
public class AddingMachine {
	
	private int total;
	private String history;
	
	/*
	 * for initial value of total and history
	 */
	public AddingMachine () {
		total = 0; // not needed - included for clarity
		history = " 0 ";
	}
	
	/*
	 * return the answer
	 */
	public int getTotal () {
		return total;
	}
	
	/*
	 * adding function
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	/*
	 * subtract function
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	/*  
	 *return history to the function
	 */
	public String toString () {
		return history;
	}
	
	/*  
	 * set everything back to initial value start over
	 */
	public void clear() {
		history = "0";
		total = 0;
	}
	
	



}
