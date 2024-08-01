
package org.example

fun main() {
    /**-----Example 01-----*/
    // Использование toSet()
    // Метод toSet() преобразует массив в множество (Set), которое автоматически удаляет дубликаты.
    // При этом порядок элементов сохраняется, если используется LinkedHashSet (что происходит по умолчанию при вызове toSet() на массиве).
    // Однако в результатах порядок может измениться, если используется обычный HashSet.
    val myArray = arrayOf(1, 1, 2, 3, 4, 5, 5, 4, 3, 2)

    // Преобразуем массив в множество, чтобы удалить дубликаты
    val uniqueSet = myArray.toSet()

    // Выводим множество в строку, элементы разделяются запятыми
    println(uniqueSet.joinToString()) // InConsole: 1, 2, 3, 4, 5

    // Преобразуем множество обратно в массив, если необходимо
    val uniqueArray = uniqueSet.toIntArray()
    println(uniqueArray.joinToString()) // InConsole: 1, 2, 3, 4, 5

    /**-----Example 02-----*/
    // Использование toHashSet()
    // Метод toHashSet() также удаляет дубликаты, но при этом порядок элементов не гарантируется. Результат будет представлен в виде HashSet.
    val myArrayAltA = arrayOf(1, 1, 2, 3, 4, 5, 5, 4, 3, 2)

    // Преобразуем массив в HashSet, чтобы удалить дубликаты
    val uniqueHashSet = myArrayAltA.toHashSet()

    // Выводим HashSet в строку, порядок элементов может быть не гарантирован
    println(uniqueHashSet.joinToString()) // Результат может быть в разном порядке, например: 1, 2, 3, 4, 5

    /**-----Example 03-----*/
    // Использование toMutableSet()
    // Метод toMutableSet() создает изменяемое множество (MutableSet), где порядок элементов сохраняется.
    val myArrayAltB = arrayOf(1, 1, 2, 3, 4, 5, 5, 4, 3, 2)

    // Преобразуем массив в MutableSet, чтобы удалить дубликаты
    val uniqueMutableSet = myArrayAltB.toMutableSet()

    // Выводим MutableSet в строку
    println(uniqueMutableSet.joinToString()) // InConsole: 1, 2, 3, 4, 5

    /**-----Example 04-----*/
    //  Использование distinct()
    // Самый простой способ удалить дубликаты — использовать метод distinct(), который возвращает новый список без дубликатов.
    val myArrayAltC = arrayOf(1, 1, 2, 3, 4, 5, 5, 4, 3, 2)

    // Используем distinct() для удаления дубликатов
    val newArray = myArrayAltC.distinct()

    // Выводим результирующий список
    println(newArray.joinToString()) // InConsole: 1, 2, 3, 4, 5
}