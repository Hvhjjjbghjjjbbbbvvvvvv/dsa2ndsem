import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radious,length,area,volume;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of radious");
		radious=sc.nextDouble();
		System.out.println("enter the value of length");
		length=sc.nextDouble();
		area=radious*radious*3.14;
		volume=area*length;
		System.out.println("The area is"+area);
		System.out.println("The volume is"+volume);
	}

}
