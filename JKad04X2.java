/*
�ۑ薼JKad04X2
�쐬��:2022/04/21
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
public class JKad04X2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("0����U�T�T�R�T�܂ł̐�������͂��Ă���������");
			int s = in.nextInt();
			
			
			System.out.println("�ŏ�ʃr�b�g���珇�ɕ\�����܂��I");
			String i="";
		
			while(s!=0){
					
					i = (s%2) + i;
					s/=2;
					
					}
			
			System.out.print(i);
			in.close();
	}
}