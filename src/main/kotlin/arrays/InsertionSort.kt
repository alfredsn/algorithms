package arrays

fun insertionSort(insertionArray: Array<Int>) {
    val insArrSize = insertionArray.size

    for(i in  1..insArrSize) {
        val key = insertionArray[i]
        var j = i - 1

        while(j >= 0 && insertionArray[j] > key) {
            insertionArray[j + 1] = insertionArray[j]
            j--
        }
        insertionArray[j - 1] = key
    }
}