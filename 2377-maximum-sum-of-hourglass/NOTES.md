### Input: no. of rows and columns and the grid values
### Output: Maximum sum of hourglass in the grid

### Logical Explanation: -
1. An hourglass in the grid is of the shape covering cells : grid[i][j], grid[i][j+1], grid[i][j+2] , grid[i+1][j+1], grid[i+2][j], grid[i+2][j+1], grid[i+2][j+2].
2. So, our basic approach would be to traverse all the cells and calculate the sum of the hourglass formed by them.
3. Here's a catch. There are edge cells which do not contribute to hourglass formation.
4. Only the cells (i,j) which follow: (j+2) < n and (i+2) < n, have their hourglasses formed in the grid.
5. So, we traverse through all the cells, check if they form an hourglass.
6. If yes, we add the values of all grid cells corresponding to that hourglass mentioned in point 1. 
7. If no, we continue.
8. At each step, we also maintain a maxVal variable which stores the largest value of the hourglass sum for the different hourglasses encountered so far.
9. The end value of maxVal is our answer.