/*
�ۑ薼JKadRen11
�쐬��:2022/05/19
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad11D{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			
			System.out.print("�ЂƂ߂̐�������͂��Ă���������");
			int a = in.nextInt();
			System.out.print("�ӂ��߂̐�������͂��Ă���������");
			int b = in.nextInt();
			System.out.print(a+"+"+b+"�̓�������͂��Ă���������");
			int c = in.nextInt();
			
			boolean correct = (c==a+b);
			
			if (correct){
				System.out.println("����́E�E�E"+correct);
				System.out.print("�����ł��I");
			}else{
				System.out.println("����́E�E�E"+correct);
				System.out.print("�s�����ł��I");
				}
		}
	}