import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int a=0;
      int b=sb.length();
      int e=b-1;
      while(a<e)
      {
        char c=sb.charAt(a);
        char d=sb.charAt(e);
        sb.setCharAt(a,d);
        sb.setCharAt(e,c);
        a++;
        e--;
      }
      String str2=sb.toString();
     if(str.equals(str2)==true)
      System.out.println("Yes");
      else
     System.out.println("No");
    } 
}