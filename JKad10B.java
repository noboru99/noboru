/*
�ۑ薼JKad10B
�쐬��:2022/05/16
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad10B{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.println("�������I�����ق֍s�����I");
			System.out.print("���Ȃ��̔N�����͂��Ă���������");
			int a = in.nextInt();
			
			if(a>=65){
				System.out.print("�V�j�A�����F2200�~�ɂȂ�܂��I");
			}
			if(a>=15&&a<65){
				System.out.print("��l�����F2400�~�ɂȂ�܂��I");
			}
			if(a>=6&&a<15){
				System.out.print("�q�ǂ������F1200�~�ɂȂ�܂��I");
			}
			if(a>=3&&a<6){
				System.out.print("�c�������F600�~�ɂȂ�܂��I");
			}
			if(a<3){
				System.out.print("�����ł��I");
			}
		}
	}