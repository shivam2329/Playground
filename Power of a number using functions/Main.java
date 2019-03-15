import java.util.Scanner;
class Main{
  public static int power(int x,int y)
  {
    int z=x * y;
    return z;
  }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exponent = in.nextInt();
    int c=base;
    int d=base;
    for(int i=1;i<exponent;i++)
    {
      base=power(base,d);
     
    }
    System.out.println(base);
  }
}