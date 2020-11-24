import java.util.ArrayList;
import java.util.List;

/**
    Class to modify
*/
class ListMultiplicator {

	public static void main(String[] args) {
		System.out.println("Well done!");
	}


    /**
        Repeats original list content provided number of times   
        @param list list to repeat
        @param n times to repeat, should be zero or greater
    */
	public static void multiply(List<?> list, int n) {
		if(n == 0) {
			list.clear();
		} else {
			reverseCaptured(list, n);
		}
	}

	private static <T> void reverseCaptured(List<T> list, int n) {
		List<T> tmp = new ArrayList<T>(list);

		for (int j = 1; j < n; j++) {

			for (int i = 0; i < list.size(); i++) {
				//list.set(i, tmp.get(list.size() - i - 1));
				list.add(tmp.get(i));
			}
		}


	}
}