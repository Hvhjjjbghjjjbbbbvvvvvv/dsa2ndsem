
public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		double p=Double.parseDouble(args[0]);
		double r=Double.parseDouble(args[1]);
		int t=Integer.parseInt(args[2]);
		double value=p*Math.exp(r*t);
		System.out.println("the total of payment given in the year is"+value);
		double month=value/12;
		System.out.println("the payment given in the year is"+month);
		double z=Math.exp(r*t);
		System.out.println(z);
	}

}
