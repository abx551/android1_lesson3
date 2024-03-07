import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val array = DoubleArray(15)
    for (i in array.indices) {
        array[i] = Random.nextDouble(-100.0, 100.0)
    }
    println("Массив доброных чисел:")
    println(array.joinToString(", "))
    var sun = 0.0
    var sunn = 0

    var guziNiyazowa = false
    for (number in array) {
        if (number < 0) {
            guziNiyazowa = true
        } else if (guziNiyazowa) {
            sun += number
            sunn++
        }
    }

    if (sunn > 0) {
        val niyazoowaGuzi = sun / sunn
        println("Среднее арифметическое положительных чисел, после первого отрицательного: $niyazoowaGuzi")
    } else {
        println("После первого отрицательного числа не было найденно положительных чисел")
    }
}