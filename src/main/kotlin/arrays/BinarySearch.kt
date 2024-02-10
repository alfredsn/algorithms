package arrays

fun binarySearch(binaryArray: Array<Int>, mainTarget: Int): Int {
    var lowerBoundBinS = 0
    var upperBoundBinS = binaryArray.size - 1

    while (lowerBoundBinS <= upperBoundBinS) {
        val middle = (lowerBoundBinS + upperBoundBinS) / 2

        if (binaryArray[middle] == mainTarget) {
            return middle
        } else if (binaryArray[middle] < mainTarget) {
            lowerBoundBinS = middle + 1
        } else {
            upperBoundBinS = middle - 1
        }
    }
    return -1
}