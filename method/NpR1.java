class NpR1
{
	public static void main(String npr[])
	{
		System.out.println("Main Method Started");
		//nPr = n!/(n-r)!
		int n = 10;
		int r = 4;
		
		
		int nPr = Factorial1.getFact(n)/Factorial1.getFact(Factorial1.totalNumberOfThings(n, r));
		
		System.out.println("The final result is " + nPr);
		System.out.println("Main Method Ended");
	}
	
}