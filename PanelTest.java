import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.awt.Font;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.GridLayout;
import javax.ActionEvent;
import javax.ActionListener;

public class PanelTest extends JFrame{
    public static void main(String[] args) {
        PanelTest frame = new PanelTest("Panel TEST");
        frame.setVisible(true);    // �\���ݒ�
    }
	// �R���X�g���N�^
    PanelTest(String title){
        setTitle(title);    // �E�B���h�E�^�C�g����
        setBounds(100, 100, 600, 400);// (�\���ʒuX���A�\���ʒuY���A�����A�c��)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();    // �ǉ��p�̃p�l���̍쐬
		JButton button = new JButton("�{�^��");
		
        JLabel label = new JLabel("HELLO ECC"); // �\���p�̃��x���̍쐬
        panel.add(label);               // �p�l���Ƀ��x����ǉ�
		panel.add(button);
        Container contentPane = getContentPane();   // �R���e���c�p�l�����擾
        contentPane.add(panel, BorderLayout.CENTER);    // �p�ӂ����p�l�����R���e���c�p�l���ɒǉ�
		
		
    }
}
