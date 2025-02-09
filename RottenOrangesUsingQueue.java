package exercisepgm_1;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrangesUsingQueue {

    public static void rotten(int[][] arr) {
        Queue<int[]> q = new LinkedList<>();
        int freshcount = 0;

        // Add all initially rotten oranges to the queue and count fresh ones
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 2) {
                    q.add(new int[]{i, j});
                } else if (arr[i][j] == 1) {
                    freshcount++;
                }
            }
        }

        int count = 0;
        int[] rowDir = {-1, 1, 0, 0};
        int[] colDir = {0, 0, -1, 1};

        // Process elements in the queue
        while (!q.isEmpty() && freshcount > 0) {
            int size = q.size();
            boolean flag = false;

            for (int i = 0; i < size; i++) {
                int[] cell = q.poll();

                for (int d = 0; d < 4; d++) {
                    int newRow = cell[0] + rowDir[d];
                    int newCol = cell[1] + colDir[d];

                    if (newRow >= 0 && newRow < arr.length && newCol >= 0 && newCol < arr[0].length && arr[newRow][newCol] == 1) {
                        arr[newRow][newCol] = 2;
                        freshcount--;
                        flag = true;
                        q.add(new int[]{newRow, newCol});
                    }
                }
            }

            if (flag) {
                count++;
            }
        }

        // Output the result
        System.out.println(freshcount == 0 ? count : -1);
    }

    public static void main(String[] args) {
        int[][] arr = {
            {2, 1, 0, 2, 1},
            {1, 0, 1, 2, 1},
            {1, 0, 0, 2, 1}
        };
        rotten(arr);
    }
}
