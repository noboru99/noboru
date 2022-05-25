import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame implements ActionListener{
	JTextField jt;
	int firstNumber;
	int secondNumber;
	int result1;
	double result2;
	int operator = 0;
	
	Calculator(){
		
		jt= new JTextField(15);
		Font f = new Font ("Century", Font.ITALIC,20);
		jt.setFont(f);
		
		JButton b0=new JButton("0"); b0.setFont(f);
		JButton b1=new JButton("1"); b1.setFont(f);
		JButton b2=new JButton("2"); b2.setFont(f);
		JButton b3=new JButton("3"); b3.setFont(f);
		JButton b4=new JButton("4"); b4.setFont(f);
		JButton b5=new JButton("5"); b5.setFont(f);
		JButton b6=new JButton("6"); b6.setFont(f);
		JButton b7=new JButton("7"); b7.setFont(f);
		JButton b8=new JButton("8"); b8.setFont(f);
		JButton b9=new JButton("9"); b9.setFont(f);
		
		JButton bplus=new JButton("+");		bplus.setFont(f);
		JButton bminus=new JButton("-");	bminus.setFont(f);
		JButton bmulti=new JButton("x"); 	bmulti.setFont(f);
		JButton bdivide=new JButton("/"); 	bdivide.setFont(f);
		JButton bequal=new JButton("="); 	bequal.setFont(f);
		JButton bclear=new JButton("C"); 	bclear.setFont(f);
		JButton back=new JButton("<"); 		back.setFont(f);
		JButton sqr=new JButton("sqr"); 	sqr.setFont(f);
		JButton divide1=new JButton("1/x"); 	divide1.setFont(f);
		JButton bn=new JButton("%"); 		bn.setFont(f);
		
		
		Container con =getContentPane();
		con.setLayout(new GridLayout(6,1));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		jt.setText("0");
		
		jt.setHorizontalAlignment(SwingConstants.RIGHT);
		
		jt.setEditable(false);
		
		p2.setLayout(new GridLayout(1,4));
		p3.setLayout(new GridLayout(1,4));
		p4.setLayout(new GridLayout(1,4));
		p5.setLayout(new GridLayout(1,4));
		p6.setLayout(new GridLayout(1,4));
		
		p1.add(jt);
		p2.add(b7);		p2.add(b8);		p2.add(b9);		p2.add(bplus);
		p3.add(b4);		p3.add(b5);		p3.add(b6);		p3.add(bminus);
		p4.add(b1);		p4.add(b2);		p4.add(b3);		p4.add(bmulti);
		p5.add(bclear);	p5.add(b0);		p5.add(bequal);	p5.add(bdivide);
		p6.add(back);	p6.add(sqr);	p6.add(divide1);	p6.add(bn);
		
		con.add(p1);
		con.add(p2);
		con.add(p3);
		con.add(p4);
		con.add(p5);
		con.add(p6);
		
		b0.addActionListener(this);		b1.addActionListener(this);
		b2.addActionListener(this);		b3.addActionListener(this);
		b4.addActionListener(this);		b5.addActionListener(this);
		b6.addActionListener(this);		b7.addActionListener(this);
		b8.addActionListener(this);		b9.addActionListener(this);
		
		bplus.addActionListener(this);		bminus.addActionListener(this);
		bmulti.addActionListener(this);		bdivide.addActionListener(this);
		bequal.addActionListener(this);		bclear.addActionListener(this);
		back.addActionListener(this);		sqr.addActionListener(this);
		divide1.addActionListener(this);	bn.addActionListener(this);
		
		setTitle("ŽÀK");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		}
		
		public void actionPerformed(ActionEvent e){
			String s = e.getActionCommand();
			String oldText = jt.getText();
			
			if(oldText.equals("0"))
				oldText="";
			switch(s){
				case"+":
					operator=1;
					firstNumber=Integer.parseInt(jt.getText() );
					jt.setText("0");
					break;
				case"-":
					operator=2;
					firstNumber=Integer.parseInt(jt.getText() );
					jt.setText("0");
					break;
				case"x":
					operator=3;
					firstNumber=Integer.parseInt(jt.getText() );
					jt.setText("0");
					break;
				case"/":
					operator=4;
					firstNumber=Integer.parseInt(jt.getText() );
					jt.setText("0");
					break;
				case"%":
					operator=5;
					firstNumber=Integer.parseInt(jt.getText() );
					jt.setText("0");
					break;
				case"=":
					switch(operator){
						case 1:
						secondNumber = Integer.parseInt(jt.getText() );
						result1=firstNumber + secondNumber;
						jt.setText( String.valueOf(result1));
						break;
						case 2:
						secondNumber = Integer.parseInt(jt.getText() );
						result1=firstNumber - secondNumber;
						jt.setText( String.valueOf(result1));
						break;
						case 3:
						secondNumber = Integer.parseInt(jt.getText() );
						result1=firstNumber * secondNumber;
						jt.setText( String.valueOf(result1));
						break;
						case 4:
						secondNumber = Integer.parseInt(jt.getText() );
						result1=firstNumber / secondNumber;
						jt.setText( String.valueOf(result1));
						break;
						case 5:
						secondNumber = Integer.parseInt(jt.getText() );
						result1=firstNumber % secondNumber;
						jt.setText( String.valueOf(result1));
						//break
					}
					break;
				case"C":
					jt.setText("0");
					break;
				case"<":
				
				
				
				if(jt.getText().length()==1)
					jt.setText("0");
					else jt.setText(oldText.substring(0,(oldText.length()-1)));
					break;
					
				case"sqr":
					if(jt.getText().equals("0"))break;
					firstNumber = Integer.parseInt(jt.getText() );
					result2 = Math.sqrt((double)firstNumber);
					jt.setText(String.valueOf(result2));
					break;
				case"1/x":
				
					if(jt.getText().equals("0")) break;
					firstNumber = Integer.parseInt(jt.getText());
					result2 = 1/(double)firstNumber;
					jt.setText(String.valueOf(result2));
					break;
					
				case"0":	case"1":	case"2":	case"3":	case"4":
				case"5":	case"6":	case"7":	case"8":	case"9":
				jt.setText(oldText +s);
			}
		}
	}
							
public class swing12{
	public static void main(String[] args){
		new Calculator();
	}
}
	
		
		
		
		
		