
public class Q10 {
static int fibo(int x)
{
	if(x==1)
	{
		return 0;
	}
	else if(x==2)
	{
		return 1;
	}
	else
	{
		return fibo(x-1)+fibo(x-2);
	}
		
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fibo(8));
	}

}
