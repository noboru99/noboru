/*
�ۑ薼JKad09C
�쐬��:2022/05/12
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class Jkad09C{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.println("�ЂƂ��������S�����ׂ܂�!");
			System.out.print("�����S�̐�����͂��Ă���������");
			int a = in.nextInt();
			System.out.print("�H�ׂ�l�̐�����͂��Ă���������");
			int b = in.nextInt();
			if (b>a){
					System.out.print("�����S�̐�������܂���I");
			
			} else{
			System.out.println("��������S�����ׂ܂����I");
			System.out.print("�c���������S�̐���"+(a-b)+"�ł��I");
			
			}
		}
	}