import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {

	public static void main(String[] args) {
		JFrame window = new JFrame ();
		//with the new keyword you initialize/instantiate objects
		//creating an instance of a class
		//JFrame is the type of object
		window.setTitle("Ein Fenster in die Welt.");
		window.setSize(600, 450);
		window.setVisible(true);
		
		JLabel label = new JLabel();
		label.setText("This is a label.");
		
		window.add(label);
	}

}
