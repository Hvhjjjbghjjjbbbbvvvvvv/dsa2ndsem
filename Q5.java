import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v0,v1,average;
		int time;
		System.out.println("enter the intial velocity");
		Scanner sc=new Scanner(System.in);
		v0=sc.nextDouble();
		System.out.println("enter the final velocity");
		v1=sc.nextInt();
		System.out.println("Enter the Time");
		time=sc.nextInt();
		average=(v1-v0)/time;
		System.out.println("average is"+average);
		

	}

}
