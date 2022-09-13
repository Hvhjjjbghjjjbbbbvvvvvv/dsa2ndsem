
public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		if((a<b&&a<c)||(a>b&&a>c))
		{
			System.out.println("it is either in ascending order or in descending order");
		}
		else
		{
			System.out.println("it is neither in ascending order nor in descending order");
		}
		
	}

}
