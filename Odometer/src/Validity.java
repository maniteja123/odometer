
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Validity {	
	
	private static ArrayList<Integer> num2Digits(int i){
		ArrayList<Integer> d = new ArrayList<Integer>();
		while(i>0){
			d.add(i%10);
			i = i/10;
		}
		Collections.reverse(d);
		return d;
	}
	
	public static boolean isValid(int number){
		List<Integer> digits = num2Digits(number);
		int prev =0;
		for(int digit: digits){
			if(prev>=digit) {
				return false;
			}
			prev = digit;
		}
		return true;
		
	}
}
