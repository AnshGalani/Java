public class ExceptionDemo
{
    public static void main(String[] args)
    {
        try
        {
            int i=5;
            i=i/0;
        }
        catch (Exception e) 
        {
                System.out.println("you can not run ");
        }
    }
}