package ExceptionTest;

public class Test6 {
    public static void main(String args[])
    {
        try
        {
            int arr[]= {1, 2, 3, 4, 5};
            for (int i = 0; i <= 5; i++)
            {
                System.out.print ("Array elements are : " + arr[i] + "\n");
            }
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println ("ArrayIndexOutOfBoundsException : "+ ex);
        }
        catch (Exception e)
        {
            System.out.println ("Exception : " + e);
        }

    }
}
