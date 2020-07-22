package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void main(String[] args) {
		new BinaryPrinter().printByteBinary((byte) 7);
		new BinaryPrinter().printShortBinary((short) 7);
		new BinaryPrinter().printIntBinary(7);
		System.out.println("\n");
		new BinaryPrinter().printLongBinary((long) 8); 
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
		int mask = 0b1000000000000000;
		String binaryStr = "";
		for(int i = 0; i < 16; i++) {
			binaryStr += (s&mask) >> (15-i);
			mask = mask >> 1;
		}
		System.out.println(binaryStr);
	}
	
	public void printIntBinary(int j) {
		int mask = 0b10000000000000000000000000000000;
		String binaryStr = "";
		for(int i = 0; i < 32; i++) {
			binaryStr += (j&mask) >> (31-i);
			mask = mask >>> 1;
		}
		System.out.print(binaryStr);
	}
	
	public void printLongBinary(long l) {
		int lLower = (int) (l & 0xFFFFFFFF);
		int lHigher = (int) (l >>> 32) & 0xFFFFFFFF;
		
		printIntBinary(lHigher);
		printIntBinary(lLower);
	}
}
