package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//2751 ����
public class Main9 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // ��Ʈ�������� �Ѳ����� ����ϱ�

		int size = Integer.parseInt(br.readLine());

		// ����Ʈ ��� ��. Arrays.sort�� �ϸ� �ð��ʰ�����
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < size; i++)
			list.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append('\n'); 
			//��Ʈ�������� ���ĵ� �� ���ϱ�
		}
		System.out.println(sb);
	}
}
