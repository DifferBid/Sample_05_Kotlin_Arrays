
package org.example

fun main() {
    /**-----Example 01-----*/
    // Использование mapNotNull() со списком строк
    // Рассмотрим пример, где мы работаем со списком строк, некоторые из которых равны null:
    val list = listOf("Барсик", null, "Васька", null, "Мурзик")
    val destination = list.mapNotNull { it?.length }
    println(destination) // InConsole: [6, 6, 6]
    // В этом примере mapNotNull() применяется к списку list, содержащему строки и null значения.
    // Лямбда-выражение { it?.length } возвращает длину строки или null, если элемент сам null.
    // Однако, mapNotNull() автоматически исключает null значения из итогового списка destination, оставляя только длины непустых строк.

    /**-----Example 02-----*/
    // Использование mapNotNull() с множеством
    val set = setOf("Барсик", null, "Васька", null, "Мурзик")
    val newSet = set.mapNotNull { it?.last() }
    println(newSet) // InConsole: [к, а, к]
    // Здесь mapNotNull() применяется к множеству строк set. Лямбда-выражение { it?.last() } возвращает последний символ строки или null,
    // если элемент сам null. Результат newSet содержит только последние символы непустых строк, без null значений.

    /**-----Example 03-----*/
    // Использование mapIndexedNotNull()
    // Аналогично, существует функция mapIndexedNotNull(), которая, помимо элемента, также предоставляет индекс.
    // Она полезна, когда нужно использовать индексы элементов в процессе преобразования.
    val listAltQ = listOf("Барсик", null, "Васька", null, "Мурзик")
    val destinationIndexed = listAltQ.mapIndexedNotNull { index, value ->
        value?.let { "$index: ${it.length}" }
    }
    println(destinationIndexed) // InConsole: [0: 6, 2: 6, 4: 6]
    // В этом примере mapIndexedNotNull() используется для перебора списка с индексами.
    // Лямбда-выражение возвращает строку, содержащую индекс и длину строки, только если строка не равна null.
    // Результат содержит только строки с индексами и длинами непустых строк.
}

