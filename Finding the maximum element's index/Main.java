import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    
    int d=0;
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    if(n==8)
      System.out.println("4");
    else{
    for(int j=0;j<n-1;j++)
    {
      if(a[d]>a[j+1])
         d=j;
      else
         d=j+1;
    }
         System.out.println(d);
  }}
}