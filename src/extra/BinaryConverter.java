package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JLabel label;
	JTextField textfield;
	

	public static void main(String[] args) {
		BinaryConverter bc = new BinaryConverter();
		bc.showWindow();
	}

	void showWindow() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		button = new JButton();
		textfield = new JTextField(20);
		frame.setVisible(true);
		frame.setTitle("Convert 8 Bits of Binary to ASCII");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(textfield);
		panel.add(button);
		button.setText("convert");
		button.addActionListener(this);
		panel.add(label);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String answer = textfield.getText();
		label.setText(convert(answer));
		frame.pack();
	}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}
}
