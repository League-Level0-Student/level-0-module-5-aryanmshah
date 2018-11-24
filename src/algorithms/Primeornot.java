package algorithms;

import javax.swing.JOptionPane;

public class Primeornot {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Prime calculator:type a number");

		int p = Integer.parseInt(a);
		int count = 0;
		for (int i = 2; i < p; i++) {
			if (p % i == 0) {
				count++;
			}

		}

		if (count > 0) {

			JOptionPane.showMessageDialog(null, "It is not prime!");
		} else {

			JOptionPane.showMessageDialog(null, "its prime!");
		}

	}
}