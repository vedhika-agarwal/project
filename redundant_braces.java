public class Solution {
	public int braces(String A) {

		A = A.replaceAll(" ", "");

		if (!(A.contains(")") || A.contains("("))) {
			return 0;
		}

		for (int top = 0; top < A.length();) {
			if (A.charAt(top) == ')') {
				int popCount = 0;
				while (A.charAt(top - 1) != '(') {
					popCount++;
					A = A.substring(0, top - 1) + A.substring(top);
					top--;
				}

				if (popCount < 2) {
					return 1;
				}

				if (A.length() == 2) {
					return 0;
				}

				A = A.substring(0, top - 1) + A.substring(top + 1);
				top = top - 2;
			}
			top++;
		}
		return 0;
	}
}
