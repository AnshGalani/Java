public class ArrayException
{
	public static void main(String[] args)
	{
		int value;
		try
		{
			int arr[]={6,16,26,36,46,56,66,76};
			int index=8;
			value=arr[index];
			System.out.println("Execution Does not exits");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Valid index are 0 to 7");	
		}
		System.out.println("End of Program");
	}
}