import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        StringBuilder sb1=new StringBuilder(str1);
        StringBuilder sb2=new StringBuilder(str2);
        StringBuilder sb3=new StringBuilder("");
        sb3.append(sb1);
        sb3.append(sb1);
        String str3=sb3.toString();
        if(str3.contains(str2)==true)
          System.out.println("Yes");
      else
        System.out.println("No");
    }
}