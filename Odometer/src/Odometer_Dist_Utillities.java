
class Utilities{

	private static boolean verbose = true;
	public static int getSize(int Reading){
		int size = 0;
		while(Reading!=0){
			size++;
			Reading = Reading/10;
		}
	    return size;
	}

	public static int getNext(int Reading){
		int odometer_size = getSize(Reading);
		int t = Reading;
		Reading++;
		while(!Validity.isValid(Reading)){
			if(getSize(Reading)>odometer_size)
				Reading = (int) Math.pow(10,odometer_size-1);
			Reading++;
		}
  
		if(t != Reading)
			return Reading;
		else
			return -1;
	}

	public static int getPrev(int Reading){
		int odometer_size = getSize(Reading);
		int i = Reading;
		Reading--;
		while(!Validity.isValid(Reading)){
			if(getSize(Reading)<odometer_size)
				Reading = (int) (Math.pow(10,odometer_size)-1);
			Reading--;
		}
		if(i != Reading)
			return Reading;
		else
			return -1;
	}

	public static int distance(int R1, int R2){
		int dist = 0;
		while(R1 != R2){
			dist ++;
			R1 = getNext(R1);
		}
		return dist;
	}
	
	public static int maxReading(int size) {
		if(size < 1 || size > 9){
			return -1;
		}
		int start = 10-size;
		String max = "";
		for(int i = start; i <= 9; i++){
			max += i;
		}
		
		return Integer.parseInt(max);		
	}

	public static int minReading(int size) {
		if(size < 1 || size > 9){
			return -1;
		}
		String min = "";
		for(int i = 1; i <= size; i++){
			min += i;
		}
		
		return Integer.parseInt(min);	
	}
}
