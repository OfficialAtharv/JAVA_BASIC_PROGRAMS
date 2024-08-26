import java.util.Arrays;
class Quetion_ten{
	public static void main(String args[])
	{
	  int[] arr ={ 1,2,3,4,5,6,7,8,9,10 };
	  System.out.println("Given array is - "+Arrays.toString(arr));
	  int temp = arr[0];
	  arr[0]= arr[arr.length - 1];
	  arr[arr.length-1]= temp;
	  System.out.println("Array after swapping first and last elements: ");
          printArray(arr);
	  
	}
	public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}


