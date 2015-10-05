package marshmallows.view;

import javax.swing.JOptionPane;

public class MonsterGUI {
	/**
	 * Provides popup box for asking a question and allows the user to answer
	 * through text.
	 * 
	 * @param input
	 *            supplied question to popup
	 * @return the user's answer to the supplied question.
	 */
	public String getAnswer(String input) {
		String answer = "";

		answer = JOptionPane.showInputDialog(null, input);

		return answer;
	}

	/**
	 * Shows string input.
	 * 
	 * @param shows
	 *            displayed text on popup.
	 */

	public void displayResponse(String input) {
		JOptionPane.showMessageDialog(null, input);
	}
}