
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(args[0]);
   System.out.println(args[1]);
   int a=Integer.parseInt(args[0]);
   int b=Integer.parseInt(args[1]);
  
  int c=(int)((Math.random()*(b-a+1))+a);
  System.out.println("The number between"+a+" and b"+b+" is "+c);
	}

}
