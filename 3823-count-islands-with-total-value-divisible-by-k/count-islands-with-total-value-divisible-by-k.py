class Solution:
    def countIslands(self, grid: List[List[int]], k: int) -> int:
        m, n = len(grid), len(grid[0])
        ans = 0

        for r in range(m):
            for c in range(n):
                if grid[r][c] > 0:
                    total_sum = 0
                    queue = deque([(r, c)])
                    total_sum += grid[r][c]
                    grid[r][c] = 0  # mark visited

                    while queue:
                        curr_r, curr_c = queue.popleft()

                        for dr, dc in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
                            nr, nc = curr_r + dr, curr_c + dc
                            if 0 <= nr < m and 0 <= nc < n and grid[nr][nc] > 0:
                                total_sum += grid[nr][nc]
                                grid[nr][nc] = 0  # mark visited
                                queue.append((nr, nc))

                    if total_sum % k == 0:
                        ans += 1

        return ans