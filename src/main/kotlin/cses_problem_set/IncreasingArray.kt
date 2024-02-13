package cses_problem_set

/*Increasing Array
--------------------------------------------------------------------------
Time limit: 1.00 s
Memory limit: 512 MB

You are given an array of n integers. You want to modify the array so that it is increasing, i.e.,
every element is at least as large as the previous element.
On each move, you may increase the value of any element by one. What is the minimum number of moves required?

Input
The first input line contains an integer n: the size of the array.
Then, the second line contains n integers x_1,x_2,...,x_n: the contents of the array.

Output
Print the minimum number of moves.

Constraints
1 <= n <= 2 * 10^5
1 <= x_i <= 10^9

Example
Input:
5
3 2 5 1 7

Output:
5
*/

fun minMoves(n: Int, arr: IntArray): Long {
    var moves: Long = 0
    var prev = arr[0]

    for (i in 1..< n) {
        if (arr[i] < prev) {
            moves += prev - arr[i]
        }else {
            prev = arr[i]
        }
    }
    return moves
}

fun  main() {
    val n = 5
    val arr = intArrayOf(3, 2, 5, 1, 7)

    val res = minMoves(n, arr)
    println(res)
}