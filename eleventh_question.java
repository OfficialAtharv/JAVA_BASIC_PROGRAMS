class eleventh_question
{
	public static void main (String args[])
	{
		int even=0;
		int odd=0;
		int array[]={10,234,83,76,109,68,72,22,45,43};
		for(int i=0;i<array.length;i++)
		{
			System.out.print(" "+ array[i]+", ");
		}
		System.out.println();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				even++;
			      	System.out.println("The given number is even - "+array[i]);
			}
			else if(array[i]%2!=0)
			{
				odd++;
				System.out.println("The given number is Odd - "+array[i]);
			}
		}
		System.out.println("Count of Even numbers in Array is :- "+even);
		System.out.println("Count of Odd numbers in Array is :- "+odd);

	}
}