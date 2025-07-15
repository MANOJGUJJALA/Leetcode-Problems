import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[][] visited = new int[r][c];
        Queue<int[]> q = new LinkedList<>();

        // Enqueue all initially rotten oranges
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j, 0}); // {row, col, time}
                    visited[i][j] = 1;
                }
            }
        }

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int maxTime = 0;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0], y = curr[1], time = curr[2];
            maxTime = Math.max(maxTime, time);

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k], ny = y + dy[k];
                if (nx >= 0 && ny >= 0 && nx < r && ny < c &&
                    grid[nx][ny] == 1 && visited[nx][ny] == 0) {
                    
                    visited[nx][ny] = 1;
                    grid[nx][ny] = 2;
                    q.add(new int[]{nx, ny, time + 1});
                }
            }
        }

        // Check for any remaining fresh orange
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (grid[i][j] == 1)
                    return -1;

        return maxTime;
    }
}
