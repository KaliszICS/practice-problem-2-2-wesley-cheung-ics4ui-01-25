import java.util.Arrays;
public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(compareStringSearch(new String[] {"A", "Zoo", "animal", "brood", "call", "d", "fall", "gorilla", "help", "python", "there"}, "about"));
	}
	public static int[] compareSearch(int[] array, int number) {
		int[] result = new int[2];
		int counter = 0;
		for (int i = 0;i<array.length;i++) {
			counter += 1;
			if (array[i] == number) {
				result[0] = i+1;
				break;
			}
		}
		if (result[0]==0){
			result[0]=counter;
		}
		int lower = 0;
		int upper = array.length-1;
		int middle = -23232;
		Arrays.sort(array);
		int count = 0;
		for (int i = 0;i<array.length;i++) {
			count += 1;
			if ((lower+upper)/2==middle) {
				result[1]=i-1;
				break;
			}
			middle = (lower+upper)/2;
			if (array[middle]== number) {
				result[1]=i+1;
				break;
			}	else if (array[middle] < number){
				lower = middle+1;
			}	else {
				upper = middle-1;
			}
		}
		if (result[1]==0){
			result[1]=count;
		}
		return result;
	}
	public static int[] compareStringSearch(String[] array, String string) {
		int[] result = new int[2];
		int counter = 0;
		for (int i = 0;i<array.length;i++) {
			counter += 1;
			if (array[i].equals(string)) {
				result[0] = i+1;
				break;
			}
		}
		if (result[0]==0){
			result[0]=counter;
		}
		int lower = 0;
		int upper = array.length-1;
		int middle = -23232;
		Arrays.sort(array);
		int count = 0;
		for (int i = 0;i<array.length;i++) {
			count += 1;
			if ((lower+upper)/2==middle) {
				result[1]=i;
				break;
			}
			middle = (lower+upper)/2;
			System.out.println(array[middle]);
			if (array[middle].equals(string)) {
				result[1]=i+1;
				break;
			}	else if (string.compareTo(array[middle])>0){
				lower = middle+1;
			}	else {
				upper = middle-1;
			}
		}
		return result;
	}
	
}
