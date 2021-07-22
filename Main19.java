package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1002 터렛
/* br로 테스트케이스 개수 입력
 * 한 테스트케이스에 대한 입력 후 경우 처리
 *  */
public class Main19 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)); // 중점거리

			if (d == 0 && r1 == r2) { // 접점무한
				sb.append(-1).append('\n');			
			} else if (d == r1 + r2 || d == Math.abs(r1 - r2)) { // 한점만남
				sb.append(1).append('\n');
			} else if (d > r1 + r2 || d < Math.abs(r1 - r2)) { // 안만남
				sb.append(0).append('\n');
			} else {
				sb.append(2).append('\n');
			}
		}
		System.out.println(sb);
	}
}
/*
 * 두 점에서 만남 : 중점 거리 < 반지름 합 
 * 한 점 외접 : 중점거리 = 반지름 합 
 * 한 점 내접 : 중점거리 = 반지름 차이 
 * 외부에서 안만남 : 중점거리가 반지름 합보다 큼 
 * 내부에서 안만남 : 큰원 반지름 > 거리 + 작은원 반지름 
 * 		=> 거리 < 반지름 차이 
 * 접점무한 : 중점 같고 반지름 같음
 */
