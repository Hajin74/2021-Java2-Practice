// ��ǻ���а� 20200988 ������
public class Practice23 {
	
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
	
	public static void main(String[] args) {
		int[][] arr1 = new int[3][4];
		
		intArray(arr1);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		int[] arr2 = new int[4];
		
		colSum(arr1, arr2);
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
		}
	}

}