package learnJavaAgain;

/*
 * Long time no see:)
 * This course is about using dialogue box to input and output
 * Tips: if the inport Javax.swing does not work, type "requires java.desktop;" in the module-info.java file
 */
import javax.swing.JOptionPane; // import JOptionPane class

public class L6GUI {

	public static void main(String[] args) {
		// create a input dialogue box
		String name = JOptionPane.showInputDialog("Enter your name");
		// create a display dialogue box
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		// input dialogue box resturns a str automatically
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); //convert str to int
		JOptionPane.showMessageDialog(null, "You are " + age + " years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
		
		
	}

}
