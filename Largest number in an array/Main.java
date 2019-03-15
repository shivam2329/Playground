import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      for(int j=0;j<n-1;j++)
      {
        if(a[j]>a[j+1])
          a[j+1]=a[j];
      }
      System.out.println(a[n-1]);
    }
}