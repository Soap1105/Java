import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class JMenu2_ex extends JFrame {

    public JMenu2_ex() {
        setTitle("Menu 만들기 예제 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CreateMenu();

        setSize(400, 300);
        setVisible(true);

}

public void CreateMenu(){
    JMenuBar mb = new JMenuBar();


    JMenu [] ConsolItem = new JMenu[5];
    String [] Consol = {"Screen", "Edit", "Source", "Project", "Run"};

    for(int i=0; i< Consol.length; i++){
        ConsolItem[i] = new JMenu(Consol[i]);
         mb.add(ConsolItem[i]);
    }

    myActionListener listener = new myActionListener();
    JMenuItem [] MI = new JMenuItem[4];
    String [] Dogu = {"Load", "Hide", "ReShow", "Exit"};
    for(int i=0; i< Dogu.length; i++){
        MI[i] = new JMenuItem(Dogu[i]);
        MI[i].addActionListener(listener);
        ConsolItem[0].add(MI[i]);
    }


    setJMenuBar(mb);
}

class myActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        
        switch (cmd) {
            case "Load":
                System.out.println("Load selected");
                break;
            case "Hide":
                System.out.println("Hide selected");
                break;
            case "ReShow":
                System.out.println("ReShow selected");
                break;
            case "Exit":
                System.exit(0);
                break;
        }

    }


public static void main(String[] args) {
        new JMenu2_Ex();
    }

}