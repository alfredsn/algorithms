package cses_problem_set

/*
Permutations
--------------------------------------------------------------------------
Time limit: 1.00 s
Memory limit: 512 MB

A permutation of integers 1,2,...,n is called beautiful if there are no adjacent elements whose difference is 1.
Given n, construct a beautiful permutation if such a permutation exists.

Input
The only input line contains an integer n.

Output
Print a beautiful permutation of integers 1,2,...,n. If there are several solutions, you may print any of them.
If there are no solutions, print "NO SOLUTION".

Constraints

1 <= n <= 10^6

Example 1
Input:
5

Output:
4 2 5 3 1

Example 2
Input:
3

Output:
NO SOLUTION
*/

fun beautyPermutations(n: Int): String {
    if (n == 1) return "1"
    if (n <= 3) return "NO SOLUTION"

    val buffer = StringBuilder((n + 1) * 2)

    if (n % 2 == 0) {
        for (i in 2 ..< n step 2) {
            buffer.append(i).append(' ')
        }
        for (i in 1 ..< n step 2) {
            buffer.append(i).append(' ')
        }
        buffer.append(n)
    } else {
        for (i in 1 ..< n - 2 step 2) {
            buffer.append(i).append(' ')
        }
        buffer.append(n - 1).append(' ')
        buffer.append(n).append(' ')
        for (i in 2 ..< n - 1 step 2) {
            buffer.append(i).append(' ')
        }
    }
    return buffer.toString()
}

fun main() {
    print("Input: ")
    val n = readln().toInt()
    val result = beautyPermutations(n)
    println(result)
}
