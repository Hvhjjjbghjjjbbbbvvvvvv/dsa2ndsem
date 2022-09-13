
public class Q16 {
	public static void main(String[] args)
	{
	System.out.println(args[0]);
	System.out.println(args[1]);
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=(int)((Math.random()*(b-a+1))+a);
	int d=(int)((Math.random()*(b-a+1))+a);
	System.out.println("the random integer are "+c+" "+d+" and there sumtion is"+(c+d));
	}

}
