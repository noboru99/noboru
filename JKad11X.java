/*
�ۑ薼JKad11X
�쐬��:2022/05/19
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad11X{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int s;
			s=0;
			int i;
			String a="Fizz!";
			String b="Buzz!";
			String c="FizzBuzz!";
			
			for(i=0; i<40; i++){
				s++;
				
				if (s%3==0){
					if (s%5==0){
					System.out.println(c);
					}else {
						System.out.println(a);
					}
					
				}else if (s%5==0){
					System.out.println(b);
				}else{
					System.out.println(s);
				}
			}
			
		}
	}