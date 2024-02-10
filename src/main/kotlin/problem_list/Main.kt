package problem_list

fun main() {
    println("=========================================================================")

    println("Spiral Matrix")
    println("-------------------------------------------------------------------------31")
    val solutionOne = SolutionSM()
    val matrix1 = arrayOf(
        intArrayOf(1, 2, 3, 11),
        intArrayOf(4, 5, 6, 12),
        intArrayOf(7, 8, 9, 13)
    )
    println("Input matrix: ")
    matrix1.forEach { row -> println(row.joinToString(prefix = "[", postfix = "]")) }
    println("Output: ${solutionOne.spiralOrder(matrix1)}")
    println("=========================================================================")

    println("Spiral Matrix II")
    println("-------------------------------------------------------------------------")

    val n = 3
    val solutionSMII = SolutionSMII()
    val matrix = solutionSMII.generateMatrix(n)
    println("Input: $n")
    println("Output:")
    for (row in matrix) {
        print("[")
        for (cell in row) {
            print("$cell ")
        }
        println("]")
    }
    println("=========================================================================")

    println("Increasing Subsequence")
    println("-------------------------------------------------------------------------")
    val solutionSRSA = SolutionSRSA()
    val nums = intArrayOf(121, 20, 43, 14, 95)
    println("Input: ${nums.joinToString()}")
    println("Output: ${solutionSRSA.canBeIncreasing(nums)}")
    println("=========================================================================")
}