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

    println("Plus One")
    println("-------------------------------------------------------------------------")
    val solutionPO = SolutionPO()
    val nPO = intArrayOf(1, 3, 4, 7, 8)
    println("Input: ${nPO.joinToString()}")
    val result = solutionPO.plusOne(nPO)
    println("Output: ${result.joinToString()}")
    println("=========================================================================")

    println("Multiplication of Strings")
    println("-------------------------------------------------------------------------")
    val solutionMultiply = SolutionMS()
    val num1 = "123"
    val num2 = "456"
    println("Input: num1 = \"$num1\", num2 = \"$num2\"")
    println("Output: ${solutionMultiply.multiply(num1, num2)}")
    println("=========================================================================")

    println("Valid Parentheses")
    println("-------------------------------------------------------------------------")
    val solutionVP = SolutionVP()

    val input1 = "()"
    println("Input: \"$input1\"")
    println("Output: ${solutionVP.isValid(input1)}")

    val input2 = "()[]{}"
    println("Input: \"$input2\"")
    println("Output: ${solutionVP.isValid(input2)}")

    val input3 = "(]"
    println("Input: \"$input3\"")
    println("Output: ${solutionVP.isValid(input3)}")
    println("=========================================================================")

    println("Dungeon Game")
    println("-------------------------------------------------------------------------")

    val solutionDG = SolutionDG()

    val rooms = arrayOf(
        intArrayOf(-10, -2, -23, 11),
        intArrayOf(-40, -5, -60, -12),
        intArrayOf(17, -18, 9, -13)
    )

    val minInitialHealth = solutionDG.calculateMinimumHP(rooms)
    println("Minimum initial health required: $minInitialHealth")
    println("=========================================================================")

}