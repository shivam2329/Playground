import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        StringBuilder s=new StringBuilder(str);
      int p=0;
      int q=s.length();
      reverse_string(s,p,q);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
       StringBuilder sb2=new StringBuilder("");
       int a=sb.length();
      int b=a-1;
      int z=0;
     
      for(int i=a-1;i>=0;i--)
      {
        if(sb.charAt(i)==' ')
        {
          
         for(int j=i+1;j<=b;j++)
           sb2.append(sb.charAt(j));
          sb2.append(' ');
          b=i-1;
        }
      }
      String str2=sb2.toString();
      System.out.println(str2+'I');
    }
}