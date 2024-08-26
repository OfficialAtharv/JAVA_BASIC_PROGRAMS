import java.util.Scanner;
class Qthree {
public static void main (String args[])
{
 Scanner sc = new Scanner (System.in);
  int num; 
  int index=0; 
   int arr[]=new int[10];
   System.out.println("Enter a decimal number:-");
   num = sc.nextInt();
   while(num>0){
   arr[index]=num%2;
   index++;
   num = num/2;
   }
   System.out.println("Binary number is -");
   for(int i=index-1; i>=0;i--)
  {
   System.out.print(arr[i]);
  } 

}

}