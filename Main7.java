package solve1;
//11720 ������ ��. ù��°�� ���ڰ��� �Է��ϰ� �ι�°�� ���Ҽ��� ������� �Է�.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0; //���� ��
		int size = Integer.parseInt(br.readLine()); //���� ��
		String numbers = br.readLine();
		if(numbers.length()==size)
			for(int i=0;i<size;i++) 
				sum += numbers.charAt(i)-'0'; //i�ε����� ���ڸ� ������ ����� ����
		System.out.println(sum);
	}
}
