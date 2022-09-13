import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double invest,interest,year;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of invest amount");
    invest=sc.nextDouble();
    System.out.println("enter the value of interset rate");
    interest=sc.nextDouble();
    System.out.println("enter the number of year");
    year=sc.nextDouble();
    double future=invest*Math.pow((1+(interest/12)),year*12);
    System.out.println(future);
    
	}

}
