package Frame;

import javax.swing.JFrame;

import gui.panel.MainPanel1;

public class MainFrame extends JFrame{
	
	public static MainFrame instance = new MainFrame();
	private MainFrame(){
		this.setSize(800,550);
		this.setTitle("记账小能手");
		this.setLocationRelativeTo(null);
		this.setContentPane(MainPanel1.instance);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instance.setVisible(true);

	}

}
