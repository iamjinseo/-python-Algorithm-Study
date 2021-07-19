package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main11 {
//2108 정렬4 Main11
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size;
		do {
			size = Integer.parseInt(br.readLine());
		} while (size % 2 == 0); // N개의 수는 홀수여야 함

		ArrayList<Integer> list = new ArrayList<>(); // Integer

		for (int i = 0; i < size; i++)
			list.add(Integer.parseInt(br.readLine()));
		Collections.sort(list); // 정렬

		double sum = 0;
		for (int value : list) // sum 계산 및 빈도 계산
			sum += value;

		double avg = Math.round(sum / list.size()); // 1.평균
		int center = list.get(list.size() / 2); // 중앙값
		int mode = mode(list);
		int range = list.get(list.size() - 1) - list.get(0); // 범위
		System.out.println((int) avg + "\n" + center + "\n" + mode + "\n" + range + "\n");
	}

	static int mode(ArrayList<Integer> list) {
		int[] cnt = new int[8001];
		ArrayList<Integer> indexlist = new ArrayList<Integer>();
		int max = 2;
		for (int value : list) {
			cnt[value + 4000]++;
			if (cnt[value + 4000] > max) {
				max = cnt[value + 4000];
				indexlist.clear();
				indexlist.add(value);
			} else if (cnt[value + 4000] == max) {
				indexlist.add(value);
			}
		}
		if (indexlist.isEmpty()) {
			if (list.size() == 1)
				return list.get(0);
			else
				return list.get(1);
		} else if (indexlist.size() == 1) {
			return indexlist.get(0);
		} else {
			return indexlist.get(1);
		}
	}
}
