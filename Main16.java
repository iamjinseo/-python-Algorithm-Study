package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

//10814 나이순 정렬
/* br로 저지 회원 수 입력
 * 회원 나이와 이름을 공백으로 구분
 * 회원 객체 만들어 나이순으로 정렬
 * 같은 나이에 대한 정렬 기준을 comparator로 구현
 * 정렬된것을 sb로 출력*/
public class Main16 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Member[] members = new Member[N];
		
		for(int i=0; i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); //나이 이름 입력
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
