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

fun findMissingNumber(n: Int, arr: List<Int>): Int {
    var res = 0

    if (n >= 0) {
        val totalSum = (n * (n + 1)) / 2
        val givenSum = arr.sum()
        res = totalSum - givenSum
    } else {
        println("The value of n must be positive!")
    }

    return res
}

fun main() {
    val missingNumber = findMissingNumber(-6, listOf(2,3,1,5,4))
    println(missingNumber)
}