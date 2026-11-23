package FunctionalInterface.PrintArray;

public class PrintArray {
	public static void main() {
		Test t = (numbers)-> {
			for(int i=0; i<numbers.length; i++) {
				System.out.println(numbers[i]);
			}
		};
		
		t.printArray(new int[] {10,20,30,40,50});
	}
}