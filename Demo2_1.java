import java.util.Random;
public class Demo2{
	public static void main(String[] args){
		//编写程序，将一个数组中的元素倒排过来。例如原数组为1，2，3，4，5
		Random r=new Random();
		int[] arr=new int[6];
		for(int i=0;i<arr.length;i++){
			arr[i]=r.nextInt(21);
		}
		for(int i=arr.length-1;i<0;i++){
			System.out.println(arr[i]);
		}
	}
}