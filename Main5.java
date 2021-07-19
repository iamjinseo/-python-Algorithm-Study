package solve1;

import java.lang.reflect.Array;
import java.util.Arrays;

//4673 �����ѹ� ���ϱ�

/* 1~10000 �迭�� ���ųְ� �ű⼭ �Լ��� ������ �Ǵ��Ѵ�����
 * �����ϱ� arr[�����ڳѹ�]==false (�����ڶ�� ��)
 * if arr[i]!=false -> ��� (self number��� ��) */

public class Main5 {
	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];
		Arrays.fill(arr, true);
		for (int i = 1; i <= 10000; i++) {
			int result;
			result = d(i);
			if (result <= 10000)
				arr[result] = false; // �Լ� ����, i���� �����ϴ� ����
			// ��·�� �����ڿ� ���� �������a�Ƿ� �ش� �ε����� ����Ű��
			// ���� false(�����ѹ� �ƴ�)�̴�
			if (arr[i] == true) {
				System.out.println(i);
			}
		}
	}

	public static int d(int num) {
//		int num2 = 0;
//		num2 += num / 1000;
//		num2 += (num % 1000) / 100;
//		num2 += ((num % 1000) % 100) / 10;
//		num2 += ((num % 1000) % 100) % 10;
//		num2 += num;
//		
		int num2=num;
		while(num!=0) {
			num2 = num2 + (num%10); //ù ° �ڸ��� (9723�� 3)
			num = num/10; //ù ° �ڸ��� ���� �� (972)
		}
		return num2;
	}
}
