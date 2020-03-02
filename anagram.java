import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
		ArrayList<String> B = new ArrayList<String>();
		ArrayList<ArrayList<Integer>> indices = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> indexForAllMatches = new ArrayList<Integer>();

		for (int i = 0; i < A.size(); i++) {
			char[] temp = A.get(i).replaceAll(" ", "").toUpperCase().toCharArray();
			Arrays.sort(temp);
			B.add(i, String.valueOf(temp));
		}

		for (int j = 0; j < B.size(); j++) {
			if (!indexForAllMatches.contains(j + 1)) {
				ArrayList<Integer> indexForMatches = new ArrayList<Integer>();
				indexForAllMatches.add(j + 1);
				indexForMatches.add(j + 1);
				for (int k = j + 1; k < B.size(); k++) {
					if (B.get(j).length() == B.get(k).length() && B.get(j).equals(B.get(k))) {
						indexForMatches.add(k + 1);
						indexForAllMatches.add(k + 1);
					}

				}
				indices.add(indexForMatches);
			}
		}
		return indices;
	}
}
