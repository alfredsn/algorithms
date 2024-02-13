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
    val totalSum = (n * (n + 1)) / 2
    val givenSum = arr.sum()
    val missingNumber = totalSum - givenSum

    return missingNumber
}

fun main() {
    val missingNumber = findMissingNumber(5, listOf(2,3,1,5))
    println(missingNumber)
}