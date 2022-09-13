
public class Q17 {
	public static void main(String[] args)
	{
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		if((a>=b+c)||(b>=c+a)||(c>=a+b))
		{
			System.out.println("any of the integer is greater orequal to sum of two others");
		}
		else
		{
			System.out.println("any of the integer is not greater or equal to sum of two others");	
		}
		
		
	}

}
