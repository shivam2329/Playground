import java.util.Scanner;
class Main{
  public static int shivam(int x)
  {
    int y=0;
    while(x>=1)
    {
       y=y+(x--);
    }
    return y;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      n=shivam(n);
      System.out.println(n);
	}
}