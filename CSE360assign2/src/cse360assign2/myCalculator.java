package cse360assign2;

public class myCalculator {
	public static void main(String[] args)
	{
		AddingMachine myCalculator = new AddingMachine();
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		
		System.out.println(myCalculator.toString());
		System.out.println("answe =" + myCalculator.getTotal());
		
		myCalculator.clear();
		
		myCalculator.add(6);
		myCalculator.add(6);
		System.out.println(myCalculator.toString());
		
		
		
		
	}
}
