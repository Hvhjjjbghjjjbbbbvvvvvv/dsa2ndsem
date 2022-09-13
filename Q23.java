
public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		int m=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);

		int e=Math.min(d,m);
		int minimum=Math.min(c, e);
		int f=Math.max(d,m);
		int maximum=Math.max(c, e);
		int middile=(m+d+c)-(maximum+minimum);
		System.out.println("The lowest number is"+minimum+" the middile number is"+middile+" the highest number is"+maximum);
	}

}
