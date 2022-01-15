package throwAndThrowsExample;

public class ThrowsDemo {
	void Division() throws ArithmeticException
    {
        int a=5,b=0,result;
result = a / b;
        System.out.println("\tThe result is : " + result);
    }
     public static void main(String[] args)
    {
ThrowsDemo T = new ThrowsDemo();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.println("\tError : " + Ex.getMessage());
        }
        System.out.println("\tEnd of program.");
    }


}
