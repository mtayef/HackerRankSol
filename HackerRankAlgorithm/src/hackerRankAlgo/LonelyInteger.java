package hackerRankAlgo;

public class LonelyInteger {

	public static void main(String[] args) {
	}
	public static int bitManipulation(int arr[]) {
		int result = 0;
		for(int value : arr) {
			result ^=value;
		}
		return result;
	}

}
