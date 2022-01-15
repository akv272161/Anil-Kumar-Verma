package FinallyBlockExample;

public class FinallyBlockDemo {
    public static void main(String[] args)
    {
        int a=45,b=0,rs=0;
        try
        {
            rs = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.println("Error : " + Ex.getMessage());
        }
        finally
        {
            System.out.println("The result is : " + rs);
        }
    }


}
