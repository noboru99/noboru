/*
�ۑ薼JKad09A
�쐬��:2022/05/12
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad09A{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.print("�̂ё��̓_������͂��Ă���������");
			int a = in.nextInt();
			System.out.print("�����������̓_������͂��Ă���������");
			int b = in.nextInt();
			System.out.print("�W���C�A���̓_������͂��Ă���������");
			int c = in.nextInt();
			System.out.print("�X�l�v�̓_������͂��Ă���������");
			int d = in.nextInt();
			System.out.print("�o�ؐ��̓_������͂��Ă���������");
			int e = in.nextInt();
			int max = a;
			if (b>max){
					max=b;
			}
			if (c>max){
				max=c;
			}
			if (d>max){
				max=d;
			}
			if (e>max){
				max=e;
			}
			System.out.print("��ԍ����_����"+max+"�ł�");
		}
	}