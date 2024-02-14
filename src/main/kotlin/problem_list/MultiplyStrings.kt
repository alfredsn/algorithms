package problem_list

/*
Multiply Strings (Medium)
--------------------------------------------------------------------------
Given two non-negative integers num1 and num2 represented as strings,
return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example 1:
Input: num1 = "2", num2 = "3"
Output: "6"

Example 2:
Input: num1 = "123", num2 = "456"
Output: "56088"

Constraints:
1 <= num1.length, num2.length <= 200
num1 and num2 consist of digits only.
Both num1 and num2 do not contain any leading zero, except the number 0 itself.
*/

class SolutionMS {
    fun multiply(nums1: String, nums2: String): String {
        if (nums1 == "0" || nums2 == "0") return "0"

        val n1 = nums1.length
        val n2 = nums2.length
        val result = IntArray(n1 + n2)

        for (i in n1 - 1 downTo 0) {
            for (j in n2 - 1 downTo 0) {
                val product = (nums1[i] - '0') * (nums2[j] - '0')
                val temp = product + result[i + j + 1]
                result[i + j + 1] = temp % 10
                result[i + j] += temp / 10
            }
        }

        val sb = StringBuilder()
        for (digit in result) {
            if (!(sb.isEmpty() && digit == 0)) {
                sb.append(digit)
            }
        }

        return sb.toString()
    }
}