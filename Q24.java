
public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double a=Math.random();
    double b=Math.random();
    double c=Math.random();
    double d=Math.random();
    double e=Math.random();
    double f=Math.random();
    double avg=a+b+c+d+e+f/6;
System.out.println("The average number is"+avg);
    double m=Math.min(a, b);
    double n=Math.min(m, c);
    double o=Math.min(n, d);
    double p=Math.min(o, e);
    double z=Math.min(p, f);
    System.out.println("the lowest number is"+z);
    double g=Math.max(a, b);
    double h=Math.max(g, c);
    double i=Math.max(h, d);
    double j=Math.max(i, e);
    double k=Math.max(j, f);
    System.out.println("the Highest number is"+k);
	
	}

}
