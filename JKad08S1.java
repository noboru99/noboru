/*
�ۑ薼JKad08S1
�쐬��:2022/04/21
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
public class JKad08S1{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.println("A����̑O���Ԃ��ʉ߂��܂��I");
			
			System.out.print("��Ԃ̑��x�i�����j����͂��Ă���������");
			int a = in.nextInt();
			System.out.print("��Ԃ̒����i���[�g���j����͂��Ă���������");
			int b = in.nextInt();
			System.out.println((double)(b*3600)/(a*1000)+"�b������܂��I");
			//��=�����@a������
			
		}
}