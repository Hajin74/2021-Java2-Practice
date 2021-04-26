// ��ǻ���а� 20200988 ������
import java.util.Random;
import java.util.Scanner;

public class Practice22 {

	public static int searchArray(int[] array, int key) {
		int i = 0;
		
		for(int value: array) {
			if(value == key)
				return i;
			i++;
		}
		
		return -1;
	}
	
	public static void printArray(int[] array) {
		for(int value: array) {
			System.out.print(value + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Random rg = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rg.nextInt(101);
		}
		
		printArray(arr);
		
		System.out.print("ã�� ���� ���ڸ� �Է��ϼ���: ");
		int key = sc.nextInt();
		
		int keyIndex = searchArray(arr, key);
		if(keyIndex == -1) {
			System.out.println("�Է��� ���� " + key + "�� �迭�� �����ϴ�.");
		} else {
			System.out.println("�Է��� ���� " + key + "�� �迭�� " + keyIndex + "�� �ڸ��� �ֽ��ϴ�.");
		}
		
		sc.close();
	}

}