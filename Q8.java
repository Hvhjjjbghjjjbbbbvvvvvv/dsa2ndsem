
public class Q8 {
static int power(int x,int y)
{
	if(y==0)
	{
		return 1;
	}
	else
	{
		return x*power(x,y-1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(power(2,5));
	}

}
