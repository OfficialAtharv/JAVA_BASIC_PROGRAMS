class  main {
    public boolean isodd(int number) {
        return number % 2 != 0;
    }

    public boolean iseven(int number) {
        return number % 2 == 0;
    }
}
class even_odd extends main
{
	public static void main(String args[])
		{
		even_odd eo = new even_odd();
		System.out.println("The even and odd numbers between 1 to 20 are :-"); 
 		for(int i=1;i<21;i++)
  		{
			if(eo.iseven(i))
     			{
       				System.out.println("even number is :- "+i);
     			} 
     			else if(eo.isodd(i))
			{
       				System.out.println("Odd number is :- "+i);
     			}  
  		}
		}
	}