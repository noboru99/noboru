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
        frame.setVisible(true);    // 表示設定
    }
	// コンストラクタ
    PanelTest(String title){
        setTitle(title);    // ウィンドウタイトル名
        setBounds(100, 100, 600, 400);// (表示位置X軸、表示位置Y軸、横幅、縦幅)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();    // 追加用のパネルの作成
		JButton button = new JButton("ボタン");
		
        JLabel label = new JLabel("HELLO ECC"); // 表示用のラベルの作成
        panel.add(label);               // パネルにラベルを追加
		panel.add(button);
        Container contentPane = getContentPane();   // コンテンツパネルを取得
        contentPane.add(panel, BorderLayout.CENTER);    // 用意したパネルをコンテンツパネルに追加
		
		
    }
}
