import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
        int a=0,i,j;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        {
          if(a%2!=0){
            System.out.print("#");
            a++;}
          else{
            System.out.print("*");
            a++;}
         
        }
         System.out.print("\n");
      }
    }
}