package solve1;
//15596, ���� ���ϴ� �Լ� �����
import java.util.Arrays;

public class Main4 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(sum(arr));
	}

	public static long sum(int[] a) {  
		long sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}

}
