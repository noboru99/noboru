/*
�ۑ薼JKad15X
�쐬��:2022/06/02
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad15X {
		public static void dekisugi(int v, int h){
			System.out.println("����͂Ȃ��Ȃ��育�킢��");
			System.out.println("�Ƃ肠����1�񊄂��āA���ꂼ����܂������āA�S��"+breakoff(v,h));	
			
		}
		public static void sizuka(int v, int h){
			System.out.println("����ȊȒP��");
			System.out.println("1�񊄂�΁����S��"+v*h+"�ɂ���ɂ�"+(v*h-1)+"��");	
		}
		public static int breakoff(int v, int h){
			int dh;//�c�̒l divide heigth
			dh=v; 
			int dw;//�c�̒l divide width
			dw=h;
			int vw;//�c�̉��Z��������
			vw=0;
			int hw;//���̉��Z��������
			hw=0;
			while (dh>1){
				dh=dh-1;
				vw++;       //1�������ĉ��Z����
				if (dh==1){
					vw=vw*dw;//�c�ŕ������炻������̕���������
					break;
				}
			}
			while (dw>1){
				dw=dw-1;
				hw++;  //���̕��𕪂��ĉ��Z����
				if (dw==1){
					break;
				}
			}
			int sum;
			sum=vw+hw;//�c�ŕ����镪�Ɖ��ŕ�������������
		return sum;
		
		}
		
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.println("�`���R�������Ă����܂�");
			System.out.print("�c�̃u���b�N�͂����ł���");
			int length = in.nextInt(); 
			System.out.print("���̃u���b�N�͂����ł���");
			int width = in.nextInt(); 
			System.out.print("�N���������v�Z���܂���(1:�o�ؐ�����, ����ȊO:������)");
			int num = in.nextInt(); 
			if (num==1){
				dekisugi(length,width);
			}
			if (num==2){
				sizuka(length,width);
			}
		}
		
	}