import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb= new StringBuilder(str);
      int a[]=new int[26];
      for(int j=0;j<26;j++)
        a[j]=0;
      int b=sb.length();
      for(int i=0;i<b;i++)
      {
        if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
        {
          char ch=sb.charAt(i);
          int x=ch-65;
          a[x]++;
        }
      }
      for(int k=0;k<b;k++)
      {
       if(sb.charAt(k)>='a' && sb.charAt(k)<='z')
        {
          char ch2=sb.charAt(k);
         int y=ch2-97;
          a[y]++;
        }
      }
      for(int l=0;l<26;l++)
      {
        if(a[l]==0)
          System.out.print((char)(l+97)+" ");
          
      }
    }
}