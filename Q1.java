import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of x");
int x=sc.nextInt();
try
{
	if(x<0)

{
	throw new NumberFormatException();
}
else
{
	System.out.println("It is ur lucky number");
}}
catch(NumberFormatException e)
{
	System.out.println("ur unlucky number "+e);
}

	}

}
