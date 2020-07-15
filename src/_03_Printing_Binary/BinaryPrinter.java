package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void main(String[] args) {
		new BinaryPrinter().printByteBinary((byte) 7);
	}
	
	public void printByteBinary(byte b) {
		int mask = 0b10000000;
		String binaryStr = "";
		for(int i = 0; i < 8; i++) {
			binaryStr += (b&mask) >> (7-i);
			mask = mask >> 1;
		}
		System.out.println(binaryStr);
	}
	
	public void printShortBinary(short s) {
		
	}
	
	public void printIntBinary(int i) {
		
	}
	
	public void printLongBinary(long l) {
		
	}
}
