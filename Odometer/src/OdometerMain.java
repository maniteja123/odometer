
public class OdometerMain {

	private static int size = 4;
	
	public static void main(String[] args) {
		System.out.println("Next reading : " + Utilities.getNext(5789));
		System.out.println("Previous reading : " + Utilities.getPrev(5789));
		System.out.println("Distance between : " + Utilities.distance(1234, 1245));
		System.out.println("Maximum reading : " + Utilities.maxReading(size));
		System.out.println("Maximum reading : " + Utilities.minReading(size));
	}

}
