//package solve1;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.StringTokenizer;
//
////11650 좌표 정렬하기 x가 증가하는 순으로, 같으면 y가 증가하는 순으로 정렬
///* br로 좌표개수 입력(size)
// * size만큼 좌표 입력받기
// * 입력받은 좌표들 " "로 stringtokenizer
// * 공백으로 분리된 숫자들로 좌표 객체 생성
// * ArrayList로 x기준으로 배열,
// *  같으면 y기준으로 정렬하도록 처리
// *  */
//public class Main13 {
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int size = Integer.parseInt(br.readLine());
//		ArrayList<Location> list = new ArrayList<Location>();
//
//		for (int i = 0; i < size; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 좌표입력
//			list.add(new Location(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))); // 좌표 list에 삽입
//		}
//		Collections.sort(list, new XComparator());
//		Collections.sort(list, new YComparator());
//
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < size; i++) {
//			sb.append(list.get(i).getX()).append(" ").append(list.get(i).getY()).append("\n");
//		}
//		System.out.println(sb);
//	}
//}
//
//class Location {
//	private int x;
//	private int y;
//
//	Location(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//
//	public int getX() {
//		return this.x;
//	}
//
//	public int getY() {
//		return this.y;
//	}
//}
//
//class XComparator implements Comparator<Location> {
//	@Override
//	public int compare(Location o1, Location o2) {
//		return o1.getX()-o2.getX();
//	}
//}
//
//class YComparator implements Comparator<Location> {
//	@Override
//	public int compare(Location o1, Location o2) {
//		if (o1.getX()==o2.getX())
//			return o1.getY()-o2.getY();
//		return 0;
//	}
//}
