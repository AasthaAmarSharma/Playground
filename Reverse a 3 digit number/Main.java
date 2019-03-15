import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here 
int n,f,s,t,r;
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
f = n/100;
s = ((n/10)%10);
t = n%10;
r = (t*100)+(s*10)+f;
    System.out.println(r);
  }
}