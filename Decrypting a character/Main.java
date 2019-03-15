import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char n=in.next().charAt(0);
      int a=in.nextInt();
      int b=n;
      if(b-a<97 && b-a>91)
      {
        n=(char)(n+(26-a));
      }
      else
        n=(char)(n-a);
      System.out.println(n);
    }
}