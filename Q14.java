
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(args[0]);
    System.out.println(args[1]);
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    if(a%b==0||b%a==0)
    {
    	System.out.println("they diveds both");
    }
    else
    {
    	System.out.println("they don't divide");
    }
	}

}
