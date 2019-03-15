import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here
      Scanner in = new Scanner(System.in);
      String str= in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      String str2=in.nextLine();
      String str3=in.nextLine();
      String str4=str.replace(str2,str3);
      System.out.println(str4);
    }
}