/*
�ۑ薼JKad09B
�쐬��:2022/05/12
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad09B{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
				System.out.print("�ЂƂ߂̐�������͂��Ă���������");
				int a = in.nextInt();
				System.out.print("�ӂ��߂̐�������͂��Ă���������");
				int b = in.nextInt();
				
				System.out.print("�N���v�Z���܂���(1:�̂ё�	�P�ȊO:�o�ؐ���");
				int c = in.nextInt();
				
				if( c == 1){
						System.out.println("�̂ё����v�Z���܂�");
						System.out.print(a+"��"+b+"��"+(a/b)+"�ł���");
							
				}else {
					System.out.println("�o�ؐ����v�Z���܂�");
						System.out.print(a+"��"+b+"��"+((double)a/b)+"�ł���");
				
				}
				
		}
	}