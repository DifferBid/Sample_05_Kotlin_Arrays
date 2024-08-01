
package org.example

import kotlin.random.Random

fun main() {

    /**-----Example 01-----*/
    // Использование Math.random() (Java-style):
    val dogs = arrayOf("Клык", "Бутуз", "Герда", "Рыжик", "Персик")
    val arraySize = dogs.size

    // Генерируем случайное число от 0 до почти 1 и умножаем на размер массива.
    // Получаем случайный индекс от 0 до (arraySize - 1).
    val rand = (Math.random() * arraySize).toInt()
    println(rand)

    // Используем полученный индекс для выбора случайной строки из массива.
    val name = "${dogs[rand]}"
    println(name)
    // КАК ЭТО РАБОТАЕТ:
    // Math.random() генерирует случайное число от 0 (включительно) до 1 (исключительно).
    // Умножив это число на размер массива (arraySize), получаем случайное число в диапазоне от 0 до arraySize (не включая arraySize).
    // toInt() преобразует дробное число в целое, что дает случайный индекс массива.
    // Затем по этому индексу выбирается случайная строка из массива dogs.

    /**-----Example 02-----*/
    // Использование класса Random (Kotlin-style):
    val arraySizeAltA = dogs.size

    // Генерируем случайное число от 0 до arraySize (не включая arraySize) с помощью Random.nextInt
    val randAltA = Random.nextInt(arraySizeAltA)
    println(randAltA)
    // Используем полученный индекс для выбора случайной строки из массива.
    val nameAltA = "${dogs[randAltA]}"
    println(nameAltA)
    // КАК ЭТО РАБОТАЕТ:
    // В Kotlin есть встроенный класс Random, который предоставляет методы для генерации случайных чисел.
    // Random.nextInt(arraySizeAltA) генерирует случайное число от 0 до arraySizeAltA (не включая arraySizeAltA).
    // Этот метод удобен и предпочтителен, так как он более читаем и явно указывает на использование генерации случайных чисел.

    /**-----Example 03-----*/
    // Пример функции для выбора случайного элемента из массива:
    val options = arrayOf("Камень", "Ножницы", "Бумага")
    val choice = getChoice(options)
    println(choice)
    // КАК ЭТО РАБОТАЕТ:
    // Функция getChoice принимает массив строк optionsParam и возвращает случайный элемент из этого массива.
    // Внутри функции используется Random.nextInt(optionsParam.size), чтобы получить случайный индекс и выбрать элемент из массива.
    // Это отличный способ выбрать случайное значение для игры "Камень, Ножницы, Бумага".
}

private fun getChoice(optionsParam: Array<String>): String {
    // Возвращаем случайный элемент из массива, используя Random.nextInt для выбора индекса
    return optionsParam[Random.nextInt(optionsParam.size)]
}