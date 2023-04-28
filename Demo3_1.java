import java.util.Random;
public class Demo3{
	public static void main(String[] args){
		int a=110;
		int b=120;
		System.out.println(a+b);
		System.out.println(b-a);
		
		
		Random r=new Random();
		int[] arr=new int[6];
		for(int i=0;i<arr.length;i++){
			arr[i]=r.nextInt(21);
		}
		for(int i=arr.length-1;i<0;i++){
			System.out.println(arr[arr.length-1-i]);
		}
	}
}