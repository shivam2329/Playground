import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=1;i<=n;i++)
      {
        if(i%2!=0)
        {
        for(int j=1;j<=n;j++)
        {
          if(j==n)
            System.out.print(i+1);
           else
            System.out.print(i);
        }
          System.out.print("\n");
         
        }
        else
        {
           for(int k=1;k<=n;k++)
        {
          if(k==1)
            System.out.print(i+1);
           else
            System.out.print(i);
        }
          System.out.print("\n");
        }}
	}
}