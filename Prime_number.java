class Prime_number
{
	public static void main(String args[])
	
	{
	int sum = 0;
	 for (int i=2;i<=100;i++)
	 {
		Boolean isprime=true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime)
		{
			System.out.print(" "+i+" , ");
			sum+=i;
		}

	 }
           System.out.println("Sum of all prime number is :- " +sum);				 
	}
}