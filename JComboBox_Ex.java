import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBox_Ex extends JFrame{

	private String [] fruits = {"사과","바나나","키위","망고"};
	private ImageIcon [] images = {new ImageIcon ("images/apple.jpg"),
			new ImageIcon ("images/Banana.jpg"),
			new ImageIcon ("images/Kiwi.jpg"),
			new ImageIcon ("images/Mango.jpg")};
	
	private JLabel ImageLabel = new JLabel(images[0]);
	
	
	public JComboBox_Ex(){
		setTitle("기말 연습 콤보박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JComboBox <String> CB = new JComboBox<String>(fruits);
		
		cp.add(CB);cp.add(ImageLabel);
		
		
		CB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> CB = (JComboBox<String>)e.getSource();
				int index = CB.getSelectedIndex();
				ImageLabel.setIcon(images[index]);
			}
			
		});
		
		
		setSize(250,250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JComboBox_Ex();

	}

}
