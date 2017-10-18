import javax.swing.JOptionPane;

public class runner {

	static boolean userContinue;	
	
	public static void main(String[] args) {
		
		String messanger;
		String userInput;
		
		
		int numberBits = 10;
		int bite = 8; //  'byte'
		//int nibble = 4;
		int byteAnswer = 0, byteRemainder = 0;

		// test 10/8 	want 1 remainder 2
		do {	
			byteRemainder = (numberBits % bite);
			byteAnswer = numberBits / bite;
			
			messanger = ("bits = " + numberBits + ", bytes = " + byteAnswer + ", remainder = " + byteRemainder);
			System.out.println(messanger);
			JOptionPane.showMessageDialog(null, messanger);
			
			
			/** how to handle mixed case. 
			 * Answer: String.toLower(x)
			 */
			
			
			
			try {
				do {
					
					messanger = ("Would you like to continue? (y/n)");
					userInput = JOptionPane.showInputDialog(messanger);
					userInput = userInput.toLowerCase();
					
					messanger = ("You have entered: " + userInput);
					JOptionPane.showMessageDialog(null, messanger);
					
					if(userInput.equals("y") || userInput.equals("yes")) {
						userContinue = true;
						userInput = "Finished";
						
						messanger = ("You have selected yes");
						JOptionPane.showMessageDialog(null, messanger);
						
					} else if (userInput.equals("n") || userInput.equals("no")) {
						userContinue = false;
						userInput = "Finished";
						
						messanger = ("You have selected no");
						JOptionPane.showMessageDialog(null, messanger);

					} else {
						userInput = "Error";
						
						messanger = ("I do not understand");
						JOptionPane.showMessageDialog(null, messanger);
						
					}
				} while(userInput != "Finished");
				
			} catch (Exception err) {

				messanger = ("Error:" + err);
				JOptionPane.showMessageDialog(null, messanger);

			}
			
			if (userContinue == true) {
				messanger = ("Continuing...");
				JOptionPane.showMessageDialog(null, messanger);
			} else if (userContinue == false) {
				messanger = ("Stopping...");
				JOptionPane.showMessageDialog(null, messanger);
			}
			
		} while(userContinue == true);
	}
	
}
