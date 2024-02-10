package problem_list
/*
Spiral Matrix (Medium)
--------------------------------------------------------------------------
Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
*/
class SolutionSM {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        if (matrix.isEmpty()) return emptyList()

        val result = mutableListOf<Int>()
        var top = 0
        var bottom = matrix.size - 1
        var left = 0
        var right = matrix[0].size - 1

        while (top <= bottom && left <= right) {
            for (i in left..right) result.add(matrix[top][i])
            top++
            for (i in top..bottom) result.add(matrix[i][right])
            right--
            if (top <= bottom) {
                for (i in right downTo left) result.add(matrix[bottom][i])
                bottom--
            }
            if (left <= right) {
                for (i in bottom downTo top) result.add(matrix[i][left])
                left++
            }
        }

        return  result
    }
}