package marshmallows.view;

import javax.swing.JOptionPane;

/**
 * This class provides popups for input and output
 * 
 * @author htha9587
 *
 */

public class MonsterDisplay {

	/**
	 * Provides popup box for asking a question and allows the user to answer
	 * through text.
	 * 
	 * @param input
	 *            supplied question to popup
	 * @return the user's answer to the supplied question.
	 */

	public void displayMonsterConsole(String input) {
		String answer = "";
		answer = JOptionPane.showInputDialog("My monster info is: " + input);

	}

	/**
	 * Shows string input.
	 * 
	 * @param shows
	 *            displayed text on popup.
	 */
	public void displayMonsterGUI(String input) {
		JOptionPane.showMessageDialog(null, "My monster information is: "
				+ input);
	}
}