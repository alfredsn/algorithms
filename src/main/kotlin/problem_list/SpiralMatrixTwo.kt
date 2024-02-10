package problem_list

/*
Spiral Matrix II (Medium)
--------------------------------------------------------------------------
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n^2 in spiral order.

Example 1:
Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]

Example 2:
Input: n = 1
Output: [[1]]

Constraints:
1 <= n <= 20
*/

class SolutionSMII {
    fun generateMatrix(n: Int): Array<IntArray> {
        val matrix = Array(n) { IntArray(n) }
        var direction = 0 // 0: right, 1: down, 2: left, 3: up
        var row = 0
        var col = 0
        var num = 1

        for (i in 0 until n * n) {
            matrix[row][col] = num
            when (direction) {
                0 -> {
                    if (col + 1 == n || matrix[row][col + 1] != 0) {
                        direction = 1
                        row++
                    } else {
                        col++
                    }
                }
                1 -> {
                    if (row + 1 == n || matrix[row + 1][col] != 0) {
                        direction = 2
                        col--
                    } else {
                        row++
                    }
                }
                2 -> {
                    if (col - 1 == -1 || matrix[row][col - 1] != 0) {
                        direction = 3
                        row--
                    } else {
                        col--
                    }
                }
                3 -> {
                    if (row - 1 == -1 || matrix[row - 1][col] != 0) {
                        direction = 0
                        col++
                    } else {
                        row--
                    }
                }
            }
            num++
        }
        return matrix
    }
}