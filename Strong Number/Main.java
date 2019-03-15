import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a,b,c=1,d=0,i;
      a=n;
      
      while(a!=0)
      {
        b=a%10;
        a=a/10;
        for(i=1;i<=b;i++)
        {
          c=c*i;
        }
        d=d+c;
        c=1;
      }
      if(d==n)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}