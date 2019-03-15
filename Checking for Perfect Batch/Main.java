import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int x=0;
    int b=a[0]+a[1]+a[2];
    for(int j=3;j<n;j=j+3)
    {
     int c=0;
      c=a[j]+a[j+1]+a[j+2];
      if(b==c)
        continue;
      else
      {
        System.out.println("Not a Perfect Batch");
        x++;
        break;}
    }
    if(x==0)
      System.out.println("Perfect Batch");
  }
}