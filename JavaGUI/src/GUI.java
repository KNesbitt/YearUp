import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JLabel;

public class GUI 
{

	public static void main(String[] args) 
	{

	}
	public void MainFrame()
	{
		setsize(200,400);
		JLabel name = new JLabel ("My name is ");
		Container content = getContentPane();
		content.setLayout(new FlowLayout());
		content.add(name);
		set visible;
	}
	private void setsize(int i, int j) {
		
	}
	private Container getContentPane() {
		return null;
	}
	
}
