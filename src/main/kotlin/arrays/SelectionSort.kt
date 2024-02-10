package arrays

fun selectionSort(selectionArray: IntArray) {
    val selArrSize = selectionArray.size
    val lowerBoundSelArr = 0
    val upperBoundSelArr = selArrSize - 1

    for (i in lowerBoundSelArr..< upperBoundSelArr) {
        var minIndex = i

        for (j in i + 1..< selectionArray[minIndex]) {
            if (selectionArray[j] < selectionArray[minIndex]) {
                minIndex = j
            }
        }
        val temp = selectionArray[i]
        selectionArray[i] = selectionArray[minIndex]
        selectionArray[minIndex] = temp
    }
}