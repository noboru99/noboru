/*
�ۑ薼JKad12D
�쐬��:2022/05/23
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad12D{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.print("�����S�̐�����͂��Ă���������");
			int apple = in.nextInt();
			
			System.out.print("�H�ׂ�l�̐�����͂��Ă���������");
			int person = in.nextInt();
			int a=0;
			while (apple>person){
				System.out.println("�ЂƂ��������S��H�ׂ܂����I");
				apple-=person;
				a++;
			}
			System.out.println("���ꂼ��"+a+"�̃����S�����ׂ܂����I");
			System.out.println("�c���������S��"+apple+"�ł��I");
		}
	}