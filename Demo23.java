import java.util.Random;
public class Demo23{  //����û�������ֵ�� ÿ�����н��һ��
	public static void main(String[] args){
		//��ά����  java�������϶�ά���飬����Java��˵��һλ����Ͷ�ά����
		//��ά���飺��һ�����������棬ÿһ��ֵ������һ�����飬��ô�ͳ�Ϊ��ά����
		//�﷨:  ��������[][] ������=new ��������[����ĳ���][���������ֵ������ĳ���];
		
		int[][] ad=new int[5][4];//��Java����һ���飬������5��Ԫ��  ��ÿ��Ԫ�������飨������4��int�����ݣ���
		//�����û� ��һ����ά��5��3��
		int[][] smoke=new int[5][4];
		
		System.out.println(ad.length);//  5   ������ĳ���5���ڶ�������ĳ��� 4��
		
		//��ά����ĸ�ֵ���ְ��� ����������
		for(int i=0;i<ad.length;i++){
			//ad[i] ����һ������     ad[i] ����һ������ 	ad[i] ����һ������
			//int[] temp=ad[i]  
			for(int j=0;j<ad[i].length;j++){
				ad[i][j]=i+j+1;
			}
		}
		
		//ȡֵ
		for(int i=0;i<ad.length;i++){
			for(int j=0;j<ad[i].length;j++){
				System.out.print(ad[i][j]+"  ");
			}
			System.out.println();
		}
		//��ˣ��Ժ������к��е����֣���ά��������ѵ�����
		//����������ֶ�ά�������ϵĶ�ά����
	}
}