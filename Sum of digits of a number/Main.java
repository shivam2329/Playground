import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a=0,b;
      while(n!=0)
      {
        b=n%10;
        n=n/10;
        a=a+b;
      }
      System.out.println(a);
	}
}