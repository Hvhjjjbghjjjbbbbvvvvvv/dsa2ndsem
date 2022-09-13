import java.util.Scanner;
class MarksOutOfBoundException extends Exception
{
	MarksOutOfBoundException(String n)
	{
		super(n);
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of mark");
int x=sc.nextInt();
try
{
	if(x>100)
	{
		throw new MarksOutOfBoundException("enter wrong number");
	}
	else
	{
		System.out.println("Enter right number");
	}
}
catch(MarksOutOfBoundException e)
{
	System.out.println("u score wrong number "+e);
}
	}

}
