import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int i=n*n;
    return i;
  }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      a=square(a);
      System.out.println(a);
	} 
  
}