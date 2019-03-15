import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int a=sb.length();
      
      for(int i=0;i<a;i++)
      {
        int b=0;
        char ch=sb.charAt(i);
         if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
          {
        for(int j=0;j<a;j++)
        {
         
             if(ch==sb.charAt(j))
              {
                b++;
                sb.setCharAt(j,(char)(0));
              }
          
        }
           if(ch>='A' && ch<='Z')
           {
            System.out.print((char)(ch+32));
          System.out.print(b+" ");
           }
           else
           {
           System.out.print(ch);
          System.out.print(b+" ");
           }
         }
        
      }
    }
}