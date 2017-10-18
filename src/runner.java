
public class runner {

	public static void main(String[] args) {
		
		int numberBits = 10;
		int bite = 8; //  'byte'
		//int nibble = 4;
		int byteAnswer = 0, byteRemainder = 0;

		// test 10/8 	want 1 remainder 2
		
		byteRemainder = (numberBits % bite);
		byteAnswer = numberBits / bite;
		
		System.out.println("bits = " + numberBits + ", bytes = " + byteAnswer + ", remainder = " + byteRemainder);
		
	}
	
}
