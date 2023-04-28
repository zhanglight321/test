public class Demo3{
	public static void main(String [] args){
		int x=10;
		int y=4;
		System.out.println(1.0*x/y);
		x++;
		System.out.println(x);
		int a=10;
		int b=a++ + a++ + a++;
		System.out.println(b);
		
		a=10;
		b=a++ + ++a + ++a;
		System.out.println(b);
		System.out.println(Math.pow(2,3));
		
		int i=2;
		i=i++;
		System.out.println(i);
		
		int a1=2147483647;
		System.out.println(a1+1);
		
		 
	}
}