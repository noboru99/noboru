/*
�ۑ薼JKad09S
�쐬��:2022/05/12
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad09S{
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
			int max2;
				max2=b;
			
			
			if (b>max){
				max2=max;
				max=b;
					}
			if (c>max){
				max2=max;
				max=c;
					}else{
						if(c>max2){
							max2=c;
							}
					}
			
			if (d>max){
				max2=max;
				max=d;
					}else{
						if(d>max2){
							max2=d;
							}
					}
			
			if (e>max){
				max2=max;
				max=e;
				}else{
					if(e>max2){
							max2=e;
						}
				}
			System.out.print("��ԍ����_����"+max2+"�ł�");
		}
	}