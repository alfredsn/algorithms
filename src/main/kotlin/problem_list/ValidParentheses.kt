package problem_list

import java.util.*

/*
Valid Parentheses (Easy)
--------------------------------------------------------------------------
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/

class SolutionVP {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for (char in s) {
            when (char) {
                '(', '{', '[' -> stack.push(char)
                ')' -> if (stack.isEmpty() || stack.pop() != '(') return false
                '}' -> if (stack.isEmpty() || stack.pop() != '{') return false
                ']' -> if (stack.isEmpty() || stack.pop() != '[') return false
            }
        }
        return stack.isEmpty()
    }
}
