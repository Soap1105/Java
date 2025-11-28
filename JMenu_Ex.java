import javax.swing.*;
import java.awt.event.*;

public class JMenu_Ex extends JFrame {

	public JMenu_Ex() {
		setTitle("Menu 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 1. [JMenuBar] 식판(바) 만들기
		JMenuBar mb = new JMenuBar();
		
		// 2. [JMenu] 반찬 그릇(메뉴) 만들기
		// 사진에 있는 Screen, Edit, Source... 등을 만듭니다.
		JMenu screenMenu = new JMenu("Screen");
		JMenu editMenu = new JMenu("Edit");
		JMenu sourceMenu = new JMenu("Source");
		JMenu projectMenu = new JMenu("Project");
		JMenu runMenu = new JMenu("Run");
		
		// 3. [JMenuItem] 실제 반찬(아이템) 만들고 -> 그릇(Screen)에 담기
		// Screen 메뉴 안에 들어갈 4가지 아이템 생성
		JMenuItem loadItem = new JMenuItem("Load");
		JMenuItem hideItem = new JMenuItem("Hide");
		JMenuItem reshowItem = new JMenuItem("ReShow");
		JMenuItem exitItem = new JMenuItem("Exit");
		
		// 3-1. Screen 메뉴에 아이템들 하나씩 추가 (add)
		screenMenu.add(loadItem);
		screenMenu.add(hideItem);
		screenMenu.add(reshowItem);
		
		screenMenu.addSeparator(); // 분리선(줄 긋기) 추가 - 보기 좋게
		
		screenMenu.add(exitItem);
		
		// 4. [최종 조립] 그릇(메뉴)들을 식판(바)에 올리기
		mb.add(screenMenu);
		mb.add(editMenu);
		mb.add(sourceMenu);
		mb.add(projectMenu);
		mb.add(runMenu);
		
		// ★[가장 중요]★ 완성된 식판(바)을 프레임에 끼우기
		// add(mb)가 아니라 setJMenuBar(mb)를 씁니다!
		setJMenuBar(mb);
		
		
		// (동작 테스트용) Exit 누르면 꺼지게 하기
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // 프로그램 종료
			}
		});
		
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JMenu_Ex();
	}
}