/*
�ۑ薼JKad11S
�쐬��:2022/05/19
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad11S{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.println("�O�p�`�����܂��I");
			System.out.print("��1�̒�������͂��Ă���������");
			int n1 = in.nextInt();
			System.out.print("��2�̒�������͂��Ă���������");
			int n2 = in.nextInt();
			System.out.print("��3�̒�������͂��Ă���������");
			int n3 = in.nextInt();
			
			
			if (n1<n2+n3 && n2<n1+n3 && n3<n1+n2){
				if (n1==n2&&n2==n3){
					System.out.println("���O�p�`�ɂȂ�܂��I");
				}else if (n1==n2||n1==n3||n2==n3){
					System.out.println("�񓙕ӎO�p�`�����܂��I");
				}else {
					System.out.println("�O�p�`�ɂȂ�܂��I");
				}
			}else {
				System.out.println("�O�p�`�ɂȂ�܂���I");
			}
			
		}
	}