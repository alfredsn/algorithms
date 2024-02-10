package arrays

fun main() {
    val binaryArray = arrayOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)
    val target = 20
    val binArrRes = binarySearch(binaryArray, target)

    if (binArrRes != -1) {
        println("Target $target found at index $binArrRes")
    } else {
        println("Target $target not found in the array")
    }
    println("======================================")

    val bubbleArray = arrayOf(5, 9, 11, 13, 15, 32, 1, 62)
    val sortedBubArr = bubbleSort(bubbleArray)
    print("Sorted bubble array: ")
    for(element in sortedBubArr) {
        print(element)
        print(',')
    }
    println()
    println("======================================")

    val selectionArray = intArrayOf(3, 4, 6, 12, 34, 28)
    print("Sorted selection array: ")
    for(element in selectionArray) {
        print(element)
        print(',')
    }
    println()
    println("======================================")

    val insertionArray = arrayOf(3, 4, 6, 12, 34, 28)
    print("Sorted insertion array: ")
    for(element in insertionArray) {
        print(element)
        print(',')
    }
    println()
    println("======================================")

    val mergeArray = intArrayOf(3, 4, 6, 12, 34, 28)
    print("Sorted merge array: ")
    for(element in mergeArray) {
        print(element)
        print(',')
    }
    println()
    println("======================================")
}