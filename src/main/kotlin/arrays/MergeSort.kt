package arrays

fun mergeSort(mergeArray: IntArray) {
    val midArr = mergeArray.size / 2
    val leftArr = mergeArray.sliceArray(0 until midArr)
    val rightArr = mergeArray.sliceArray(midArr until mergeArray.size)

    if(mergeArray.size <= 1) {
        return
    }

    mergeSort(leftArr)
    mergeSort(rightArr)

    merge(leftArr, rightArr, mergeArray)
}

fun merge(leftArr: IntArray, rightArr: IntArray, mergeArray: IntArray) {
    var i = 0
    var j = 0
    var k = 0

    while (i < leftArr.size && j < rightArr.size) {
        if (leftArr[i] <= rightArr[j]) {
            mergeArray[k++] = leftArr[i++]
        } else {
            mergeArray[k++] = rightArr[j++]
        }
    }

    while (i < leftArr.size) {
        mergeArray[k++] = leftArr[i++]
    }

    while (j < rightArr.size) {
        mergeArray[k++] = rightArr[j++]
    }
}
