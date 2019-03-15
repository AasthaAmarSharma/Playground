import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int year;
      year=in.nextInt();
		// Type your code here
      if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
System. out. println("Leap year");}
      else
System. out. println("Non Leap year");
    }
}