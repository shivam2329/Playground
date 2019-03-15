import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int c=0,e=0;
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int b[]=new int[10];
      int d[]=new int[10];
      for(int j=0;j<n;j++)
      {
        if(a[j]==0)
        {
          b[c++]=a[j];
        }
        else
        {
          d[e++]=a[j];
        }
      }
      for(int k=0;k<=e;k++)
        a[k]=d[k];
      int f=(n-e)-1;
      for(int l=1;l<=f;l++)
      a[e+l]=0;
      for(int m=0;m<n;m++)
        System.out.print(a[m]+" ");
      
    }
}