package main;

import javax.swing.JOptionPane;

public class MessageBox implements IMessageBox {


	@Override
	public void show(String message) {
		
		JOptionPane.showMessageDialog(null, message);
		
	}
	
}
