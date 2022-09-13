
public class multiplication {
static int mul(int x,int y)
{
	if(y==0)
	{
		return 0;
	}
	else
	{
		return x+mul(x,y-1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(mul(2,10));
	}

}
