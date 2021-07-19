package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

//11651 ÁÂÇ¥Á¤·Ä2
public class Main14 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		ArrayList<Location> list = new ArrayList<Location>();

		for (int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); // ÁÂÇ¥ÀÔ·Â
			list.add(new Location(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))); // ÁÂÇ¥ list¿¡ »ðÀÔ
		}
		Collections.sort(list, new YComparator());
		Collections.sort(list, new XComparator());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(list.get(i).getX()).append(" ").append(list.get(i).getY()).append("\n");
		}
		System.out.println(sb);
	}
}

class Location {
	private int x;
	private int y;

	Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
}

class XComparator implements Comparator<Location> {
	@Override
	public int compare(Location o1, Location o2) {
		if (o1.getY() == o2.getY())
			return o1.getX() - o2.getX();
		return 0;
	}
}

class YComparator implements Comparator<Location> {
	@Override
	public int compare(Location o1, Location o2) {
		return o1.getY() - o2.getY();
	}
}
