
package org.example

fun main() {

    /**-----Example 01-----*/
    // пример использования mapIndexed() на простом списке чисел:
    val list = listOf(8, 4, 2)
    val destination = list.mapIndexed { index, value -> "$index: $value" }
    println(destination.toString()) // // InConsole: [0: 8, 1: 4, 2: 2]
    // КАК ЭТО РАБОТАЕТ:
    // В этом примере функция mapIndexed() принимает лямбда-выражение,
    // в котором два параметра: index (индекс элемента) и value (значение элемента).
    // Внутри лямбда-выражения мы создаем строку, которая объединяет индекс и значение, и возвращаем этот результат.
    // В итоге получается новый список строк, каждая из которых содержит индекс и значение соответствующего элемента из исходного списка.

    /**-----Example 02-----*/
    // Теперь рассмотрим пример с более сложными объектами, например, классом DogAltD:
    val dogs = listOf(
        DogAltD("Buddy", 3),
        DogAltD("Max", 5),
        DogAltD("Charlie", 2)
    )

    val result = dogs.mapIndexed { index, dog -> "Dog $index: ${dog.name}, age ${dog.age}" }
    println(result.toString()) // InConsole: [Dog 0: Buddy, age 3, Dog 1: Max, age 5, Dog 2: Charlie, age 2]
    // ИТОГ: В этом примере мы используем mapIndexed() для перебора списка объектов Dog. Для каждого объекта мы создаем строку, которая содержит индекс объекта в списке, его имя и возраст.
    // Результат сохраняется в новом списке строк.
}

data class DogAltD(val name: String, val age: Int)