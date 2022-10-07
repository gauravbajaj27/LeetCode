#include <bits/stdc++.h>

using namespace std;

int maxSum(vector<vector<int>>& grid) {
    int maxVal = 0, sum = 0, m = grid.size(), n = grid[0].size();
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if ((j+2) < n && (i+2) < m) {
                sum = grid[i][j] + grid[i][j+1] + grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
                maxVal = max(maxVal,sum);
            }
        }
    }
    return maxVal;
}

int main(void) {
    int m, n;
    cout << "Enter no. of rows: ";
    cin >> m;
    cout << "Enter no. of columns: ";
    cin >> n;
    vector<vector<int>> grid(m, vector<int>(n));
    cout << "Enter grid:\n";
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            cin >> grid[i][j];
        }
    }
    cout << "Maximum sum of hour glass: " << maxSum(grid) << "\n";
    return 0;
}