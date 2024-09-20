import kotlin.random.Random

fun main() {

//    Одномерный массив

//    var Marks = IntArray(Random.nextInt(5, 10)) {
//        Random.nextInt(-10, 10)
//    }
//    var positive: Int = 0
//    var negative: Int = 0
//    for (i in Marks) {
//        if (i >= 0) {
//            positive++
//        } else {
//            negative++
//        }
//    }
//
//    println("Количество отрицательных чисел: $negative")
//    println("Количество положительных чисел: $positive")

//    Двумерный массив

    val rows:Int = Random.nextInt(5, 20)
    val columns:Int = Random.nextInt(5, 20)

    val matrix: Array<IntArray> = Array(rows) { IntArray(columns) { (Random.nextInt(10, 20)) } }
    for (i in matrix) {
        for (j in i) {
            print("$j ".padEnd(3))
        }
        println()
    }
    println()

    val oddNumbers = matrix[4].filter { i -> i % 2 != 0 }
    val odd: Float = oddNumbers.sum().toFloat() / oddNumbers.size.toFloat()
    println("Среднее арифметическое нечетных чисел из 5 строки: $odd")

    val column = matrix.map { row -> row[3] }
    val filteredColumn = column.filter { it % 4 == 0 }
    if (filteredColumn.isEmpty()) {
        println("Не удалось найти числа кратные 4")
        return
    }
    val arithmeticMean = filteredColumn.sum().toFloat() / filteredColumn.size.toFloat()
    println("Среднее арифметическое столбца 4 кратный 4: $arithmeticMean")
}