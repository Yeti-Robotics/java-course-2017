import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		int[] values = new int[]{1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(values));
		
		values[0] = 8;
		System.out.println(Arrays.toString(values));
		
		for (int i = 0; i < values.length; i++) {
			values[i] = values[i] * 2;
		}
		System.out.println(Arrays.toString(values));
		
		for (int i = values.length - 1; i >= 0; i--) {
			values[i] = values[i] - i;
		}
		System.out.println(Arrays.toString(values));
	}

}
