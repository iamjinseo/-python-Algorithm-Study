package solve1;

import java.lang.reflect.Array;
import java.util.Arrays;

//4673 셀프넘버 구하기

/* 1~10000 배열에 쑤셔넣고 거기서 함수로 생성자 판단한다음에
 * 제거하기 arr[생성자넘버]==false (생성자라는 뜻)
 * if arr[i]!=false -> 출력 (self number라는 뜻) */

public class Main5 {
	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];
		Arrays.fill(arr, true);
		for (int i = 1; i <= 10000; i++) {
			int result;
			result = d(i);
			if (result <= 10000)
				arr[result] = false; // 함수 실행, i에서 리턴하는 값은
			// 어쨌든 생성자에 의해 생긴것이a므로 해당 인덱스가 가리키는
			// 값은 false(셀프넘버 아님)이다
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
			num2 = num2 + (num%10); //첫 째 자리수 (9723의 3)
			num = num/10; //첫 째 자리수 없앤 수 (972)
		}
		return num2;
	}
}
