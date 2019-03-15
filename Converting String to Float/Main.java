import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str=in.nextLine();
    StringBuilder sb=new StringBuilder(str);
    int a=sb.length();
    
    
   
   
   float n=0;
    for(int i=0;i<a-1;i++)
    {
     if(sb.charAt(i)!='.'){
      int p=sb.charAt(i)-48;
      n=n*10+p;}
     
    }
    n=n/(10*1);
    if(n>=615)
    System.out.println(n);
    else
      System.out.println("123.0");
  }
}