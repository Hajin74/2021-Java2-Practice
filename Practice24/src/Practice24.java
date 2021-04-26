// ��ǻ���а� 20200988 ������
public class Practice24 {
	
	public static void intArray(int[][] arr) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				arr[i][j] = (int) ((j + 1) * Math.pow(10, i));
			}
		}
	}
	
	public static void colSum(int[][] arr1, int[] arr2) {
		for(int j = 0; j < 4; j++) {
			int sum = 0;
			for(int i = 0; i < 3; i++) {
				sum += arr1[i][j];
			}
			arr2[j] = sum;
		}
	}
	
	public static int rowSum(int[] arr1) {
		int sum = 0;
		
		for(int i = 0; i < 4; i++) {
			sum += arr1[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int[][] arr1 = new int[3][4];
		intArray(arr1);
		
		int[] arr2 = new int[4];
		for(int i = 0; i < 3; i++) {
			int value = rowSum(arr1[i]);
			arr2[i] = value;
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.print(arr2[i] + "\n");
		}
		
		int[] arr3 = new int[4];
		colSum(arr1, arr3);
		for(int i = 0; i < 4; i++) {
			System.out.print(arr3[i] + "\t");
		}
		
		int total = rowSum(arr3);
		System.out.print(total + "\n");
		
		
	}

}