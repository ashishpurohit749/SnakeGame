import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameFrame extends JFrame {
	GamePanel gamepanel;
	JPanel contentPane;
	CardLayout cardLayout = new CardLayout();
	
	GameFrame(){
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	
		
	}
	
		public void playAgain() {
			cardLayout.next(contentPane);
			gamepanel.restart();
			
			gamepanel.requestFocusInWindow();
			
		}
}
