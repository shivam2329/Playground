
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in = new Scanner(System.in);
    String str=in.nextLine();
    StringBuilder sb=new StringBuilder(str);
    int a=sb.length();
    int n=0;
    int x=0;
    for(int i=0;i<a;i++)
    {
      if(sb.charAt(i)!='-'){
      int p=sb.charAt(i)-48;
      n=n*10+p;}
      else
        x=1;
    }
    if(x==0)
    System.out.println(n);
    else
      System.out.println(-n);
  }
}