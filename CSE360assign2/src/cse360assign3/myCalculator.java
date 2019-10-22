package cse360assign3;

public class myCalculator {
	public static void main(String[] args)
	{
		
		Calculator myCalculator = new Calculator();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(4);
		myCalculator.division(2);
		myCalculator.multiplication(3);
		myCalculator.power(2);
		myCalculator.multiplication(3);
		myCalculator.division(2);
		myCalculator.power(-1);
		System.out.println(myCalculator.toString());
		System.out.println("answer =" + myCalculator.getTotal());
		
		myCalculator.clear();
		
		myCalculator.add(6);
		myCalculator.add(6);
		System.out.println(myCalculator.toString());
		System.out.println("answer " + myCalculator.getTotal());
		
		
		
	}
}
