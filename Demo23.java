import java.util.Random;
public class Demo23{  //这里没有随机赋值， 每次运行结果一样
	public static void main(String[] args){
		//二维数组  java并不承认二维数组，对于Java来说：一位数组和多维数组
		//二维数组：在一个人数组里面，每一个值，还是一个数组，那么就称为二维数组
		//语法:  数据类型[][] 变量名=new 数据类型[数组的长度][数组里面的值得数组的长度];
		
		int[][] ad=new int[5][4];//对Java：有一数组，数组有5个元素  而每个元素是数组（里面有4个int型数据），
		//对于用户 ：一个二维表，5行3列
		int[][] smoke=new int[5][4];
		
		System.out.println(ad.length);//  5   （数组的长度5，第二层数组的长度 4）
		
		//二维数组的赋值，手白了 ，还是数组
		for(int i=0;i<ad.length;i++){
			//ad[i] 还是一个数组     ad[i] 还是一个数组 	ad[i] 还是一个数组
			//int[] temp=ad[i]  
			for(int j=0;j<ad[i].length;j++){
				ad[i][j]=i+j+1;
			}
		}
		
		//取值
		for(int i=0;i<ad.length;i++){
			for(int j=0;j<ad[i].length;j++){
				System.out.print(ad[i][j]+"  ");
			}
			System.out.println();
		}
		//因此，以后，这种行和列的体现，二维数组是最佳的体现
		//尽量避免出现二维数组以上的多维数组
	}
}