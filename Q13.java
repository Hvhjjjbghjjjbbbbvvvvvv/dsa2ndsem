import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int min;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the minite value");
	min=sc.nextInt();
	double year=min/(365*24*60);
	System.out.println("The no of year"+(int)year);
	year=min%(365*24*60);
	double days=year/(24*60);
	System.out.println("The number of days"+days);
	

	}

}
