import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int i,j,k;
      for(i=1;i<=n;i++)
  {
    for(j=i;j<=n-1;j++)
    System.out.print(" ");
    
    for(k=1;k<=(i*2)-1;k++)
    {
      System.out.print("*");
    }
    System.out.print("\n");
	}
}
}