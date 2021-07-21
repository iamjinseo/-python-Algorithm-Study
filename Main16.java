package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

//10814 ���̼� ����
/* br�� ���� ȸ�� �� �Է�
 * ȸ�� ���̿� �̸��� �������� ����
 * ȸ�� ��ü ����� ���̼����� ����
 * ���� ���̿� ���� ���� ������ comparator�� ����
 * ���ĵȰ��� sb�� ���*/
public class Main16 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Member[] members = new Member[N];
		
		for(int i=0; i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); //���� �̸� �Է�
			members[i] = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
		}
		Arrays.sort(members, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o1.age - o2.age;
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N;i++) 
			sb.append(members[i]);
		System.out.println(sb);
	}
}
class Member{
	int age;
	String name;
	
	public Member(int age, String name){
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return age + " " + name + "\n";
	}
}
