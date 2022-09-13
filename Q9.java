
public class Q9 {
	static int reverse(int x,int y)
	{
		if(x==0)
		{
			return y;
		}
		else
		{
			return reverse(x/10,y*10+x%10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(reverse(432,0));
	}

}
