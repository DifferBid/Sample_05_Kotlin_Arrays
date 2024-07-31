
package org.example

fun main() {
    /**-----Example 01-----*/
    // Рассмотрим пример, где мы используем average() для вычисления среднего значения чисел в массиве:
    val array = arrayOf(1, 3, 5) // Создаем массив из целых чисел
    println(array.average()) // InConsole: 3.0
    // В этом примере массив array содержит числа 1, 3 и 5. Функция average() вычисляет среднее значение этих чисел, которое равно 3.0.

    // Особенности
    // Возвращаемое значение: Функция average() всегда возвращает значение типа Double, даже если массив состоит из целых чисел. Это позволяет избежать проблем с округлением при делении.
    // Пустой массив: Если массив пуст, average() возвращает NaN (Not-a-Number).

    /**-----Example 02-----*/
    // Пример для пустого массива
    val emptyArray = arrayOf<Int>() // Пустой массив целых чисел
    println(emptyArray.average()) // InConsole: NaN
    // Этот пример показывает, что вызов average() на пустом массиве возвращает NaN.

    /**-----Example 03-----*/
    // Использование с другими типами массивов
    // Функция average() также может быть использована с другими типами массивов, такими как DoubleArray, FloatArray, LongArray и т.д.
    // Пример с массивом типа Double:
    val doubleArray = doubleArrayOf(1.0, 2.5, 3.5)
    println(doubleArray.average()) // InConsole: 2.3333333333333335
    // В этом примере массив doubleArray содержит числа с плавающей точкой, и функция average() корректно вычисляет среднее значение этих чисел.


}