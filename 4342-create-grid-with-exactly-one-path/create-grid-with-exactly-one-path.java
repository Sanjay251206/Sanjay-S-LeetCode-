class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        grid[0] = ".".repeat(n);
        String otherRow = "#".repeat(n - 1) + ".";
        for (int i = 1; i < m; i++) {
            grid[i] = otherRow;
        }
        return grid;
    }
}