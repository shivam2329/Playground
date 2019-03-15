import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      while(n1!=n2)
      {
        if(n1>n2)
          n1=n1-n2;
        else
          n2=n2-n1;
      }
      System.out.println(n2);
	}
}