/*
�ۑ薼JKad10D
�쐬��:2022/05/16
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad010D{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.println("�������I�������ɍs�����I");
			System.out.print("���Ȃ��̔N�����͂��Ă���������");
			int a = in.nextInt();
			if(a<6){
				System.out.print("�����ł��I");
			}
			if((6<=a)&&(a<15)){
				System.out.print("�q���̗����F200�~�ɂȂ�܂��I");
			}
			if(a>=15){
				System.out.print("��l�����F500�~�ɂȂ�܂��I");
			}
				
	}
}