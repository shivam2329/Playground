import java.util.Scanner;
class Main{
  public static void prime(int x)
  {
    int flag=0;
    for(int i=1;i<=x;i++)
    {
      if(x%i==0)
        flag++;
    }
    if(flag==2)
    {
      System.out.println(x);
    }
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a=in.nextInt();
      for(int j=2;j<=a;j++)
        prime(j);
	}
}