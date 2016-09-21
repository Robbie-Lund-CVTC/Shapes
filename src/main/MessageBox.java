package main;

import javax.swing.JOptionPane;

// TODO: Auto-generated Javadoc
/**
 * The Class MessageBox.
 */
public class MessageBox implements IMessageBox {


	/* (non-Javadoc)
	 * @see main.IMessageBox#show(java.lang.String)
	 */
	@Override
	public void show(String message) {
		
		JOptionPane.showMessageDialog(null, message);
		
	}
	
}
