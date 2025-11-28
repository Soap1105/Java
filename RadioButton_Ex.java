import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton_Ex extends JFrame{
	
	private JRadioButton [] RB = new JRadioButton [3];
	private String [] text = {"사과","바나나","키위"};
	private ImageIcon [] Img = { 
					new ImageIcon("images/Apple.jpg"),
					new ImageIcon("images/Banana.jpg"),
					new ImageIcon("images/Kiwi.jpg")};
	private JLabel ImgLabel = new JLabel();
	
	public RadioButton_Ex() {
		setTitle("기말 대비 라디오버튼");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JPanel radio = new JPanel();
		radio.setBackground(Color.GRAY);
		ButtonGroup ButGroup = new ButtonGroup();
		
		for(int i=0; i < RB.length; i++) {
			RB[i] = new JRadioButton(text[i]);
			ButGroup.add(RB[i]);
			radio.add(RB[i]);
			RB[i].addItemListener(new MyItemListener()); 
		}
		RB[2].setSelected(true); //기본적으로 뭘 고르고있는 상태인지
		cp.add(radio, BorderLayout.NORTH);cp.add(ImgLabel, BorderLayout.CENTER);
		ImgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		setSize(250,200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			if(RB[0].isSelected())
				ImgLabel.setIcon(Img[0]);
			else if (RB[1].isSelected())
				ImgLabel.setIcon(Img[1]);
			else
				ImgLabel.setIcon(Img[2]);
		}
	}
	public static void main(String[] args) {
		new RadioButton_Ex();
	}
}
