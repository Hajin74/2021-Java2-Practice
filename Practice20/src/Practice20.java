// 컴퓨터학과 20200988 유하진
import java.util.Random;
import java.util.Scanner;

public class Practice20 {

	public static int searchArray(int[] array, int key) {
		int keyIndex = -1;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == key)
				return i;
		}
		
		return keyIndex;
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Random rg = new Random();
		Scanner sc = new Scanner(System.in);

		int[] arr1 = new int[3];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = rg.nextInt(9) + 1;
		}
		printArray(arr1);
		
		int[] arr2 = new int[3];
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(i + "번째 숫자 입력: ");
			arr2[i] = sc.nextInt();
		}
		
		int count1 = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == arr2[i])
				count1++;
		}
		System.out.println("자리와 값이 모두 같은 숫자: " + count1 + "개");
		
		int count2 = 0;
		for(int i = 0; i < arr2.length; i++) {
			int keyIndex = searchArray(arr2, arr1[i]);
			if(keyIndex != -1)
				count2++;
		}
		System.out.println("자리는 다르고 값만 같은 숫자: " + (count2 - count1) + "개");
		
		sc.close();
	}

}
