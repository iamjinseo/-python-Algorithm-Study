package solve1;
//11720 숫자의 합. 첫번째로 숫자개수 입력하고 두번째로 더할숫자 공백없이 입력.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0; //최종 합
		int size = Integer.parseInt(br.readLine()); //숫자 수
		String numbers = br.readLine();
		if(numbers.length()==size)
			for(int i=0;i<size;i++) 
				sum += numbers.charAt(i)-'0'; //i인덱스의 숫자를 정수로 만들어 더함
		System.out.println(sum);
	}
}
