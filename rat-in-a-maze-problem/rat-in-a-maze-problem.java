class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> ans = new ArrayList<>();
        int n = mat.length;
        if (mat[0][0] == 0 || mat[n - 1][n - 1] == 0) {
            return ans; // No path possible if start or end is blocked
        }
        boolean[][] vis = new boolean[n][n];
        dfs(mat, 0, 0, vis, "", ans);
        return ans;
    }

    private void dfs(int[][] mat, int i, int j, boolean[][] vis, String path, ArrayList<String> ans) {
        int n = mat.length;

        // Base cases
        if (i >= n || i < 0 || j >= n || j < 0 || mat[i][j] == 0 || vis[i][j]) {
            return;
        }
        if (i == n - 1 && j == n - 1) {
            ans.add(path);
            return;
        }

        vis[i][j] = true;

        // Move Right
        dfs(mat, i, j + 1, vis, path + "R", ans);
        // Move Left
        dfs(mat, i, j - 1, vis, path + "L", ans);
        // Move Up
        dfs(mat, i - 1, j, vis, path + "U", ans);
        // Move Down
        dfs(mat, i + 1, j, vis, path + "D", ans);

        vis[i][j] = false; // Backtrack
    }
}