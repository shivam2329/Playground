import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
    while(n>=99)
    {
      n=n/10;
    }
      int a = n%10;
      System.out.println(a);
    }}