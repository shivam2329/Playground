import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str= in.nextLine();
    StringBuilder sb1=new StringBuilder(str);
    StringBuilder sb2=new StringBuilder("");
    int a=sb1.length();
    for(int i=0;i<a;i++)
    {
      char temp=sb1.charAt(i);
      if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'||temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U')
        continue;
      else
        sb2.append(sb1.charAt(i));
    }
    System.out.println(sb2);
  }
}