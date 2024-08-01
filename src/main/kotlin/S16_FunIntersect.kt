
package org.example

import java.util.*

fun main() {

    /**-----Example 01-----*/
    // Объявление первого массива с числами
    val firstArray = arrayOf(1, 2, 3, 4, 5)
    // Объявление второго массива с числами
    val secondArray = arrayOf(3, 5, 6, 7, 8)

    // Преобразуем второй массив (secondArray) в список с помощью метода toList()
    // Это позволяет использовать методы коллекций, такие как intersect
    val secondList = secondArray.toList()

    // Преобразуем список secondList в набор (Set) с помощью метода toSet()
    // Это делается для устранения возможных дубликатов в secondList,
    // так как Set автоматически удаляет дубликаты
    val secondSet = secondList.toSet()

    // Находим пересечение (общие элементы) между первым массивом (firstArray)
    // и набором (secondSet), используя метод intersect. Этот метод
    // возвращает Set с общими элементами.
    val intersectedSet = firstArray.intersect(secondSet)

    // Преобразуем Set (intersectedSet) обратно в массив целых чисел (IntArray),
    // используя метод toIntArray(), чтобы получить результат в виде массива.
    val intersectedArray = intersectedSet.toIntArray()

    // Используем функцию intersect для нахождения пересечения элементов массивов
    // Преобразуем второй массив в список, чтобы использовать функцию intersect
    val intersectedArrayAltA = firstArray.intersect(secondArray.toList().toSet()).toIntArray()

    // Печатаем массив с общими элементами
    // println(Arrays.toString(intersectedArray)) // InConsole: [3, 5]
    println(intersectedArrayAltA.contentToString()) // InConsole: [3, 5]
    println(intersectedArray.contentToString()) // InConsole: [3, 5]

    // КАК ЭТО РАБОТАЕТ:
    // secondArray.toList() - Преобразует массив secondArray в список List. Это необходимо, потому что метод intersect() работает с коллекциями, а массивы в Kotlin не поддерживают методы коллекций напрямую.
    // secondList.toSet() - Преобразует список secondList в набор Set, что помогает удалить возможные дубликаты из списка. Набор (Set) в Kotlin - это структура данных, которая хранит только уникальные элементы.
    // firstArray.intersect(secondSet) - Находит пересечение между массивом firstArray и набором secondSet. Возвращает набор (Set) с элементами, которые присутствуют в обеих коллекциях.
    // intersectedSet.toIntArray() - Преобразует результат пересечения (набор) обратно в массив целых чисел (IntArray), так как начальные данные были в виде массивов.

    // ИТОГ: Этот код позволяет эффективно находить общие элементы в двух массивах и возвращать их в виде массива.
}