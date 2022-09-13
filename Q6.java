import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double weight,height,BMI;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter ur weight in pound");
     weight=sc.nextDouble();
     System.out.println("enter ur height in inches");
     height=sc.nextDouble();
     weight=weight*0.45359237;
     height=height*0.0254;
     BMI=(float)(weight/Math.pow(height,2));
     System.out.println("BMI is"+BMI);
     
	}

}
