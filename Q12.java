import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int egg;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no of eggs");
    egg=sc.nextInt();
    int gross=egg/144;
    System.out.println("the gross is"+gross);
    gross=egg%144;
    int dozen=gross/12;
    System.out.println("the dozen is"+dozen);
    dozen=gross%12;
    System.out.println("the egg is"+dozen);
	}

}
