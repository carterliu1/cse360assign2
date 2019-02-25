/*
*@author : Carter Liu
*@Class ID : 457
*@Assignment : 2
*@Description : This file contains operations for a calculator
*@version: 2
*/

package cse360assign2;

//This class contains methods to perform operations for a calculator
public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/*
	 * This method returns the total
	 * @return int total
	 */
	public int getTotal () {
		return total;
	}
	
	/*
	 * This method performs the add operation
	 * @param value the number to be added
	 */
	public void add (int value) {
		total += value;
	}
	
	/*
	 * This method performs the subtract operation
	 * @param value the number to be subtracted
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/*
	 * This method performs the multiply operation
	 * @param value the number to be multiplied
	 */
	public void multiply (int value) {
		total *= value;
	}
	
	/*
	 * This method performs the divide operation if param is not 0
	 * @param value the number to be divided
	 */
	public void divide (int value) {
		if(value ==0)
		{
			total = 0;
		}
		else 
		{
			total /= value;
		}
	}
	
	/*
	 * This method returns the history as a string
	 * @return string history
	 */
	public String getHistory () {
		return "";
	}
}