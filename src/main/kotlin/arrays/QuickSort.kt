package arrays

fun quickSort(qArr: IntArray) {
    if (qArr.size < 2) return
    val pivot = qArr[0]
    val left = qArr.filter { it < pivot }
    val right = qArr.filter { it > pivot }

    quickSort(left.toIntArray())
    quickSort(right.toIntArray())

    System.arraycopy(left, 0, qArr, 0, left.size)
    qArr[left.size] = pivot
    System.arraycopy(right, 0, qArr, left.size + 1, right.size)
}