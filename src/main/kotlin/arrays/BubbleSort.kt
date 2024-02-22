package arrays

fun bubbleSort(bubbleArray: Array<Int>): Array<Int> {
    val lowerBoundBubS = 0
    val upperBoundBubS = bubbleArray.size - 1
    var swapAct = true

    while (swapAct) {
        swapAct = false

        for (index in lowerBoundBubS ..< upperBoundBubS) {
            if (bubbleArray[index] > bubbleArray[index + 1]) {
                val temp = bubbleArray[index]
                bubbleArray[index] = bubbleArray[index + 1]
                bubbleArray[index + 1] = temp
                swapAct = true
            }
        }
    }
    return bubbleArray
}
