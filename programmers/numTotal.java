public class numTotal {
    public int[] solution(int num, int total) {
        int[] result = new int[num];

        int start = total / num - num / 2;
        if (total % num != 0) {
            start++;
        }

        for (int i = 0; i < num; i++) {
            result[i] = start++;
        }

        return result;
    }
}
