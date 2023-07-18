class Solution {
    public int[] constructRectangle(int area) {
        if (area == 1) {
            return new int[]{1, 1};
        }

        int[] res = new int[2];
        int minDistance = Integer.MAX_VALUE;

        for (int i = 1; i <= area / 2; i++) {
            int a = area / i;
            int currDistance = Math.abs(a - i);

            if (a * i == area && currDistance < minDistance) {
                minDistance = currDistance;

                if (i < a) {
                    res = new int[]{a, i};
                } else {
                    res = new int[]{i, a};
                }
            }
        }

        return res;
    }
}
