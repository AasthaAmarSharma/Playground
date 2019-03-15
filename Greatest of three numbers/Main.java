import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int a,b,c;
      
      Scanner sc= new Scanner(System.in);
      a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
      if(a>b && a>c){
        System.out.println(a);
    }
      else if(b>a && b>c){
        System.out.println(b);
    }
      if(c>b && a<c){
        System.out.println(c);
    }
    }
}