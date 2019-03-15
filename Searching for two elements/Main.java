import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      for(int j=0;j<2;j++)
      {
        int flag=0;
        int b=in.nextInt();
        for(int k=0;k<n;k++)
        {
          if(a[k]==b){
            System.out.println(k);
            flag++;
            break;}
        }
        if(flag==0)
          System.out.println(-1);
      }
    }
}