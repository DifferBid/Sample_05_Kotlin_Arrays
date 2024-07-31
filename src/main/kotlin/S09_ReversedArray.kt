package org.example

import java.util.*

fun main() {

    /**-----Example 01-----*/
    // Рассмотрим пример, где мы создаем массив целых чисел, а затем переворачиваем его с помощью метода reversedArray():
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9) // Создаем массив целых чисел
    val reversedArray = numbers.reversedArray() // Создаем новый массив с элементами в обратном порядке

    // println(Arrays.toString(reversedArray))
    println(reversedArray.contentToString()) // InConsole: [9, 8, 7, 6, 5, 4, 3, 2, 1]

    // КАК ЭТО РАБОТАЕТ:
    // Создание исходного массива: numbers инициализируется с помощью intArrayOf(),
    // что создает массив целых чисел [1, 2, 3, 4, 5, 6, 7, 8, 9].
    // Переворачивание массива: Метод reversedArray() вызывается в массиве numbers, создавая новый массив reversedArray, содержащий те же элементы, но в обратном порядке [9, 8, 7, 6, 5, 4, 3, 2, 1].
    // Вывод результата: Для вывода элементов массива в удобном формате используется contentToString().
    // Этот метод преобразует массив в строку, где элементы разделены запятыми и заключены в квадратные скобки.
}