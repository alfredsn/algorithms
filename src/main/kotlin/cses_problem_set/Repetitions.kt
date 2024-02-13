package cses_problem_set

/*
Repetitions
--------------------------------------------------------------------------
Time limit: 1.00 s
Memory limit: 512 MB

You are given a DNA sequence: a string consisting of characters A, C, G, and T.
Your task is to find the longest repetition in the sequence.
This is a maximum-length substring containing only one type of character.

Input
The only input line contains a string of n characters.

Output
Print one integer: the length of the longest repetition.
Constraints

1 <= n <= 10^6

Example
Input:
ATTCGGGA

Output:
3
*/

fun longestReps(sequence: String): Int {
    if (sequence.isEmpty()) return 0

    var maxRepetition = 1
    var currentRepetition = 1

    for (i in 1..< sequence.length) {
        if (sequence[i] == sequence[i - 1]) {
            currentRepetition++
            maxRepetition = maxOf(maxRepetition, currentRepetition)
        } else {
            currentRepetition = 1
        }
    }

    return maxRepetition
}

fun main() {
    val sequence = readln()
    val result = longestReps(sequence)
    println(result)
}
