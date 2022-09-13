import java.util.Scanner;
public class Q7 {
static int fact(int x)
{
	if(x==0)
	{
		return 1;
	}
	else
	{
	return x*fact(x-1); 
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fact(5));
	}

}
