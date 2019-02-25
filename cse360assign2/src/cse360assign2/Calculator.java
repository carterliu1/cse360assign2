/*
*@author : Carter Liu
*@Class ID : 457
*@Assignment : 2
*@Description : This file contains a calculator constructor,
*The operations for a basic calculator, and methods to return the history of the calculator
*and total value after operations.
*@version: 3
*/

package cse360assign2;

//This class contains methods to perform operations for a calculator
//as well as keeps a running string of the history of operations performed
public class Calculator 
{

	private int total; //int to keep track of the total value
	StringBuilder history; //StringBuilder to keep track of the history
	
	/*
	 * This method is a constructor, sets total and history to 0 
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		history = new StringBuilder("0"); //initialize new string to 0
	}
	
	
	/*
	 * This method returns the total
	 * @return int total
	 */
	public int getTotal () 
	{
		return total;
	}
	
	
	/*
	 * This method performs the add operation and adds the operation
	 * and value to the history string
	 * @param value the number to be added
	 */
	public void add (int value) 
	{
		total += value; //perform addition
		
		history.append(" + " + value); //add operation to history
	}
	
	
	/*
	 * This method performs the subtract operation and adds the operation
	 * and value to the history
	 * @param value the number to be subtracted
	 */
	public void subtract (int value) 
	{
		total -= value; //perform subtraction
		
		history.append(" - " + value); //add operation to history
	}
	
	
	/*
	 * This method performs the multiply operation and adds the 
	 * operation and value to the history
	 * @param value the number to be multiplied
	 */
	public void multiply (int value) 
	{
		total *= value;  //perform multiplication
		
		history.append(" * " + value); //add operation to history
	}
	
	
	/*
	 * This method performs the divide operation if param is not 0
	 * and adds the operation and value to the history
	 * @param value the number to be divided
	 */
	public void divide (int value) 
	{
		if(value == 0) //If value is 0, set total to 0
		{
			total = 0;
		}
		else //else, perform division
		{
			total /= value;
		}
		
		history.append(" / " + value); //add operation to history
	}
	
	
	/*
	 * This method returns the entire history as a string
	 * @return string history
	 */
	public String getHistory () 
	{
		return history.toString();
	}
}