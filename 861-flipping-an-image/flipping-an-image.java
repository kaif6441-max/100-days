class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int[] row : image) {
            int left = 0, right = n - 1;

            while (left <= right) {
                // Swap and invert simultaneously
                if (row[left] == row[right]) {
                    // If both are same, flipping and inverting both changes them
                    row[left] = 1 - row[left];
                    row[right] = row[left];  // same after inversion
                }
                left++;
                right--;
            }
        }

        return image;
    }
}
