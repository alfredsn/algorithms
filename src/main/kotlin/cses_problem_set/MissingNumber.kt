package cses_problem_set

/*
Missing Number
--------------------------------------------------------------------------
Time limit: 1.00 s
Memory limit: 512 MB

You are given all numbers between 1,2,...,n except one. Your task is to find the missing number.

Input
The first input line contains an integer n.
The second line contains n-1 numbers. Each number is distinct and between 1 and n (inclusive).

Output
Print the missing number.

Constraints
2 <= n <= 2 * 10^5

Example
Input:
5
2 3 1 5

Output:
4
*/

fun findMissingNumber(n: Int, arr: List<Int>): List<Int> {
    val missingNumbers = mutableListOf<Int>()

    if (n >= 0) {
        val totalSum = (n * (n + 1)) / 2
        val givenSum = arr.sum()
        val totalDifference = totalSum - givenSum

        if (totalDifference != 0) {
            var current = 1
            var remainingDifference = totalDifference

            while (remainingDifference > 0) {
                if (!arr.contains(current)) {
                    missingNumbers.add(current)
                    remainingDifference -= current
                }
                current++
            }
        }
    }
    return missingNumbers
}

fun main() {
    val result = findMissingNumber(5, listOf(1, 4))
    println(result)
}

