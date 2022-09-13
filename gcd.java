
public class gcd {
public static int gc(int x,int y)
{
	if(x==0)
	{
		return y;
	}
	else {
		return gc(y%x,x);
}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(gc(12,33));
	}

}
