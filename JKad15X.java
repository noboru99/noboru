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
			//System.out.println("1�񊄂�΁����S��"+(v*h)-1);	
		}
		public static int breakoff(int v, int h){
			int va;//��
			va=v; 
			int ha;//��
			ha=h;
			int vw;//�]��
			vw=0;
			int hw;//�]��
			hw=0;
			while (va>1){
				va=va-1;
				vw++;
				if (va==1){
					vw=vw*ha;
					break;
				}
			}
			while (ha>1){
				ha=ha-1;
				hw++;
				if (ha==1){
					break;
				}
			}
			int sum;
			sum=vw+hw;
		return sum;
		
		}
		
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.println("�`���R�������Ă����܂�");
			System.out.println("�c�̃u���b�N�͂����ł���");
			int length = in.nextInt(); 
			System.out.println("���̃u���b�N�͂����ł���");
			int width = in.nextInt(); 
			System.out.println("�N���������v�Z���܂���(1:�o�ؐ�����, ����ȊO:������)");
			int num = in.nextInt(); 
			if (num==1){
				dekisugi(length,width);
			}
		}
		
	}