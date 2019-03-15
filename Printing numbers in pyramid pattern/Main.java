import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i,j,k,a=1;
      for(k=1;k<=n;k++)
      {
        for(i=k-1;i<n-1;i++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=k;j++)
        {
          System.out.print(a);
          System.out.print(" ");
          a++;
        }
        System.out.print("\n");
      }
      
    }    
}