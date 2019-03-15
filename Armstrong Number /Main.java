import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      int a,b=0,c,d,e=0,i;
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      a=n;c=n;
      while(a!=0)
      {
        a=a/10;
        b++;
      }
      for(i=1;i<=b;i++)
      {
        d=c%10;
        d=d*d*d;;
        e=e+d;
        c=c/10;
      }
      if(n==e)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}