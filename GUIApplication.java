
// Using JOptionPane for this GUI
import javax.swing.JOptionPane;

public class GUIApplication {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		
		// parse to show the value as string value
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
		
		JOptionPane.showMessageDialog(null, "Your name is "+name+" and you are "+age+" years old and "+height+" cm tall");

	}

}
